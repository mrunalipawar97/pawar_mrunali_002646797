/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LibrarianWorkArea;

import LibraryAppSystem.ApplicationSystem;
import Librarian.Branch;
import LibraryAppSystem.UserAccount;
import General.Magazine;
import Librarian.Librarian;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class MagazineManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MagazineManagementJPanel
     */
    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    DefaultTableModel tableModel;
    private Librarian librarian;
    public MagazineManagementJPanel() {
        initComponents();
    }

    MagazineManagementJPanel(ApplicationSystem applicationSystem, UserAccount userAccount,Librarian librarian) {
       
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        //this.branch = branch;
        this.librarian = librarian;     
        this.userAccount= userAccount;
        this.tableModel = (DefaultTableModel)magazineTable.getModel();
        populateMagazineCatelog();
    }

     public void populateMagazineCatelog() {
        tableModel.setRowCount(0);
        for (Magazine m : this.librarian.getMagazineDirectory().getMagazinelist()) {
            Object[] row = new Object[6];
            row[0] = m.getSerialNumber();
            row[1] = m.getName();
            row[2] = m.getRegisteredDate();   
            row[3] = m.getCompanyName();
            row[4] = m.getIssueType();
            row[5] = m.isIsAvailablityFlag();
            
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

        comapnyNamejLabel = new javax.swing.JLabel();
        issueTypejLabel = new javax.swing.JLabel();
        companyNameTextField = new javax.swing.JTextField();
        addMagazineButton = new javax.swing.JButton();
        AuthorHeaderjLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        srNoTextField = new javax.swing.JTextField();
        magazineNameTextField = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        issueTypeComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        magazineTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comapnyNamejLabel.setText("Company Name");
        add(comapnyNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 30));

        issueTypejLabel.setText("Issue Type");
        add(issueTypejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 30));
        add(companyNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 130, 30));

        addMagazineButton.setText("ADD MAGAZINE");
        addMagazineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMagazineButtonActionPerformed(evt);
            }
        });
        add(addMagazineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 30));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("LIBRARY MANAGEMENT SYSTEM - MAGAZINE CATELOG");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 30, 580, -1));

        jLabel1.setText("Serial No");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel2.setText("Magazine Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jLabel3.setText("Date");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 30));
        add(srNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, 30));
        add(magazineNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 130, 30));
        add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, 30));

        issueTypeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weekly", "Fortnightly" }));
        add(issueTypeComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 130, 30));

        magazineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SR NO", "Magazine Name", "Date", "Company Name", "IssueType", "Availibility"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(magazineTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 620, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void addMagazineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMagazineButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        String date = sdf.format(jDateChooser.getDate());

        this.librarian.getMagazineDirectory().createMagazine(Integer.valueOf(srNoTextField.getText()), magazineNameTextField.getText(), date, true, companyNameTextField.getText(), issueTypeComboBox1.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "Magazine Added Successfully.");
        populateMagazineCatelog();
    }//GEN-LAST:event_addMagazineButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JButton addMagazineButton;
    private javax.swing.JLabel comapnyNamejLabel;
    private javax.swing.JTextField companyNameTextField;
    private javax.swing.JComboBox<String> issueTypeComboBox1;
    private javax.swing.JLabel issueTypejLabel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField magazineNameTextField;
    private javax.swing.JTable magazineTable;
    private javax.swing.JTextField srNoTextField;
    // End of variables declaration//GEN-END:variables
}
