/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdaterFrame.java
 *
 * Created on 16/11/2011, 04:59:14 AM
 */
package Gui.Frames;

import Controller.FilterSystem.Filter;
import Controller.SchedulingSystem.Resource;
import Controller.SchedulingSystem.Update;
import Controller.SchedulingSystem.Updater;
import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author F.Rossi
 */
public class UpdaterFrame extends javax.swing.JFrame {

    /** Creates new form UpdaterFrame */
    public UpdaterFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Updater configuration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 11))); // NOI18N

        jLabel1.setText("Add filter");

        jButton3.setText("Create");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Element Equal Filter", "Job Position Filter", "List Property Filter" }));

        jLabel2.setText("Include related update");

        jButton4.setText("Create");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        ((CreateTaskFrame)this.getBackFrame()).setLocationRelativeTo(null);
        ((CreateTaskFrame)this.getBackFrame()).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        UpdateFrame updateFrame = new UpdateFrame();
        updateFrame.setBackFrame(this);
        this.setVisible(false);
        updateFrame.setLocationRelativeTo(null);
        updateFrame.main(null);
        updateFrame.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CreateFilterFrame filterFrame = new CreateFilterFrame();
        filterFrame.setFilterType((String)this.jComboBox1.getSelectedItem());        
        filterFrame.setBackFrame("UpdaterFrame", this);
        filterFrame.setResourcesList(this.getResourcesList());
        filterFrame.setMainResourcesList(this.getMainResourcesList());
        filterFrame.setFilterFrameStateI(false);
        filterFrame.setFilterFrameStateII(false);
        this.setVisible(false);
        filterFrame.setLocationRelativeTo(null);
        filterFrame.main(null);
        filterFrame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Updater currentUpdater = this.getUpdater();
        if((this.getFilter() != null)&&(this.getUpdate() != null)){
            if(currentUpdater.getUpdates() == null){
                Hashtable<Filter, Update> newHash = new Hashtable<Filter, Update>();
                newHash.put(this.getFilter(), this.getUpdate()); 
                currentUpdater.setUpdates(newHash);
            }else
                currentUpdater.getUpdates().put(this.getFilter(), this.getUpdate());       
            this.setUpdater(currentUpdater);                
            ((CreateTaskFrame)this.getBackFrame()).setUpdater(currentUpdater);
            this.setVisible(false);
            ((CreateTaskFrame)this.getBackFrame()).setLocationRelativeTo(null);
            ((CreateTaskFrame)this.getBackFrame()).setVisible(true);
        }else{
            ErrorFrame.getInstance().setLabel("Some values are empty. Cannot create Updater.");
            ErrorFrame.getInstance().setBackFrame("UpdaterFrame");
            this.setVisible(false);
            ErrorFrame.getInstance().setLocationRelativeTo(null);
            ErrorFrame.getInstance().setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdaterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdaterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdaterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdaterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                if (this == null)
                    new UpdaterFrame(); 
            }
        });
    }
    
    public Vector<Resource> getResourcesList() {
        return resourcesList;
    }

    public void setResourcesList(Vector<Resource> resourcesList) {
        this.resourcesList = resourcesList;      
    }
    
    public void setMainResourcesList(Vector resourcesPrincipalList) {
        this.resourcesMainList = resourcesPrincipalList;        
    }
    
    public Vector getMainResourcesList() {
        return this.resourcesMainList;        
    }
    
    public void setBackFrame(Object backFrame) {
        this.filterBackFrame = (CreateTaskFrame)backFrame;            
    }

    public CreateTaskFrame getBackFrame() {
       return this.filterBackFrame;            
    }
    
    public Hashtable<Filter, Update> getUpdates() {
	return updates;
    }

    public void setUpdates(Hashtable<Filter, Update> updates) {
	this.updates = updates;
    }
    
    public Filter getFilter() {
	return this.filter;
    }

    public void setFilter(Filter filter) {
	this.filter = filter;
    }
    
    public Update getUpdate() {
	return this.update;
    }

    public void setUpdate(Update update) {
	this.update = update;
    }
    
    public Updater getUpdater() {
	return this.updater;
    }
    
    public void setUpdater(Updater current) {
	this.updater = current;
    }

    private CreateTaskFrame filterBackFrame;
    private Hashtable<Filter,Update> updates;
    private Vector resourcesMainList;
    private Vector<Resource> resourcesList; 
    private Filter filter;
    private Update update;
    private Updater updater;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
