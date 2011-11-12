package Controller.SchedulingSystem;
import java.util.Vector;

import Model.DataModel.Configurator.Configurator;
import Model.InputSystem.InputSystem;
import Model.InputSystem.XMLInputSystem;
import Model.LogginSystem.CompLogginSystem;
import Controller.SchedulingAlgorithmSystem.FCFS;

public class SchedulingSystem {

	private InputSystem inputSystem;
	private Vector<Task> newsList;
	private Vector<Actor> actorsList;
	private Vector<Resource> resourcesList;
	private Vector<Task> finishedList;
	private int numberOfTasks;
	private Actor deliverRes;

	public SchedulingSystem(){
		Vector<Task> newsList;
		Vector<Actor> actorsList;
		Vector<Resource> resourcesList;
		Vector<Task> finishedList = new Vector<Task>();

		Configurator configurator = new Configurator();
		InputSystem inputSystem = new XMLInputSystem(configurator,this);
		
		CompLogginSystem.getInstance(configurator);
				
		newsList = inputSystem.loadNewsList();
		actorsList = inputSystem.loadActorsList();
		resourcesList = inputSystem.loadResourcesList();
		
		inputSystem.updateRelations();

		/*for(int i=0;i<resourcesList.size();i++){
			resourcesList.elementAt(i).print();
			System.out.println("-------------------------------------");
		}
		
		for(int i=0;i<actorsList.size();i++){
			actorsList.elementAt(i).print();
			System.out.println("-------------------------------------");
		}*/
		
		String deliverResId="deliverRes";
		FCFS saReadyList = new FCFS();
		int limitTime = -1;
		Actor deliverRes = new Actor(deliverResId, saReadyList, limitTime, this, 100, 100, null, 100, null);
		deliverRes.setReadyList(newsList);
				
		this.setNewsList(newsList);
		this.setActorsList(actorsList);
		this.setResourcesList(resourcesList);
		this.setFinishedList(finishedList);
		this.setNumberOfTasks(newsList.size());
		this.setInputSystem(inputSystem);
		this.setDeliverRes(deliverRes);
	}

	public void simulate() {
		Vector<Actor> actorsList = getActorsList();
		CompLogginSystem logginSystem = CompLogginSystem.getInstance();
		Actor deliverRes = this.getDeliverRes();
		actorsList.add(0, deliverRes);
		int i = 0;
		int n = actorsList.size();
		while(!scheduleFinished()){
			for(int j=0;j<n;j++)
				actorsList.get(j).exec();
			this.incTime();
			logginSystem.log(i,actorsList);
			i++;
		}
		logginSystem.writeLog();
	}

	private void incTime() {
		Vector<Actor> actorsList = this.getActorsList();
		int n = actorsList.size();
		for(int i=0;i<n;i++){
			Actor actor = actorsList.get(i);
			actor.incTime();
		}
	}

	private boolean scheduleFinished() {
		Vector<Task> finishedList = this.getFinishedList();
		int n = finishedList.size();
		int numberOfTasks = this.getNumberOfTasks();
		if(numberOfTasks==n)
			return true;
		else
			return false;
	}

	public void finishTask(Task currTask) {
		this.getFinishedList().add(currTask);
	}

	public Actor getResource(String name) {
		Vector<Actor> actorsList = this.getActorsList();
		boolean finded = false;
		int i = 0;
		int n = actorsList.size();
		Actor actor = null;
		while(i<n && !finded){
			if(actorsList.get(i).getResId().equals(name)){
				finded = true;
				actor = actorsList.get(i);
			}else
				i++;
		}
		return actor;
	}

	public Vector<Task> getNewsList() {
		return newsList;
	}

	public void setNewsList(Vector<Task> newsList) {
		this.newsList = newsList;
	}

	public Vector<Actor> getActorsList() {
		return actorsList;
	}

	public void setActorsList(Vector<Actor> actorsList) {
		this.actorsList = actorsList;
	}

	public Vector<Task> getFinishedList() {
		return finishedList;
	}

	public void setFinishedList(Vector<Task> finishedList) {
		this.finishedList = finishedList;
	}

	public InputSystem getInputSystem() {
		return inputSystem;
	}

	public void setInputSystem(InputSystem InputSystem) {
		this.inputSystem = InputSystem;
	}

	public int getNumberOfTasks() {
		return numberOfTasks;
	}

	public void setNumberOfTasks(int numberOfTasks) {
		this.numberOfTasks = numberOfTasks;
	}

	public Actor getDeliverRes() {
		return deliverRes;
	}

	public void setDeliverRes(Actor deliverRes) {
		this.deliverRes = deliverRes;
	}
	
	public Vector<Resource> getResourcesList() {
		return resourcesList;
	}

	public void setResourcesList(Vector<Resource> resourcesList) {
		this.resourcesList = resourcesList;
	}

	public static void main(String[] args){
		System.out.println("Loading data...");
		SchedulingSystem schedulingSystem = new SchedulingSystem();
		System.out.println("Simulation started...");
		schedulingSystem.simulate();
		System.out.println("Done.");
	}

}
