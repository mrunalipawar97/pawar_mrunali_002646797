/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.ApplicantsDirectory;
import Model.Business;
import Model.PlanDetails;
import Model.Vaccine;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author mrunalipawar
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private Business business;
    String date;
    public CreateJPanel() {
        initComponents();
    }

    CreateJPanel(Business business) {
        initComponents();
        this.setVisible(true);
        this.business = business;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreatePageHeaderLabel = new javax.swing.JLabel();
        applicationIdLabel = new javax.swing.JLabel();
        ownerFNameLabel = new javax.swing.JLabel();
        ownerLNameLabel = new javax.swing.JLabel();
        applicationDateLabel = new javax.swing.JLabel();
        applicationIdTextField = new javax.swing.JTextField();
        ownerFNameTextField = new javax.swing.JTextField();
        ownerLNameTextField = new javax.swing.JTextField();
        petHeaderLabel = new javax.swing.JLabel();
        petNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        petTypeLabel = new javax.swing.JLabel();
        petNameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        genderTextField = new javax.swing.JTextField();
        petTypeTextField = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        breedLabel = new javax.swing.JLabel();
        breedTextField = new javax.swing.JTextField();
        addApplicantButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        CreatePageHeaderLabel.setFont(new java.awt.Font("Kannada MN", 1, 24)); // NOI18N
        CreatePageHeaderLabel.setText("Create Owners Details  ");

        applicationIdLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        applicationIdLabel.setText("Applicantion ID");

        ownerFNameLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        ownerFNameLabel.setText("Owner's First Name");

        ownerLNameLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        ownerLNameLabel.setText("Owner's Last Name");

        applicationDateLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        applicationDateLabel.setText("Application Date");

        petHeaderLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        petHeaderLabel.setText("Pet");

        petNameLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        petNameLabel.setText("Pet Name");

        ageLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        ageLabel.setText("Age");

        GenderLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        GenderLabel.setText("Gender");

        petTypeLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        petTypeLabel.setText("Pet Type");

        breedLabel.setFont(new java.awt.Font("Kannada MN", 1, 13)); // NOI18N
        breedLabel.setText("Breed");

        addApplicantButton.setFont(new java.awt.Font("Kannada MN", 1, 14)); // NOI18N
        addApplicantButton.setText("ADD APPLICANT");
        addApplicantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addApplicantButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(petHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(CreatePageHeaderLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(breedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(petTypeTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(genderTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(petNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                            .addComponent(ownerLNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ownerFNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(applicationIdTextField, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(applicationIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ownerFNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ownerLNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(applicationDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(petNameLabel)
                                    .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(petTypeLabel)
                                    .addComponent(breedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(addApplicantButton)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(applicationIdLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ownerFNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownerFNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ownerLNameLabel)
                            .addComponent(ownerLNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(applicationDateLabel)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(petHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(petNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(petNameLabel))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenderLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(petTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(petTypeLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CreatePageHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(applicationIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(breedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breedLabel))
                .addGap(18, 18, 18)
                .addComponent(addApplicantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addApplicantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addApplicantButtonActionPerformed
        // TODO add your handling code here:
        
        ApplicantsDirectory appDirectory = this.business.getAppDirectory();
        
        String id = applicationIdTextField.getText();
        String fName = ownerFNameTextField.getText();
        String lName = ownerLNameTextField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        
        String petName = petNameTextField.getText();
        String petAge =  ageTextField.getText();
        String petGender = genderTextField.getText();
        String petType =  petTypeTextField.getText();
        String petBreed = breedTextField.getText();

        if(!applicationIdTextField.getText().isEmpty() || !ownerFNameTextField.getText().isEmpty() || !ownerLNameTextField.getText().isEmpty() || jDateChooser.getDate() != null ||
                !petNameTextField.getText().isEmpty()|| !ageTextField.getText().isEmpty() || 
                !genderTextField.getText().isEmpty() || !petTypeTextField.getText().isEmpty() ||
                !breedTextField.getText().isEmpty()) {
            date = sdf.format(jDateChooser.getDate());
            System.out.println("date : " + date);
            if (appDirectory.applicantExists(Integer.valueOf(id), fName, lName)) {
                JOptionPane.showMessageDialog(null, "Account with this name already exists");
            } else {
                appDirectory.createApplicant(Integer.valueOf(id), fName, lName, date, petName,Integer.valueOf(petAge), petGender, petType, petBreed);
                JOptionPane.showMessageDialog(null, "Added Applicant");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please fill form fields");
        }
        
        
    }//GEN-LAST:event_addApplicantButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CreatePageHeaderLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JButton addApplicantButton;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel applicationDateLabel;
    private javax.swing.JLabel applicationIdLabel;
    private javax.swing.JTextField applicationIdTextField;
    private javax.swing.JLabel breedLabel;
    private javax.swing.JTextField breedTextField;
    private javax.swing.JTextField genderTextField;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel ownerFNameLabel;
    private javax.swing.JTextField ownerFNameTextField;
    private javax.swing.JLabel ownerLNameLabel;
    private javax.swing.JTextField ownerLNameTextField;
    private javax.swing.JLabel petHeaderLabel;
    private javax.swing.JLabel petNameLabel;
    private javax.swing.JTextField petNameTextField;
    private javax.swing.JLabel petTypeLabel;
    private javax.swing.JTextField petTypeTextField;
    // End of variables declaration//GEN-END:variables
}
