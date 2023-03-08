/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.LibrarianWorkArea;

import Librarian.Librarian;
import UI.AdminWorkArea.*;
import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import UI.NewJFrame;

/**
 *
 * @author mrunalipawar
 */
public class LibrarianJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManagerJFrame
     */
    
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    private Librarian librarian;
    public LibrarianJFrame() {
        initComponents();
    }
    
     public LibrarianJFrame(ApplicationSystem applicationSystem, UserAccount userAccount, Librarian librarian) {
        initComponents();
        this.setVisible(true);
        this.branch = new Branch();
        this.applicationSystem = applicationSystem;
        this.userAccount = userAccount;
        this.librarian = librarian;
                
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
        AuthorButton = new javax.swing.JButton();
        bookButton = new javax.swing.JButton();
        genreButton = new javax.swing.JButton();
        OrderButton = new javax.swing.JButton();
        magazineButton = new javax.swing.JButton();
        AuthorHeaderjLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        AuthorButton.setText("AUTHOR");
        AuthorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AuthorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 40));

        bookButton.setText("BOOK");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        jPanel2.add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 90, 40));

        genreButton.setText("GENRE");
        genreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreButtonActionPerformed(evt);
            }
        });
        jPanel2.add(genreButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, 40));

        OrderButton.setText("ORDER");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });
        jPanel2.add(OrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, -1, 40));

        magazineButton.setText("MAGAZINE");
        magazineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magazineButtonActionPerformed(evt);
            }
        });
        jPanel2.add(magazineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 100, 40));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - LIBRARIAN ");
        jPanel2.add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jSplitPane1.setTopComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane1.setRightComponent(jPanel3);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new NewJFrame(this.applicationSystem, this.userAccount);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void AuthorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new AuthorManagementJPanel(applicationSystem,this.librarian, userAccount));
    }//GEN-LAST:event_AuthorButtonActionPerformed

    private void genreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new GenreManagementJPanel(applicationSystem,this.librarian,  userAccount));
    }//GEN-LAST:event_genreButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new BookManagementJPanel(applicationSystem, this.librarian, userAccount));
    }//GEN-LAST:event_bookButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new OrderManagementJPanel(applicationSystem,this.librarian, userAccount));
    }//GEN-LAST:event_OrderButtonActionPerformed

    private void magazineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magazineButtonActionPerformed
        // TODO add your handling code here:
         jSplitPane1.setRightComponent(new MagazineManagementJPanel(applicationSystem,this.librarian, userAccount));
    }//GEN-LAST:event_magazineButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AuthorButton;
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JButton OrderButton;
    private javax.swing.JButton bookButton;
    private javax.swing.JButton genreButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton magazineButton;
    // End of variables declaration//GEN-END:variables
}
