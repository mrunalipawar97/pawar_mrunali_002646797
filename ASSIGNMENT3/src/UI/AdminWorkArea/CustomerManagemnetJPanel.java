/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminWorkArea;


import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.UserAccount;
import LibraryAppSystem.UserAccountDirectory;
import Customer.Customer;
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
    DefaultTableModel tableModel;
    public CustomerManagemnetJPanel() {
        initComponents();
    }

    CustomerManagemnetJPanel(ApplicationSystem applicationSystem, UserAccount userAccount) {
        initComponents();
        this.applicationSystem = applicationSystem;
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)Jtable.getModel();
        populate();
    }
    

    public void populate() {
        tableModel.setRowCount(0);
        for (Customer c : this.applicationSystem.getCustomerDirectory().getCustomerlist()) {

            UserAccount u = this.applicationSystem.getUserAccountDirectory().findbyId(c.getPersonId());
            Object[] row = new Object[4];
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
        Jtable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 60, 100, -1));
        add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 110, 100, -1));
        add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 170, 100, -1));
        add(passTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 230, 100, -1));

        addButton.setText("ADD CUSTOMER");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 370, 270));
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
    private javax.swing.JTable Jtable;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
