/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.AdminWorkArea;

import LibraryAppSystem.ApplicationSystem;
import Librarian.Branch;
import LibraryAppSystem.UserAccount;
import UI.NewJFrame;

/**
 *
 * @author mrunalipawar
 */
public class AdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManagerJFrame
     */
    
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    public AdminJFrame() {
        initComponents();
    }
    
     public AdminJFrame(ApplicationSystem applicationSystem,UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        //this.branch = branch;  
        this.userAccount = userAccount;
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        branchlibrarianButton = new javax.swing.JButton();
        addBranchjButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        AuthorHeaderjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        customerButton.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        customerButton.setText("ADD CUSTOMER");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(customerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, 40));

        branchlibrarianButton.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        branchlibrarianButton.setText("ADD EMPLOYEES");
        branchlibrarianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchlibrarianButtonActionPerformed(evt);
            }
        });
        jPanel2.add(branchlibrarianButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 40));

        addBranchjButton.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        addBranchjButton.setText("ADD BRANCH");
        addBranchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchjButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addBranchjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 3, -1, 40));

        jSplitPane1.setTopComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - ADMIN");
        jPanel3.add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jSplitPane1.setRightComponent(jPanel3);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new NewJFrame(this.applicationSystem,  this.userAccount);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void branchlibrarianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchlibrarianButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new BranchManagementJPanel(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_branchlibrarianButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CustomerManagemnetJPanel(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_customerButtonActionPerformed

    private void addBranchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchjButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new BranchJPanel(this.applicationSystem, this.userAccount));
    }//GEN-LAST:event_addBranchjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JButton addBranchjButton;
    private javax.swing.JButton branchlibrarianButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables
}
