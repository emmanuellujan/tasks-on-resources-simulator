package logicLayer.schedulingSystem;

import java.util.Hashtable;
import java.util.Vector;

import logicLayer.schedulingAlgorithmSystem.FCFS;
import logicLayer.schedulingAlgorithmSystem.SchedulingAlgorithm;

public class Actor extends Resource {

	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private int capacity; // Capacity or efficiency
	private String currAction;

	private Task currTask;
	private Vector<Task> intList;
	private Vector<Task> syncIntList;

	private SchedulingAlgorithm saIntList;
	private Vector<Task> readyList;
	private Vector<Task> syncReadyList;

	private SchedulingAlgorithm saReadyList;
	private int busyTime;
	private int time;
	private int limitTime;

	private int maxTasksNumber;

	private Updater updater;

	public Actor(String resId, String type, SchedulingAlgorithm saReadyList,
			int limitTime, SchedulingSystem schedulingSystem, int capacity,
			int maxTaskNumber, Hashtable<String, String> properties,
			int maxRelations, Vector<String> relationsIds, Updater updater) {

		super(resId, type, properties, maxRelations, relationsIds,
				schedulingSystem);

		this.setCurrAction("Nothing");
		this.setCurrTask(null);

		this.setMaxTasksNumber(maxTaskNumber);
		this.setCapacity(capacity);

		Vector<Task> syncIntList = new Vector<Task>();
		this.setSyncIntList(syncIntList);
		Vector<Task> intList = new Vector<Task>();
		this.setIntList(intList);

		FCFS saIntList = new FCFS();
		this.setSaIntList(saIntList);

		Vector<Task> syncReadyList = new Vector<Task>();
		this.setSyncReadyList(syncReadyList);
		Vector<Task> readylist = new Vector<Task>();
		this.setReadyList(readylist);
		this.setSaReadyList(saReadyList);

		this.setBusyTime(0);
		this.setTime(0);
		this.setLimitTime(limitTime);
		this.setUpdater(updater);
	}

	public void addIntList(Task currTask, String workUnit) {
		SchedulingSystem schedulingSystem = this.getSchedulingSystem();
		Actor actor = schedulingSystem.getResource(workUnit);
		Vector<Task> syncIntList = actor.getSyncIntList();

		int n = 0;
		if (actor.getReadyList() != null)
			n += actor.getReadyList().size();
		if (actor.getSyncReadyList() != null)
			n = actor.getSyncReadyList().size();
		if (actor.getIntList() != null)
			n += actor.getIntList().size();
		if (actor.getSyncIntList() != null)
			n += actor.getSyncIntList().size();
		if (actor.getCurrTask() != null)
			n += 1;
		if (actor.getMaxTasksNumber() > n)
			syncIntList.add(currTask);
		else {
			String errorMsg = "List size greater than allowed. Task "
					+ currTask.getTaskId()
					+ " can't be added to the interruption list of "
					+ actor.getResId();
			this.getSchedulingSystem().getLogger().addErrorMsg(errorMsg);
		}
	}

	public void addReadyList(Task currTask, String workUnit) {
		SchedulingSystem schedulingSystem = this.getSchedulingSystem();
		Actor actor = schedulingSystem.getResource(workUnit);
		Vector<Task> syncReadyList = actor.getSyncReadyList();

		int n = 0;
		if (actor.getReadyList() != null)
			n += actor.getReadyList().size();
		if (actor.getSyncReadyList() != null)
			n = actor.getSyncReadyList().size();
		if (actor.getIntList() != null)
			n += actor.getIntList().size();
		if (actor.getSyncIntList() != null)
			n += actor.getSyncIntList().size();
		if (actor.getCurrTask() != null)
			n += 1;
		if (actor.getMaxTasksNumber() > n)
			syncReadyList.add(currTask);
		else {
			String errorMsg = "List size greater than allowed. Task "
					+ currTask.getTaskId()
					+ " can't be added to the ready list of "
					+ actor.getResId();
			this.getSchedulingSystem().getLogger().addErrorMsg(errorMsg);
		}
	}

	public void exec() {
		String currAction = this.getCurrAction();
		Task auxTask = null;
		Task currTask = this.getCurrTask();

		Vector<Task> intList = this.getIntList();
		SchedulingAlgorithm saIntList = this.getSaIntList();

		Vector<Task> readyList = this.getReadyList();
		SchedulingAlgorithm saReadyList = this.getSaReadyList();

		int time = this.getTime();
		int limitTime = this.getLimitTime();

		String currResId = this.getResId();

		/* Si no hay una tarea activo */
		if (currTask == null) {
			/* Si el temporizador ha terminado: */
			if (time == limitTime) {
				/* Se reinicia el temporizador. */
				this.resetTime();
				currAction = "Time is up";
				/* Sino, si la lista de interrupciones no está vacía: */
			} else if (intList.size() > 0) {
				/*
				 * Se ejecuta el algoritmo de planeamiento de interrupciones
				 * para elegir una tarea.
				 */
				auxTask = saIntList.schedule(intList);
				/* Se elimina dicha tarea de la lista de interrupciones. */
				intList.remove(auxTask);
				/* La tarea pasa a estado activo. */
				currTask = auxTask;
				String taskId = currTask.getTaskId();
				currAction = "Select an interruption from the interruption list and put that interruption as active. The selected interruption is "
						+ taskId;
				/* Sino, si la lista de listos no está vacía: */
			} else if (readyList.size() > 0) {
				/*
				 * Se ejecuta el algoritmo de planeamiento para elegir una tarea
				 * de la lista de listos.
				 */
				auxTask = saReadyList.schedule(readyList);
				/* Se elimina dicha tarea de la lista de listos. */
				readyList.remove(auxTask);
				/* La tarea pasa a estado activo. */
				currTask = auxTask;
				String taskId = currTask.getTaskId();
				currAction = "Select a task from the ready list and put that task as active. The selected task is "
						+ taskId;
				/* Sino: */
			} else {
				/* No hacer nada */
				currAction = "None";
			}
			/* Sino hay una tarea activa */
		} else {
			/* Si el temporizador ha terminado: */
			if (time == limitTime) {
				currAction = "Time is up";
				/*
				 * Se obtiene la unidad de trabajo (que informa cuál es el
				 * próximo actor que realizará la tarea)
				 */
				String workUnit = currTask.getNext(this);
				/* Si la tarea que se está realizando no es una interrupción: */
				if (!workUnit.contains("int")) {
					/* Se la anexa a la lista de listos (pasa a estado listo). */
					this.addReadyList(currTask, currResId);

					String taskId = currTask.getTaskId();
					currAction += ", the active task " + taskId
							+ " pass to the ready list";
					currTask = null; // Se desaloja la tarea en ejecución.
				}
				/* Se reinicia el temporizador. */
				this.resetTime();
				/* Sino, si la lista de interrupciones no está vacía: */
			} else if (intList.size() > 0) {
				/*
				 * Se ejecuta el algoritmo de planeamiento de interrupciones
				 * para elegir una tarea.
				 */
				auxTask = saIntList.schedule(intList);

				/*
				 * Si la tarea no es una interrupción o bien sí lo es y además
				 * tiene mayor prioridad que la tarea actual
				 */
				if (!currTask.getNext(this).contains("int")
						|| auxTask.getPriority() > currTask.getPriority()) {
					/* Se elimina dicha tarea de la lista de interrupciones. */
					intList.remove(auxTask);
					/*
					 * Se agrega la tarea actual a la lista de listos o a la
					 * lista de interrupciones dependiendo de lo que sea.
					 */
					if (currTask.getCurrent().contains("int")) {
						this.addIntList(currTask, currResId);
						currAction = "Old active task is put in the interruption list.";
					} else {
						this.addReadyList(currTask, currResId);
						currAction = "Old active task is put in the ready list.";
					}
					/* La tarea pasa a estado activo. */
					currTask = auxTask;
					String taskId = currTask.getTaskId();
					currAction = "Select an interruption from the interruption list and put that interruption as active."
							+ " The selected interruption is "
							+ taskId
							+ ". "
							+ currAction;
				} else {
					exec2();
					currAction = this.getCurrAction();
					currTask = this.getCurrTask();
				}
			} else {
				exec2();
				currAction = this.getCurrAction();
				currTask = this.getCurrTask();
			}
		}
		if (!currAction.equals("None"))
			this.incBusyTime();
		this.setCurrAction(currAction);
		this.setCurrTask(currTask);
		this.setIntList(intList);
		this.setReadyList(readyList);
	}

	private void exec2() {
		String currAction = "";
		String resId = this.getResId();
		Task currTask = this.getCurrTask();
		SchedulingSystem schedulingSystem = this.getSchedulingSystem();
		/*
		 * Se obtiene la unidad de trabajo (que informa cuál es el próximo actor
		 * que realizará la tarea)
		 */
		String workUnit = currTask.getNext(this);

		/*
		 * Si el actor actual es el actor de reparto de tareas, o la tarea
		 * falla, o no se cumplen las condiciones de la misma:
		 */
		if (!resId.equals("dealerActor")
				&& (workUnit.equals("fail") || !currTask.evalConditions())) {
			/* Terminar tarea (pasa a estado finalizado). */
			schedulingSystem.finishFailedTask(currTask);
			String taskId = currTask.getTaskId();
			currAction = "The active task " + taskId + " fails";
			currTask = null;
			/* El actor actualiza el grafo si es necesario */
			this.update();
			/* Sino, si la tarea en ejecución ha llegado a su fin: */
		} else if (workUnit.equals("end")) {
			/* Terminar tarea (pasa a estado finalizado). */
			schedulingSystem.finishTask(currTask);
			String taskId = currTask.getTaskId();
			currAction = "The active task " + taskId + " ends";
			currTask = null;
			/* El actor actualiza el grafo si es necesario */
			this.update();
			/*
			 * Sino, si la tarea en ejecución debe continuar siendo realizada
			 * por el actor actual:
			 */
		} else if (workUnit.contains(resId)) {
			/* Ejecutar tarea. */
			currTask.exec();
			currAction = "Procesing active task " + currTask.getTaskId();
			/* Si es una interrupción: */
		} else if (workUnit.contains("int")) {
			/* Se decrementa el contador de programa */
			currTask.decProgramCounter();
			workUnit = workUnit.replace("int_", "");
			/*
			 * Se la anexa a la lista de interrupciones del actor indicado (la
			 * tarea pasa a ser una interrupción y pasa a estado de espera).
			 */
			this.addIntList(currTask, workUnit);
			/* Se desaloja la tarea en ejecución. */
			String taskId = currTask.getTaskId();
			currAction = "The task " + taskId
					+ " pass to the interruption list of the resource "
					+ workUnit;
			currTask = null;
			/*
			 * Sino, si la tarea en ejecución debe continuar realizándose por
			 * otro actor:
			 */
		} else {
			/* Se decrementa el contador de programa */
			currTask.decProgramCounter();
			/*
			 * Se la anexa a la lista de listos del recurso indicado (pasa a
			 * estado de espera).
			 */
			this.addReadyList(currTask, workUnit);
			String taskId = currTask.getTaskId();
			currAction = "The task " + taskId
					+ " pass to the ready list of the resource " + workUnit;
			/* Se desaloja la tarea en ejecución. */
			currTask = null;
		}

		this.setCurrAction(currAction);
		this.setCurrTask(currTask);
	}

	public int getBusyTime() {
		return busyTime;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getCurrAction() {
		return currAction;
	}

	public Task getCurrTask() {
		return currTask;
	}

	public Vector<Task> getIntList() {
		return intList;
	}

	public int getLimitTime() {
		return limitTime;
	}

	public int getMaxTasksNumber() {
		return maxTasksNumber;
	}

	public Vector<Task> getReadyList() {
		return readyList;
	}

	public SchedulingAlgorithm getSaIntList() {
		return saIntList;
	}

	public SchedulingAlgorithm getSaReadyList() {
		return saReadyList;
	}

	public Vector<Task> getSyncIntList() {
		return syncIntList;
	}

	public Vector<Task> getSyncReadyList() {
		return syncReadyList;
	}

	public int getTime() {
		return time;
	}

	public Updater getUpdater() {
		return updater;
	}

	public void incBusyTime() {
		this.busyTime++;
	}

	public void incTime() {
		int time = this.getTime();
		time++;
		this.setTime(time);
		this.syncLists();
	}

	public boolean isInactive() {
		if (this.currAction.equals("None"))
			return true;
		else
			return false;
	}

	public boolean owns(Task t) {
		Task currTask = this.getCurrTask();
		String taskId = t.getTaskId();
		boolean owns = false;

		if (currTask != null && currTask.getTaskId().equals(taskId))
			owns = true;
		else if (searchTaskInList(taskId, this.getReadyList()))
			owns = true;
		else if (searchTaskInList(taskId, this.getSyncReadyList()))
			owns = true;
		else if (searchTaskInList(taskId, this.getIntList()))
			owns = true;
		else if (searchTaskInList(taskId, this.getSyncIntList()))
			owns = true;

		return owns;
	}

	@Override
	public void print() {
		super.print();

		System.out.println("Current task:" + this.getCurrTask());
		System.out.println("Capacity:" + this.getCapacity());
		System.out.println("Limit Time:" + this.getLimitTime());
		System.out.println("Max Tasks Number:" + this.getMaxTasksNumber());

		System.out.println("Ready List Scheduling Algorithm:"
				+ this.getSaReadyList().getId());
		System.out.println("Ready List:");
		Vector<Task> readyList = this.getReadyList();
		int n = readyList.size();
		for (int i = 0; i < n; i++)
			System.out.println("\t" + readyList.elementAt(i).getTaskId());

		System.out.println("Sync Ready List Scheduling Algorithm:"
				+ this.getSaReadyList().getId());
		System.out.println("Sync Ready List:");
		Vector<Task> syncReadyList = this.getSyncReadyList();
		n = syncReadyList.size();
		for (int i = 0; i < n; i++)
			System.out.println("\t" + syncReadyList.elementAt(i).getTaskId());

		System.out.println("Interruption List Scheduling Algorithm:"
				+ this.getSaIntList().getId());
		System.out.println("Interruption List:");
		Vector<Task> intList = this.getIntList();
		n = intList.size();
		for (int i = 0; i < n; i++)
			System.out.println("\t" + intList.elementAt(i).getTaskId());

	}

	@Override
	public void reset() {
		super.reset();
		this.setBusyTime(0);
		this.setTime(0);
		this.setCurrAction("Nothing");
	}

	private void resetTime() {
		int time = this.getTime();
		time = 0;
		this.setTime(time);
	}

	private boolean searchTaskInList(String taskId, Vector<Task> list) {
		int i = 0;
		int n = list.size();
		boolean found = false;
		while (!found && i < n) {
			if (list.elementAt(i).getTaskId().equals(taskId))
				found = true;
			i++;
		}
		return found;
	}

	public void setBusyTime(int busyTime) {
		this.busyTime = busyTime;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setCurrAction(String currAction) {
		this.currAction = currAction;
	}

	public void setCurrTask(Task currTask) {
		this.currTask = currTask;
	}

	public void setIntList(Vector<Task> intList) {
		int n = 0;
		if (this.getReadyList() != null)
			n += this.getReadyList().size();
		if (this.getSyncReadyList() != null)
			n = this.getSyncReadyList().size();
		if (intList != null)
			n += intList.size();
		if (this.getSyncIntList() != null)
			n += this.getSyncIntList().size();
		if (this.getCurrTask() != null)
			n += 1;
		if (this.getMaxTasksNumber() >= n)
			this.intList = intList;
		else {
			String errorMsg = "List size greater than allowed. Interruption list of "
					+ this.getResId() + " can't be inicialized.";
			this.getSchedulingSystem().getLogger().addErrorMsg(errorMsg);
		}
	}

	public void setLimitTime(int limitTime) {
		if (limitTime < 3)
			limitTime = -1;
		this.limitTime = limitTime;
	}

	public void setMaxTasksNumber(int maxTaskNumber) {
		this.maxTasksNumber = maxTaskNumber;
	}

	public void setReadyList(Vector<Task> readyList) {
		int n = 0;
		if (readyList != null)
			n += readyList.size();
		if (this.getSyncReadyList() != null)
			n = this.getSyncReadyList().size();
		if (this.getIntList() != null)
			n += this.getIntList().size();
		if (this.getSyncIntList() != null)
			n += this.getSyncIntList().size();
		if (this.getCurrTask() != null)
			n += 1;
		if (this.getMaxTasksNumber() >= n)
			this.readyList = readyList;
		else {
			String errorMsg = "List size greater than allowed. Ready list of "
					+ this.getResId() + " can't be inicialized.";
			this.getSchedulingSystem().getLogger().addErrorMsg(errorMsg);
		}
	}

	public void setSaIntList(SchedulingAlgorithm saIntList) {
		this.saIntList = saIntList;
	}

	public void setSaReadyList(SchedulingAlgorithm saReadyList) {
		this.saReadyList = saReadyList;
	}

	public void setSyncIntList(Vector<Task> syncIntList) {
		this.syncIntList = syncIntList;
	}

	public void setSyncReadyList(Vector<Task> syncReadyList) {
		this.syncReadyList = syncReadyList;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setUpdater(Updater updater) {
		this.updater = updater;
	}

	private void syncLists() {
		Vector<Task> syncIntList = this.getSyncIntList();
		Vector<Task> intList = this.getIntList();
		Vector<Task> syncReadyList = this.getSyncReadyList();
		Vector<Task> readyList = this.getReadyList();

		intList.addAll(syncIntList);
		syncIntList.removeAllElements();
		readyList.addAll(syncReadyList);
		syncReadyList.removeAllElements();

		this.setSyncIntList(syncIntList);
		this.setIntList(intList);
		this.setSyncReadyList(syncReadyList);
		this.setReadyList(readyList);
	}

	public void update() {
		Updater updater = this.getUpdater();
		if (updater != null) {
			Vector<Resource> allResources = this.getSchedulingSystem()
					.getAllResourcesList();
			int n = allResources.size();
			for (int i = 0; i < n; i++)
				updater.update(allResources.elementAt(i));
		}
	}

}
