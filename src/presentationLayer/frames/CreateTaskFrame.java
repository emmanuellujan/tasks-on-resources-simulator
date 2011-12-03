/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreateTaskFrame.java
 *
 * Created on 11/11/2011, 02:37:28 PM
 */
package presentationLayer.frames;

import java.util.Vector;

import javax.swing.JScrollPane;

import logicLayer.filterSystem.Filter;
import logicLayer.schedulingSystem.Actor;
import logicLayer.schedulingSystem.Resource;
import logicLayer.schedulingSystem.SchedulingSystem;
import logicLayer.schedulingSystem.Task;
import logicLayer.schedulingSystem.Updater;


/**
 * 
 * @author F.Rossi
 */
public class CreateTaskFrame extends javax.swing.JFrame {

	public static CreateTaskFrame getInstance() {
		if (CREATETASKFRAME_INSTANCE == null)
			CREATETASKFRAME_INSTANCE = new CreateTaskFrame();
		return CREATETASKFRAME_INSTANCE;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(CreateTaskFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CreateTaskFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CreateTaskFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CreateTaskFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
			}
		});
	}

	private Task newTask;

	private SchedulingSystem currentSchedulingSystem;

	private Vector<Task> newsList;

	private Vector<Actor> actorsCurrentList;

	private Vector<String> workUnitList;

	private JScrollPane scrollPane;

	private Updater updater;

	private Filter mainFilter;

	private CreateFilterFrame filterFrame;

	private Vector<Resource> resourcesMainList;

	private Vector<Resource> resourcesList;

	private static CreateTaskFrame CREATETASKFRAME_INSTANCE;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;

	private javax.swing.JButton jButton2;

	private javax.swing.JButton jButton3;

	/*
	 * private CreateFilterFrame getFilterFrame(){ return this.filterFrame; }
	 * 
	 * private void setFilterFrame(CreateFilterFrame frame){ this.filterFrame =
	 * frame; }
	 */

	private javax.swing.JButton jButton4;

	private javax.swing.JButton jButton5;

	private javax.swing.JComboBox jComboBox1;

	private javax.swing.JComboBox jComboBox2;

	private javax.swing.JLabel jLabel1;

	private javax.swing.JLabel jLabel2;

	private javax.swing.JLabel jLabel3;

	private javax.swing.JLabel jLabel4;

	private javax.swing.JLabel jLabel5;

	private javax.swing.JLabel jLabel6;

	private javax.swing.JLabel jLabel7;

	private javax.swing.JPanel jPanel1;

	private javax.swing.JPanel jPanel2;

	private javax.swing.JPanel jPanel3;

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;

	// End of variables declaration//GEN-END:variables
	/** Creates new form CreateTaskFrame */
	public CreateTaskFrame() {
		initComponents();
		this.setWorkUnitList(new Vector());
		this.jTextArea1.setLineWrap(true);
		this.jTextArea1.setWrapStyleWord(true);
	}

	public Vector<Actor> getActorsList() {
		return this.actorsCurrentList;
	}

	public Filter getFilter() {
		return this.mainFilter;
	}

	public Vector<Resource> getMainResourcesList() {
		return resourcesMainList;
	}

	public Vector<Task> getNewsList() {
		return newsList;
	}

	public Task getNewTask() {
		return this.newTask;
	}

	public Vector<Resource> getResourcesList() {
		return resourcesList;
	}

	public SchedulingSystem getSchedulingSystem() {
		return this.currentSchedulingSystem;
	}

	public Updater getUpdater() {
		return this.updater;
	}

	private Vector getWorkUnitList() {
		return this.workUnitList;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jButton4 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jLabel5 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Create Task",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Verdana", 1, 11))); // NOI18N

		jLabel1.setText("Priority");

		jLabel2.setText("Difficult");

		jButton1.setText("Create");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Cancel");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Task Filter",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Verdana", 1, 11))); // NOI18N

		jLabel4.setText("Filter creation");

		jButton3.setText("Create");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel6.setText("Filter type");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"ListPropertyFilter", "AndFilter" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel6)
														.addComponent(jLabel4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												153, Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jComboBox2,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																jComboBox2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(jButton3))
										.addContainerGap()));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"List - Work units x cycle",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Verdana", 1, 11))); // NOI18N

		jLabel3.setText("Select actor");

		jButton4.setText("Add to list");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setEditable(false);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jLabel5.setText("List");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(jLabel5))
										.addGap(27, 27, 27)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																242,
																Short.MAX_VALUE)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jComboBox1,
																				0,
																				151,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton4)))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton4))
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jScrollPane1))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGap(38,
																				38,
																				38)
																		.addComponent(
																				jLabel5)))
										.addContainerGap()));

		jLabel7.setText("Create updater");

		jButton5.setText("Create");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								jLabel2))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				166,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField2)
																						.addComponent(
																								jTextField1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								156,
																								Short.MAX_VALUE))
																		.addContainerGap())
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel7)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				161,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				106,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(27,
																				27,
																				27))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jPanel2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jPanel3,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton1)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton2)))
																		.addContainerGap()))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(jButton5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		if ((!this.jTextField1.getText().equals(""))
				&& (!this.jTextField2.getText().equals(""))
				&& (this.getWorkUnitList() != null)
				&& (this.getSchedulingSystem() != null)) {
			Task currentTask = new Task("task"
					+ String.valueOf(this.getNewsList().size()),
					Integer.parseInt(this.jTextField1.getText()),
					this.getWorkUnitList(), null, null, "New",
					Integer.parseInt(this.jTextField2.getText()),
					this.getSchedulingSystem(), this.getFilter(),
					this.getUpdater());
			this.setNewTask(currentTask);
			Vector<Task> currentTaskList = SimulatorFrame.getInstance()
					.getNewsList();
			currentTaskList.add(this.getNewTask());
			SimulatorFrame.getInstance().setNewsList(currentTaskList);
			this.setFieldsValuesEmpty();
			this.setVisible(false);
			SimulatorFrame.getInstance().setLocationRelativeTo(null);
			SimulatorFrame.getInstance().setVisible(true);
		} else {
			NewsFrame.getInstance().setLabel("Some values are empty.");
			NewsFrame.getInstance().setBackFrame("CreateTaskFrame");
			this.setVisible(false);
			NewsFrame.getInstance().setLocationRelativeTo(null);
			NewsFrame.getInstance().setVisible(true);
		}

	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		this.setVisible(false);
		SimulatorFrame.getInstance().setLocationRelativeTo(null);
		SimulatorFrame.getInstance().setVisible(true);
	}// GEN-LAST:event_jButton2ActionPerformed

	/*
	 * Filter creation and adding to the task
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
		// this.setFilterFrame(new CreateFilterFrame());
		CreateFilterFrame filterFrame = new CreateFilterFrame();
		filterFrame.setFilterType((String) this.jComboBox2.getSelectedItem());
		filterFrame.setBackFrame("TaskFrame", this);
		filterFrame.setResourcesList(this.getResourcesList());
		filterFrame.setMainResourcesList(this.getMainResourcesList());
		filterFrame.setFilterFrameStateI(false);
		filterFrame.setFilterFrameStateII(false);
		this.setVisible(false);
		filterFrame.setLocationRelativeTo(null);
		filterFrame.main(null);
		filterFrame.setVisible(true);
	}// GEN-LAST:event_jButton3ActionPerformed

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
		if (this.jComboBox1.getSelectedItem() != null) {
			this.workUnitList.add((String) this.jComboBox1.getSelectedItem());
			this.writeTextArea();
		} else {
			NewsFrame.getInstance().setLabel("No value selected.");
			NewsFrame.getInstance().setBackFrame("CreateTaskFrame");
			NewsFrame.getInstance().setLocationRelativeTo(null);
			this.setVisible(false);
			NewsFrame.getInstance().setVisible(true);
		}
	}// GEN-LAST:event_jButton4ActionPerformed

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
		this.setVisible(false);
		UpdaterFrame currentUpdater = new UpdaterFrame();
		currentUpdater.setResourcesList(this.getResourcesList());
		currentUpdater.setMainResourcesList(this.getMainResourcesList());
		currentUpdater.setBackFrame(this);
		currentUpdater.setLocationRelativeTo(null);
		currentUpdater.setVisible(true);
		this.setUpdater(new Updater());
		currentUpdater.setUpdater(this.getUpdater());
		currentUpdater.main(null);
	}// GEN-LAST:event_jButton5ActionPerformed

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jComboBox2ActionPerformed

	private void setActorCombobox() {
		this.jComboBox1.removeAllItems();
		for (int i = 0; i < this.getActorsList().size(); i++) {
			this.jComboBox1.addItem(this.getActorsList().elementAt(i)
					.getResId());
		}
	}

	public void setActorsList(Vector<Actor> currentActors) {
		this.actorsCurrentList = currentActors;
		this.setActorCombobox();
	}

	private void setFieldsValuesEmpty() {
		this.jTextField1.setText(null);
		this.jTextField2.setText(null);
		this.setFilter(null);
		this.setUpdater(null);
		this.setWorkUnitList(new Vector());
		this.jTextArea1.setText("");
	}

	public void setFilter(Filter selectedFilter) {
		this.mainFilter = selectedFilter;
	}

	public void setMainResourcesList(Vector<Resource> resourcesPrincipalList) {
		this.resourcesMainList = resourcesPrincipalList;
	}

	public void setNewsList(Vector<Task> newsList) {
		this.newsList = newsList;
	}

	public void setNewTask(Task task) {
		this.newTask = task;
	}

	public void setResourcesList(Vector<Resource> resourcesList) {
		this.resourcesList = resourcesList;
	}

	public void setSchedulingSystem(SchedulingSystem schedulingSystem) {
		this.currentSchedulingSystem = schedulingSystem;
	}

	public void setUpdater(Updater updater) {
		this.updater = updater;
	}

	private void setWorkUnitList(Vector currentList) {
		this.workUnitList = currentList;
	}

	private void writeTextArea() {
		this.jTextArea1.setText(null);
		for (int i = 0; i < this.getWorkUnitList().size(); i++) {
			if (i == 0)
				this.jTextArea1.append((String) this.getWorkUnitList()
						.elementAt(i));
			else
				this.jTextArea1.append(" - "
						+ (String) this.getWorkUnitList().elementAt(i));
		}

	}
}
