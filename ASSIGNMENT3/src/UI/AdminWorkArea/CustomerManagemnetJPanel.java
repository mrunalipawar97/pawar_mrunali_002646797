/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminWorkArea;


import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.UserAccount;
import LibraryAppSystem.UserAccountDirectory;
import Customer.Customer;
import LibraryAppSystem.Branch;
import Role.CustomerRole;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class CustomerManagemnetJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerManagemnetJPanel
     */
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    DefaultTableModel tableModel;
    public CustomerManagemnetJPanel() {
        initComponents();
    }

    CustomerManagemnetJPanel(ApplicationSystem applicationSystem, Branch branch, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.branch = branch;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)customerRecordsJtable.getModel();
        populate();
    }
    

    public void populate() {
        tableModel.setRowCount(0);
        for (Customer c : this.applicationSystem.getCustomerDirectory().getCustomerlist()) {

            UserAccount u = this.applicationSystem.getUserAccountDirectory().findbyId(c.getPersonId());
            Object[] row = new Object[4];
            System.out.println("c.getP id" + c.getPersonId());
                    
            row[0] = c.getPersonId();
            row[1] =c.getName();
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

        nameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        passTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerRecordsJtable = new javax.swing.JTable();
        nameJLabel = new javax.swing.JLabel();
        ageJLabel = new javax.swing.JLabel();
        usernamejLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        AuthorHeaderjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 110, 30));
        add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 110, 30));
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 203, 110, 30));
        add(passTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 263, 110, 30));

        addButton.setText("ADD CUSTOMER");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

        customerRecordsJtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(customerRecordsJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 370, 220));

        nameJLabel.setText("Name");
        add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 80, 40, 30));

        ageJLabel.setText("Age");
        add(ageJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 30));

        usernamejLabel.setText("Username");
        add(usernamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        passwordJLabel.setText("Password");
        add(passwordJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("CUSTOMERS CATELOG");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        UserAccountDirectory ua = this.applicationSystem.getUserAccountDirectory();
        if(ua.accountExists(usernameTextField.getText(), passTextField.getText(), "Customer")) {
            JOptionPane.showMessageDialog(null, "Sorry  credentials are taken");
            
        }else {
            UserAccount user = this.applicationSystem.getUserAccountDirectory().createUserAccount(usernameTextField.getText(), passTextField.getText(), "Customer");
            this.applicationSystem.getCustomerDirectory().createCustomer(user.getAccountId(), ageTextField.getText(), ageTextField.getText());
            populate();
        }
    }//GEN-LAST:event_addButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTable customerRecordsJtable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passTextField;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel usernamejLabel;
    // End of variables declaration//GEN-END:variables
}
