/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LibrarianWorkArea;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import Services.RentalRequest;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class OrderManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderManagementJPanel
     */
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    DefaultTableModel tableModel;
    public OrderManagementJPanel() {
        initComponents();
    }

    OrderManagementJPanel(ApplicationSystem applicationSystem, Branch branch, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.branch = branch;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel) orderRequestTable.getModel();
        populateRentalRequestOrder();
    }
    
    public void populateRentalRequestOrder() {
        tableModel.setRowCount(0);
        for (RentalRequest o : this.applicationSystem.getRentalRequestDirectory().getOrderlist()){
  
            Object [] row = new Object[4];
            
            row[0] = o;
            row[1] = o.getCustomer().getName();
            row[2] = o.getLibrarian().getName();
            row[3] = o.getStatus();
            tableModel.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderRequestTable = new javax.swing.JTable();
        rejectButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();
        AuthorHeaderjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer", "Material", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderRequestTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 180));

        rejectButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        rejectButton.setText("REJECT REQUEST");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });
        add(rejectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 160, 40));

        acceptButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        acceptButton.setText("ACCEPT REQUEST");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        add(acceptButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 160, 40));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - LIBRARIAN ORDER PORTAL");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = orderRequestTable.getSelectedRow();
        RentalRequest o = (RentalRequest) orderRequestTable.getValueAt(selectedRow, 0);
        o.setStatus("REJECTED");
        populateRentalRequestOrder();

    }//GEN-LAST:event_rejectButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = orderRequestTable.getSelectedRow();
        RentalRequest o = (RentalRequest) orderRequestTable.getValueAt(selectedRow, 0);
        o.setStatus("ACCEPTED");
        populateRentalRequestOrder();
    }//GEN-LAST:event_acceptButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JButton acceptButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderRequestTable;
    private javax.swing.JButton rejectButton;
    // End of variables declaration//GEN-END:variables
}
