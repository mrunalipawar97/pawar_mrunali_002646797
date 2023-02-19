/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Applicant;
import Model.ApplicantsDirectory;
import Model.Business;
import Model.Vaccine;
import Model.VaccineDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mrunalipawar
 */
public class PetVaccineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignJPanel
     */
    private Business business;
    DefaultTableModel vaccineTableModel;
    public Vaccine selectedVaccine;
    public PetVaccineJPanel() {
        initComponents();
    }

    PetVaccineJPanel(Business business) {
        initComponents();
        this.business = business;
        this.vaccineTableModel = (DefaultTableModel) vaccineDetailsTable.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        petVaccinHeaderLabel = new javax.swing.JLabel();
        courseCompletedLabel = new javax.swing.JLabel();
        courseCompltedTextField = new javax.swing.JTextField();
        vaccineNameTextField = new javax.swing.JTextField();
        vaccinNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vaccineDetailsTable = new javax.swing.JTable();
        addVaccineButton = new javax.swing.JButton();
        updateVaccineButton = new javax.swing.JButton();
        viewVaccineButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        petVaccinHeaderLabel.setFont(new java.awt.Font("Kannada MN", 3, 24)); // NOI18N
        petVaccinHeaderLabel.setText("PET VACCINE DETAILS");

        courseCompletedLabel.setText("Course Completed ");

        vaccinNameLabel.setText("Vaccination Name");

        vaccineDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Course Completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vaccineDetailsTable);

        addVaccineButton.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        addVaccineButton.setText("ADD VACCINE");
        addVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccineButtonActionPerformed(evt);
            }
        });

        updateVaccineButton.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        updateVaccineButton.setText("UPDATE VACCINE");
        updateVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVaccineButtonActionPerformed(evt);
            }
        });

        viewVaccineButton.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        viewVaccineButton.setText("VIEW VACCINE");
        viewVaccineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVaccineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addVaccineButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(vaccinNameLabel)
                                .addComponent(courseCompletedLabel)))
                        .addGap(18, 18, 18)
                        .addComponent(updateVaccineButton)
                        .addGap(120, 120, 120)
                        .addComponent(viewVaccineButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseCompltedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vaccineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(petVaccinHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(petVaccinHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vaccineNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vaccinNameLabel))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseCompletedLabel)
                            .addComponent(courseCompltedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateVaccineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addVaccineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewVaccineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccineButtonActionPerformed
        // TODO add your handling code here:
        
        String name = vaccineNameTextField.getText();
        String courseCompleted = courseCompltedTextField.getText();
        VaccineDirectory vaccineDirectory = this.business.getVaccineDirectory();
        vaccineDirectory.createVaccine(name, courseCompleted);
        if (!vaccineNameTextField.getText().isEmpty() || courseCompltedTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vaccine Details added");
            displayVaccineCatelog();
        }else {
            
        }
        
    }//GEN-LAST:event_addVaccineButtonActionPerformed

    private void updateVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVaccineButtonActionPerformed
        // TODO add your handling code here:
        
        if (!vaccineNameTextField.getText().isEmpty()) {
            this.selectedVaccine.setVaccineName(vaccineNameTextField.getText());
            this.selectedVaccine.setVaccineCompleted(courseCompltedTextField.getText());
            JOptionPane.showMessageDialog(null, "Pet Vaccine Details Updated");
            displayVaccineCatelog();
        } else {
            JOptionPane.showMessageDialog(null, "Please make a selection");
        }
    }//GEN-LAST:event_updateVaccineButtonActionPerformed

    private void viewVaccineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVaccineButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = vaccineDetailsTable.getSelectedRow();
        if(selectedRow >=0) {
            //we can directly fetch the applicant object from the 0th position
            selectedVaccine = (Vaccine)vaccineDetailsTable.getValueAt(selectedRow, 0);
            vaccineNameTextField.setText(selectedVaccine.getVaccineName());
            courseCompltedTextField.setText(selectedVaccine.getVaccineCompleted());
        }
        else{
            //No selection made by the user
            JOptionPane.showMessageDialog(null, "Please select a row!");
        }
    }//GEN-LAST:event_viewVaccineButtonActionPerformed

    
    
    public void displayVaccineCatelog() {
        ArrayList<Vaccine> vaccine = this.business.getVaccineDirectory().getVaccinelists();
              
        if(vaccine.size() >0 ) {
            vaccineTableModel.setRowCount(0);
            for(Vaccine vac: vaccine) {
                Object row[] = new Object[2];
                row[0] = vac;
                row[1] = vac.getVaccineCompleted();
                vaccineTableModel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccineButton;
    private javax.swing.JLabel courseCompletedLabel;
    private javax.swing.JTextField courseCompltedTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel petVaccinHeaderLabel;
    private javax.swing.JButton updateVaccineButton;
    private javax.swing.JLabel vaccinNameLabel;
    private javax.swing.JTable vaccineDetailsTable;
    private javax.swing.JTextField vaccineNameTextField;
    private javax.swing.JButton viewVaccineButton;
    // End of variables declaration//GEN-END:variables
}
