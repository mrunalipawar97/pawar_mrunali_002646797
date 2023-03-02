/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.BranchWorkArea;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.UserAccount;
import LibraryAppSystem.UserAccountDirectory;
import Customer.Customer;
import Librarian.Librarian;
import Role.LibrarianRole;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class LibrarianManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LibrarianManagementJPanel
     */
    
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    DefaultTableModel tableModel;
    public LibrarianManagementJPanel() {
        initComponents();
    }
    
    LibrarianManagementJPanel(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)Jtable.getModel();
        populate();
    }
    

    public void populate() {
        tableModel.setRowCount(0);
       for (Librarian l : this.applicationSystem.getLibrarian().getLibrarianlist()) {

            UserAccount u = this.applicationSystem.getUserAccountDirectory().findbyId(l.getPersonId());
            Object[] row = new Object[4];
            row[0] = l.getPersonId();
            row[1] =l.getName();
            row[2] = u.getUsername();
            row[3] = u.getPassword();
     
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

        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();
        employeeIdTextField = new javax.swing.JTextField();
        designationTextField = new javax.swing.JTextField();
        experienceTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        empIdjLabel = new javax.swing.JLabel();
        experiencejLabel = new javax.swing.JLabel();
        designationJLabel = new javax.swing.JLabel();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        AuthorHeaderjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setText("ADD LIBRARIAN");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "USERNAME", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Jtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 370, 270));
        add(employeeIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, 30));
        add(designationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, 30));
        add(experienceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 120, 30));
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 120, 30));
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, 30));

        empIdjLabel.setText("Employee ID");
        add(empIdjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        experiencejLabel.setText("Experience");
        add(experiencejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        designationJLabel.setText("Designation");
        add(designationJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        usernameJLabel.setText("Username");
        add(usernameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        passwordJLabel.setText("Password");
        add(passwordJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 30));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARIAN CATELOG");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        UserAccountDirectory ua = this.applicationSystem.getUserAccountDirectory();
        if(ua.accountExists(usernameTextField.getText(), passwordTextField.getText(), new LibrarianRole())) {
            JOptionPane.showMessageDialog(null, "Sorry  credentials are taken");

        }else {
            UserAccount user = this.applicationSystem.getUserAccountDirectory().createUserAccount(usernameTextField.getText(), passwordTextField.getText(),new LibrarianRole());
           // this.applicationSystem.getLibrarian().createLibrarian(user.getAccountId(), ageTextField.getText(), ageTextField.getText());
            populate();
        }
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JTable Jtable;
    private javax.swing.JButton addButton;
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
