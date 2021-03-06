/*
 * RelationFrame.java
 *
 * Created on 13/11/2011, 09:02:06 PM
 */
package presentationLayer.frames;

import java.util.Vector;

import logicLayer.schedulingSystem.Actor;
import logicLayer.schedulingSystem.Resource;

/**
 * 
 * @author F.Rossi
 */
public class RelationFrame extends javax.swing.JFrame {

	public static RelationFrame getInstance() {
		if (RELATIONFRAME_INSTANCE == null)
			RELATIONFRAME_INSTANCE = new RelationFrame();
		return RELATIONFRAME_INSTANCE;
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
			java.util.logging.Logger.getLogger(RelationFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(RelationFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(RelationFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(RelationFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new RelationFrame().setVisible(true);
			}
		});
	}

	private Vector<Actor> actorsList;

	private Vector<Resource> resourcesList;

	private Vector<Resource> resourcesMainList;

	private Vector<String> relations;

	private static RelationFrame RELATIONFRAME_INSTANCE;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;

	private javax.swing.JButton jButton2;

	private javax.swing.JComboBox jComboBox1;

	private javax.swing.JComboBox jComboBox2;

	private javax.swing.JLabel jLabel1;

	private javax.swing.JLabel jLabel2;

	private javax.swing.JPanel jPanel1;

	private javax.swing.JPanel jPanel14;

	private javax.swing.JScrollPane jScrollPane2;

	private javax.swing.JTextArea jTextArea2;

	// End of variables declaration//GEN-END:variables

	/** Creates new form RelationFrame */
	public RelationFrame() {
		initComponents();
		this.relations = new Vector<String>();
		this.jTextArea2.setLineWrap(true);
		this.jTextArea2.setWrapStyleWord(true);
		this.setResizable(false);
	}

	public Vector<Actor> getActorsList() {
		return actorsList;
	}

	public Vector<Resource> getMainResourcesList() {
		return resourcesMainList;
	}

	public Vector<String> getRelationsList() {
		return this.relations;
	}

	public Vector<Resource> getResourcesList() {
		return resourcesList;
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
		jComboBox1 = new javax.swing.JComboBox();
		jComboBox2 = new javax.swing.JComboBox();
		jButton1 = new javax.swing.JButton();
		jPanel14 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Set Relation",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Verdana", 1, 11))); // NOI18N

		jLabel1.setText("Primary Resource ");

		jLabel2.setText("Secondary Resource");

		jButton1.setText("Create Relation");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
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
														.addComponent(jLabel2)
														.addComponent(jLabel1))
										.addGap(146, 146, 146)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																148,
																Short.MAX_VALUE)
														.addComponent(
																jComboBox2, 0,
																148,
																Short.MAX_VALUE)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																148,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));
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
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jComboBox1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel1))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(25,
																				25,
																				25)
																		.addComponent(
																				jLabel2)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton1)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Current Relations",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Verdana", 1, 11))); // NOI18N

		jTextArea2.setColumns(20);
		jTextArea2.setEditable(false);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jButton2.setText("Back");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(
				jPanel14);
		jPanel14.setLayout(jPanel14Layout);
		jPanel14Layout
				.setHorizontalGroup(jPanel14Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel14Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel14Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																393,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.Alignment.TRAILING))
										.addContainerGap()));
		jPanel14Layout
				.setVerticalGroup(jPanel14Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel14Layout
										.createSequentialGroup()
										.addComponent(jScrollPane2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton2)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jPanel14,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										127,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel14,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void insertUpdateResource(Resource updatedResource) {
		for (int i = 0; i < SimulatorFrame.getInstance().getActorsList().size(); i++) {
			if (updatedResource.getResId().equals(
					SimulatorFrame.getInstance().getActorsList().elementAt(i)
							.getResId())) {
				SimulatorFrame.getInstance().getActorsList()
						.setElementAt((Actor) updatedResource, i);
			}
		}
		for (int i = 0; i < SimulatorFrame.getInstance().getResourcesList()
				.size(); i++) {
			if (updatedResource.getResId().equals(
					SimulatorFrame.getInstance().getResourcesList()
							.elementAt(i).getResId())) {
				SimulatorFrame.getInstance().getResourcesList()
						.setElementAt(updatedResource, i);
			}
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		if ((this.jComboBox1.getSelectedItem() != null)
				&& (this.jComboBox2.getSelectedItem() != null)) {
			if (!this.jComboBox1.getSelectedItem().equals(
					this.jComboBox2.getSelectedItem())) {
				Resource mainElement = searchListResource(this.jComboBox1
						.getSelectedItem().toString());
				Resource secondaryElement = searchListResource(this.jComboBox2
						.getSelectedItem().toString());
				/* Setea el nuevo recurso con la relacion incorporada */
				Vector<String> newRelationList = new Vector<String>();
				if (mainElement.getResourceMaxLimit() >= (newRelationList
						.size() + 1)) {
					if (mainElement.getRelationsIds() != null)
						newRelationList.addAll(mainElement.getRelationsIds());

					newRelationList.add(this.jComboBox2.getSelectedItem()
							.toString());
					mainElement.addRelation(secondaryElement);
					mainElement.setRelationsIds(newRelationList);
					/*
					 * Actualiza las listas del main con este recurso
					 * actualizado
					 */
					this.insertUpdateResource(mainElement);
					/* Actualizo panel y vector de relaciones */
					String newRelationText;
					if (this.getRelationsList().isEmpty()) {
						newRelationText = "Recurso: "
								+ this.jComboBox1.getSelectedItem().toString()
								+ " se relaciona con recurso: "
								+ this.jComboBox2.getSelectedItem().toString();
					} else {
						newRelationText = " - Recurso: "
								+ this.jComboBox1.getSelectedItem().toString()
								+ " se relaciona con recurso: "
								+ this.jComboBox2.getSelectedItem().toString();
					}
					this.relations.add(newRelationText);
					this.writeTextArea();
				} else {
					ErrorFrame
							.getInstance()
							.setLabel(
									"No relationship can be incorporated to overcome the limit allowed.");
					ErrorFrame.getInstance().setBackFrame("RelationFrame");
					ErrorFrame.getInstance().setLocationRelativeTo(null);
					this.setVisible(false);
					ErrorFrame.getInstance().setVisible(true);

				}
			} else {
				NewsFrame.getInstance().setLabel(
						"Both values are the same, must be different.");
				NewsFrame.getInstance().setBackFrame("RelationFrame");
				NewsFrame.getInstance().setLocationRelativeTo(null);
				this.setVisible(false);
				NewsFrame.getInstance().setVisible(true);
			}
		} else {
			NewsFrame.getInstance().setLabel("Empty fields.");
			NewsFrame.getInstance().setBackFrame("RelationFrame");
			NewsFrame.getInstance().setLocationRelativeTo(null);
			this.setVisible(false);
			NewsFrame.getInstance().setVisible(true);
		}
	}// GEN-LAST:event_jButton1ActionPerformed

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		this.setVisible(false);
		SimulatorFrame.getInstance().setLocationRelativeTo(null);
		SimulatorFrame.getInstance().setVisible(true);
	}// GEN-LAST:event_jButton2ActionPerformed

	private Resource searchListResource(String id) {
		for (int i = 0; i < this.getMainResourcesList().size(); i++) {
			if (this.getMainResourcesList().elementAt(i).getResId().equals(id))
				return this.getMainResourcesList().elementAt(i);
		}
		return null;
	}

	public void setActorsList(Vector<Actor> actorsList) {
		this.actorsList = actorsList;
		this.setComboboxesValues();
	}

	private void setComboboxesValues() {
		this.jComboBox1.removeAllItems();
		this.jComboBox2.removeAllItems();
		if (this.getMainResourcesList() != null) {
			for (int i = 0; i < this.getMainResourcesList().size(); i++) {
				this.jComboBox1.addItem(this.getMainResourcesList()
						.elementAt(i).getResId());
				this.jComboBox2.addItem(this.getMainResourcesList()
						.elementAt(i).getResId());
			}
		}
	}

	public void setMainResourcesList(Vector<Resource> resourcesPrincipalList) {
		this.resourcesMainList = resourcesPrincipalList;
	}

	public void setRelationsList(Vector<String> newRelations) {
		this.relations = newRelations;
	}

	public void setResourcesList(Vector<Resource> resourcesList) {
		this.resourcesList = resourcesList;
		this.setComboboxesValues();
	}
        
        public void clearTextArea() {
		this.jTextArea2.setText("");	
	}

	public void writeTextArea() {
		this.jTextArea2.setText("");
		for (int i = 0; i < this.getRelationsList().size(); i++) {
			this.jTextArea2.append(this.getRelationsList().elementAt(i));
		}
	}
}
