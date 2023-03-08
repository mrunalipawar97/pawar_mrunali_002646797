/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminWorkArea;
import Employees.Employee;
import Librarian.Librarian;
import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import LibraryAppSystem.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class BranchJPanel extends javax.swing.JPanel {

    private ApplicationSystem applicationSystem;
    private UserAccount userAccount;
    private Branch branch;
    DefaultTableModel tableModel;
    /**
     * Creates new form LibrarianJPanel
     */
    public BranchJPanel() {
        initComponents();
    }

    BranchJPanel(ApplicationSystem applicationSystem, Branch branch, UserAccount userAccount) {
        initComponents();
        this.setVisible(true);
        this.applicationSystem = applicationSystem;
        this.branch = branch;
        this.userAccount = userAccount;
        this.tableModel = (DefaultTableModel) branchJTable.getModel();
        populateData();
    }

    public void populateData() {
        
        tableModel.setRowCount(0);
        for(Branch b: this.applicationSystem.getBranchLists()) {
            Librarian librarian = b.getLibrary();
            
            Object[] row = new Object[5];
            
            row[0] = b;
            row[1] = librarian.getLibraryId();
            row[2] = librarian.getLibraryName();
            row[3] = librarian.getLibraryName();
            row[4] = librarian.getLocation();
            
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

        branchNameTextField = new javax.swing.JTextField();
        LibraryNameTextField = new javax.swing.JTextField();
        buildingNoTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        branchJTable = new javax.swing.JTable();
        locationjLabel = new javax.swing.JLabel();
        branchNamejLabel = new javax.swing.JLabel();
        libraryNamejLabel = new javax.swing.JLabel();
        libraryLocationTextField = new javax.swing.JTextField();
        buildingNojLabel = new javax.swing.JLabel();
        deleteBranchButton = new javax.swing.JButton();
        addBranchNameButton = new javax.swing.JButton();
        AuthorHeaderjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(branchNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 120, 30));

        LibraryNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibraryNameTextFieldActionPerformed(evt);
            }
        });
        add(LibraryNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, 30));

        buildingNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildingNoTextFieldActionPerformed(evt);
            }
        });
        add(buildingNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, 30));

        branchJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch Name", "Library Id", "Library Name", "Location", "Building No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(branchJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 550, 180));

        locationjLabel.setText("Location");
        add(locationjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 197, 60, 30));

        branchNamejLabel.setText("Branch Name");
        add(branchNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        libraryNamejLabel.setText("Library Name");
        add(libraryNamejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 157, -1, 20));

        libraryLocationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libraryLocationTextFieldActionPerformed(evt);
            }
        });
        add(libraryLocationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, 30));

        buildingNojLabel.setText("Building No");
        add(buildingNojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 247, -1, 30));

        deleteBranchButton.setText("DELETE BRANCH");
        deleteBranchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBranchButtonActionPerformed(evt);
            }
        });
        add(deleteBranchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 140, 40));

        addBranchNameButton.setText("ADD BRANCH");
        addBranchNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBranchNameButtonActionPerformed(evt);
            }
        });
        add(addBranchNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 40));

        AuthorHeaderjLabel.setFont(new java.awt.Font("Kannada MN", 1, 18)); // NOI18N
        AuthorHeaderjLabel.setText("BRANCH CATELOG");
        add(AuthorHeaderjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 20, 210, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void buildingNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildingNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buildingNoTextFieldActionPerformed

    private void libraryLocationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libraryLocationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_libraryLocationTextFieldActionPerformed

    private void deleteBranchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBranchButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = branchJTable.getSelectedRow();
        if(selectedRow >= 0){
            Branch b = (Branch) branchJTable.getValueAt(selectedRow, 0);
            UserAccountDirectory userAccountDirectory = this.applicationSystem.getUserAccountDirectory();
            ArrayList<Employee> employeeList = b.getLibrary().getEmployeeDirectory().getEmployeeist();
            for(Employee e : employeeList){
                System.out.println(e.getUsername() + "empusername");
                UserAccount u=userAccountDirectory.findByUsername(e.getUsername());
                System.out.println(u.getUsername()+"user");
                userAccountDirectory.removeUser(u);
            }
            this.applicationSystem.removeBranch(b.getBranchName());
            JOptionPane.showMessageDialog(null,"Branch Deleted");
            populateData();
        }
    }//GEN-LAST:event_deleteBranchButtonActionPerformed

    private void LibraryNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibraryNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LibraryNameTextFieldActionPerformed

    private void addBranchNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBranchNameButtonActionPerformed
        // TODO add your handling code here:
        // check for unique branch name
        //this.branch = this.applicationSystem.createBranch(branchNameTextField.getText());

        ArrayList<Branch> branchList= this.applicationSystem.getBranchLists();
        if(this.applicationSystem.branchExists(branchNameTextField.getText())) {
            JOptionPane.showMessageDialog(null, "Branch with this name already available");
        }
        else {
            if(branchList.isEmpty()){
                Branch br= this.applicationSystem.createBranch(branchNameTextField.getText());
                br.createLibrary(LibraryNameTextField.getText(), libraryLocationTextField.getText(), Integer.valueOf(buildingNoTextField.getText()));
                populateData();
            }
            else{
              for(Branch b:branchList){
                if(b.getLibrary().getLocation().equals(libraryLocationTextField.getText())){
                   JOptionPane.showMessageDialog(null, "Branch in this location already available");
                }
                else{
                    Branch br= this.applicationSystem.createBranch(branchNameTextField.getText());
                    br.createLibrary(LibraryNameTextField.getText(), libraryLocationTextField.getText(), Integer.valueOf(buildingNoTextField.getText()));
                    populateData();
                }
              }
            }
            
        }
    }//GEN-LAST:event_addBranchNameButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorHeaderjLabel;
    private javax.swing.JTextField LibraryNameTextField;
    private javax.swing.JButton addBranchNameButton;
    private javax.swing.JTable branchJTable;
    private javax.swing.JTextField branchNameTextField;
    private javax.swing.JLabel branchNamejLabel;
    private javax.swing.JTextField buildingNoTextField;
    private javax.swing.JLabel buildingNojLabel;
    private javax.swing.JButton deleteBranchButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField libraryLocationTextField;
    private javax.swing.JLabel libraryNamejLabel;
    private javax.swing.JLabel locationjLabel;
    // End of variables declaration//GEN-END:variables
}
