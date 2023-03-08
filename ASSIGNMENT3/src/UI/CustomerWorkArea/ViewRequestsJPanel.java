/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CustomerWorkArea;

import Customer.Customer;
import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import Services.RentalRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class ViewRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRequestsJPanel
     */
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;

    DefaultTableModel tableModel;
    
  
    ViewRequestsJPanel(ApplicationSystem applicationSystem, Branch branch, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        this.branch = branch;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)viewRequestsTable.getModel();
        populateData();
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
        viewRequestsTable = new javax.swing.JTable();
        returnjButton = new javax.swing.JButton();
        AuthorHeaderjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewRequestsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Id", "Status", "Duration", "Material Type", "Material Name", "Library Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewRequestsTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 590, 250));

        returnjButton.setText("RETURN");
        returnjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnjButtonActionPerformed(evt);
            }
        });
        add(returnjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - CUSTOMER REQUESTS");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 52, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void returnjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow= viewRequestsTable.getSelectedRow();
        if(selectedRow >= 0){
            RentalRequest reqDetails=(RentalRequest) viewRequestsTable.getValueAt(selectedRow, 0);
            String status=reqDetails.getStatus();
            if(status == "Rented"){
                reqDetails.setStatus("Returned");
                reqDetails.getMaterial().setIsAvailablityFlag("Yes");
                JOptionPane.showMessageDialog(null,"Material Returned");
                populateData();
            }
            else{
                JOptionPane.showMessageDialog(null,"Only Materials which are rented can be returned");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select Row");
        }
    }//GEN-LAST:event_returnjButtonActionPerformed

     public void populateData() {
        tableModel.setRowCount(0);
            
            Customer c=this.applicationSystem.getCustomerDirectory().findById(this.userAccount.getAccountId());
            ArrayList<RentalRequest> reqList= c.getMasterRentalRequestDirectory().getOrderlist();
            for(RentalRequest req: reqList){
                Object[] row = new Object[6];
            
                row[0] = req;
                row[1] = req.getStatus();
                row[2] = req.getDuration();
                row[3] = req.getMaterialType();
                row[4] = req.getMaterial().getName();
                row[5]= req.getLibrarian().getLibraryName();
                
                tableModel.addRow(row);
            }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnjButton;
    private javax.swing.JTable viewRequestsTable;
    // End of variables declaration//GEN-END:variables
}
