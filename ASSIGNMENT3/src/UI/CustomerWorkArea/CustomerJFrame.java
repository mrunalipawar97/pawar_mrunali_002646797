/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.CustomerWorkArea;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.UserAccount;
import Customer.Customer;
import LibraryAppSystem.Branch;
import General.Magazine;
import Materials.Material;
import Services.RentalRequest;
import UI.NewJFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class CustomerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerJFrame
     */
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    public CustomerJFrame() {
        initComponents();
    }
    
    public CustomerJFrame(ApplicationSystem applicationSystem, Branch branch, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        this.branch = branch;
        this.userAccount = userAccount;
        selectCustNameJLabel.setText(userAccount.getUsername());
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
        AuthorHeaderjLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        welcomejLabel = new javax.swing.JLabel();
        pastRequestHistoryButton = new javax.swing.JButton();
        orderRequestjButton = new javax.swing.JButton();
        selectCustNameJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - CUSTOMER");
        jPanel2.add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomejLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        welcomejLabel.setText("Welcome ");
        jPanel3.add(welcomejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, 101, 33));

        pastRequestHistoryButton.setText("PAST REQUEST HISTORY");
        pastRequestHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastRequestHistoryButtonActionPerformed(evt);
            }
        });
        jPanel3.add(pastRequestHistoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, 40));

        orderRequestjButton.setText("PLACE ORDER");
        orderRequestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderRequestjButtonActionPerformed(evt);
            }
        });
        jPanel3.add(orderRequestjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 160, 40));

        selectCustNameJLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jPanel3.add(selectCustNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 17, 100, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 860, 677));

        jSplitPane1.setTopComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new NewJFrame(this.applicationSystem, this.branch,this.userAccount);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void pastRequestHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastRequestHistoryButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ViewRequestsJPanel(this.applicationSystem, this.branch, this.userAccount));
    }//GEN-LAST:event_pastRequestHistoryButtonActionPerformed

    private void orderRequestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderRequestjButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CustomerOrderRequestJPanel(this.applicationSystem, this.branch, this.userAccount));

    }//GEN-LAST:event_orderRequestjButtonActionPerformed

    
  
    
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
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new CustomerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton orderRequestjButton;
    private javax.swing.JButton pastRequestHistoryButton;
    private javax.swing.JLabel selectCustNameJLabel;
    private javax.swing.JLabel welcomejLabel;
    // End of variables declaration//GEN-END:variables
}
