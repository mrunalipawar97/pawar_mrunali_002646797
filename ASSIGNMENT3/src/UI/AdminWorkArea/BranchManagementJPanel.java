/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminWorkArea;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import Role.BranchManagerRole;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class BranchManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BranchManagementJPanel
     */
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;

    DefaultTableModel tableModel;
    
    public BranchManagementJPanel() {
        initComponents();
    }

    BranchManagementJPanel(ApplicationSystem applicationSystem,UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)branchManagerJtable.getModel();
        populateBranchManagerCatelog();
    }
    
    public void populateBranchManagerCatelog() {
        tableModel.setRowCount(0);
        for (Branch branch : this.applicationSystem.getBranchLists()) {

           // Employee e = this.applicationSystem.getEmployeeDirectory().findByEmployeeName(branch.getBranchName());
            //UserAccount u = this.applicationSystem.getUserAccountDirectory().findbyId(e.getPersonId());
            Object[] row = new Object[6];
            row[0] = employeeIdTextField.getText();
            row[1] = Double.valueOf(experienceTextField.getText());
            row[2] = designationTextField.getText();
            row[3] = usernameTextField.getText();
            row[4] = passwordTextField.getText();
            row[5] = branchNameTextField.getText();
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

        employeeIdTextField = new javax.swing.JTextField();
        designationTextField = new javax.swing.JTextField();
        addBranchManagerButton = new javax.swing.JButton();
        branchNameTextField = new javax.swing.JTextField();
        addBranchNameButton = new javax.swing.JButton();
        experienceTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        empIdjLabel = new javax.swing.JLabel();
        experiencejLabel = new javax.swing.JLabel();
        designationJLabel = new javax.swing.JLabel();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        branchNameJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        branchManagerJtable = new javax.swing.JTable();
        deleteBranchButton = new javax.swing.JButton();
        AuthorHeaderjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(employeeIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 30));
        add(designationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 120, 30));

        addBranchManagerButton.setText("Add Branch Manager");
        addBranchManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchManagerButtonActionPerformed(evt);
            }
        });
        add(addBranchManagerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 30));
        add(branchNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, 40));

        addBranchNameButton.setText("ADD BRANCH");
        addBranchNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchNameButtonActionPerformed(evt);
            }
        });
        add(addBranchNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 30));
        add(experienceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 120, 30));
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 120, 30));
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 120, 30));

        empIdjLabel.setText("Employee ID");
        add(empIdjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 207, -1, 20));

        experiencejLabel.setText("Experience");
        add(experiencejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        designationJLabel.setText("Designation");
        add(designationJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 307, -1, 20));

        usernameJLabel.setText("Username");
        add(usernameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 357, -1, 20));

        passwordJLabel.setText("Password");
        add(passwordJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 407, -1, 20));

        branchNameJLabel.setText("Branch Name");
        add(branchNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        branchManagerJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Emp ID", "Experience", "Designation", "USERNAME", "PASSWORD", "Branch Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(branchManagerJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 620, 230));

        deleteBranchButton.setText("Delete Branch");
        deleteBranchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBranchButtonActionPerformed(evt);
            }
        });
        add(deleteBranchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, 30));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("BRANCH MANAGER CATELOG");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBranchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBranchButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = branchManagerJtable.getSelectedRow();
                
         if(selectedRow >=0) {
             //we will delete the object
             Branch applicant  = (Branch) branchManagerJtable.getValueAt(selectedRow, 0);
             this.applicationSystem.removeBranch(applicant.getBranchName());
             populateBranchManagerCatelog();
         }  
         else {
             
         }
    }//GEN-LAST:event_deleteBranchButtonActionPerformed

    private void addBranchNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchNameButtonActionPerformed
        // TODO add your handling code here:
        
        // check for unique branch name
        this.branch = this.applicationSystem.createBranch(branchNameTextField.getText());
        
    }//GEN-LAST:event_addBranchNameButtonActionPerformed

    private void addBranchManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchManagerButtonActionPerformed
        // TODO add your handling code here:
        
            if (employeeIdTextField.getText() != "" || experienceTextField.getText() != "" || designationTextField.getText() != "") {
                this.branch.getBranchuseraccountDirectory().createUserAccount(usernameTextField.getText(), passwordTextField.getText(), new BranchManagerRole());
                populateBranchManagerCatelog();
            } else {
                JOptionPane.showMessageDialog(null, "Create a new branch by filling the branch field to add it's branch manager.");
            }
    }//GEN-LAST:event_addBranchManagerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JButton addBranchManagerButton;
    private javax.swing.JButton addBranchNameButton;
    private javax.swing.JTable branchManagerJtable;
    private javax.swing.JLabel branchNameJLabel;
    private javax.swing.JTextField branchNameTextField;
    private javax.swing.JButton deleteBranchButton;
    private javax.swing.JLabel designationJLabel;
    private javax.swing.JTextField designationTextField;
    private javax.swing.JLabel empIdjLabel;
    private javax.swing.JTextField employeeIdTextField;
    private javax.swing.JTextField experienceTextField;
    private javax.swing.JLabel experiencejLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
