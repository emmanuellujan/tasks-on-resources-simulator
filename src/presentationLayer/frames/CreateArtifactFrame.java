/*
 * CreateArtifactFrame.java
 *
 * Created on 11/11/2011, 07:19:19 PM
 */
package presentationLayer.frames;

import java.util.Hashtable;
import java.util.Vector;

import logicLayer.schedulingSystem.Resource;
import logicLayer.schedulingSystem.SchedulingSystem;


/**
 * 
 * @author F.Rossi
 */
// CHECKEAR SCHEDULING SYSTEM EN ENTRADA, FUNCION EN DESARROLLO Y EN CERRAR
// VENTANA CON CREACION
// COMO HAGO PARA MODIFICAR SIEMPRE EL MISMO MAIN FRAME??
public class CreateArtifactFrame extends javax.swing.JFrame {

	public static CreateArtifactFrame getInstance() {
		if (CREATEARTIFACTFRAME_INSTANCE == null)
			CREATEARTIFACTFRAME_INSTANCE = new CreateArtifactFrame();
		return CREATEARTIFACTFRAME_INSTANCE;
	}

	public static boolean isNum(String s) {
		try {
			Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
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
			java.util.logging.Logger.getLogger(
					CreateArtifactFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					CreateArtifactFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					CreateArtifactFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					CreateArtifactFrame.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
			}
		});
	}

	private Resource newResource;

	private Vector<Resource> resourcesList;

	private SchedulingSystem currentSchedulingSystem;

	private static CreateArtifactFrame CREATEARTIFACTFRAME_INSTANCE;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;

	private javax.swing.JButton jButton2;

	private javax.swing.JLabel jLabel1;

	private javax.swing.JPanel jPanel1;

	private javax.swing.JPanel jPanel2;

	private javax.swing.JScrollPane jScrollPane1;

	private javax.swing.JTable jTable1;

	private javax.swing.JTextField jTextField1;

	// End of variables declaration//GEN-END:variables
	/** Creates new form CreateArtifactFrame */
	public CreateArtifactFrame() {
		initComponents();
	}

	private boolean areValidFields() {
		if (!isNum(this.jTextField1.getText()))// Capacity
			return false;

		return true;
	}

	private void clearTable() {
		for (int i = 0; i < this.jTable1.getRowCount(); i++)
			for (int j = 0; j < this.jTable1.getColumnCount(); j++) {
				this.jTable1.setValueAt("", i, j);
			}
	}

	public Vector<Resource> getResourcesList() {
		return resourcesList;
	}

	public SchedulingSystem getSchedulingSystem() {
		return this.currentSchedulingSystem;
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
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Create Artifact",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Verdana", 1, 11))); // NOI18N

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

		jPanel2.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Properties"));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null } },
				new String[] { "Key", "Value" }));
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 365,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout
						.createSequentialGroup()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 92,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		jLabel1.setText("Maximum number of relations");

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
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addGap(2,
																				2,
																				2)
																		.addComponent(
																				jButton2))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				152,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
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
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jPanel2,
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
														.addComponent(jButton2))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/*
	 * Action of 'Create' button, which creates a new Artifact taking the values
	 * of the screen components. Updating Resources list too, and closing the
	 * current panel.
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if (this.areValidFields()) {
			/* Get Properties */
			Hashtable propertiesTable = new Hashtable();

			for (int i = 0; i < this.jTable1.getRowCount(); i++) {
				if ((this.jTable1.getValueAt(i, 0) != null)
						&& (this.jTable1.getValueAt(i, 1) != null)
						&& (!this.jTable1.getValueAt(i, 0).equals(""))
						&& (!this.jTable1.getValueAt(i, 1).equals(""))) {
					propertiesTable.put(this.jTable1.getValueAt(i, 0)
							.toString(), this.jTable1.getValueAt(i, 1)
							.toString());
				} else {
					i = this.jTable1.getRowCount();
				}
			}
			this.newResource = new Resource("artifact"
					+ String.valueOf(this.getResourcesList().size()),
					"artifact", propertiesTable,
					Integer.parseInt(this.jTextField1.getText()), null, null/*
																			 * Scheduling
																			 * System
																			 */);
			this.getResourcesList().add(this.newResource);
			setFieldsValuesEmpty();
			SimulatorFrame.getInstance().setResourcesList(
					this.getResourcesList());
			this.setVisible(false);
			SimulatorFrame.getInstance().setVisible(true);
			SimulatorFrame.getInstance().setLocationRelativeTo(null);
		} else {
			ErrorFrame.getInstance()
					.setLabel("Wrong inserted values in fields");
			ErrorFrame.getInstance().setLocationRelativeTo(null);
			ErrorFrame.getInstance().setVisible(true);
			ErrorFrame.getInstance().setBackFrame("CreateArtifactFrame");
			this.setVisible(false);
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		SimulatorFrame.getInstance().setResourcesList(this.getResourcesList());
		this.setVisible(false);
		SimulatorFrame.getInstance().setLocationRelativeTo(null);
		SimulatorFrame.getInstance().setVisible(true);
	}// GEN-LAST:event_jButton2ActionPerformed

	private void setFieldsValuesEmpty() {
		this.jTextField1.setText(null);
		this.clearTable();
	}

	public void setResourcesList(Vector<Resource> resourcesList) {
		this.resourcesList = resourcesList;
	}

	public void setSchedulingSystem(SchedulingSystem schedulingSystem) {
		this.currentSchedulingSystem = schedulingSystem;
	}
}
