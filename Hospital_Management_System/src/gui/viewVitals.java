/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import code.MyNumericVerifier;
import code.PatientDirectory;
import code.PersonDirectory;
import code.VitalSign;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author Rajvi
 */
public class viewVitals extends javax.swing.JPanel {

    /**
     * Creates new form viewVitals
     */
     PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    VitalSign vitalSign;
    JSplitPane sp;
    private Boolean isEdit = Boolean.FALSE;
    public viewVitals(JSplitPane sp,PersonDirectory personDirectory,PatientDirectory patientDirectory, VitalSign vitalSign, Boolean isEdit) {
        initComponents();
        this.vitalSign = vitalSign;
        this.isEdit = isEdit;
        this.patientDirectory=patientDirectory;
        this.personDirectory=personDirectory;
        this.sp=sp;
        addVerifiers();
        populateVitalSignDetails();
        modifyTextFields(false);
    }
private void addVerifiers() {
        InputVerifier integerVerifier = new MyNumericVerifier();
        respiratoryText.setInputVerifier(integerVerifier);
        heartText.setInputVerifier(integerVerifier);
        pressureText.setInputVerifier(integerVerifier);
        weightText.setInputVerifier(integerVerifier);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createHospitalTitle = new javax.swing.JLabel();
        heartText = new javax.swing.JTextField();
        pressureText = new javax.swing.JTextField();
        heartLabel = new javax.swing.JLabel();
        pressureLabel = new javax.swing.JLabel();
        weightText = new javax.swing.JTextField();
        vitalsBackButton = new javax.swing.JButton();
        respiratoryText = new javax.swing.JTextField();
        weightLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        editVitalsButton = new javax.swing.JButton();
        saveVitalsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        createHospitalTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        createHospitalTitle.setText("VITAL SIGNS");

        heartLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        heartLabel.setText("Heart Rate :");

        pressureLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pressureLabel.setText("Body Pressure :");

        vitalsBackButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vitalsBackButton.setText("<<Back");
        vitalsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalsBackButtonActionPerformed(evt);
            }
        });

        respiratoryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respiratoryTextActionPerformed(evt);
            }
        });

        weightLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        weightLabel.setText("Weight(In Pounds):");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Respiratory Rate :");

        editVitalsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editVitalsButton.setText("Edit Vitals");
        editVitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVitalsButtonActionPerformed(evt);
            }
        });

        saveVitalsButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveVitalsButton.setText("Save");
        saveVitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVitalsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createHospitalTitle)
                        .addGap(315, 315, 315))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vitalsBackButton)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editVitalsButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(weightLabel)
                        .addComponent(pressureLabel)
                        .addComponent(heartLabel)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heartText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pressureText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respiratoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(saveVitalsButton)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(createHospitalTitle)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(heartLabel)
                        .addGap(18, 18, 18)
                        .addComponent(pressureLabel)
                        .addGap(18, 18, 18)
                        .addComponent(weightLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(respiratoryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heartText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pressureText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editVitalsButton)
                    .addComponent(saveVitalsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(vitalsBackButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vitalsBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalsBackButtonActionPerformed
        // TODO add your handling code here:
        vitalSignsRecord createPanel = new vitalSignsRecord(sp,personDirectory,patientDirectory);
        sp.setRightComponent(createPanel);
    }//GEN-LAST:event_vitalsBackButtonActionPerformed

    private void respiratoryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respiratoryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respiratoryTextActionPerformed

    private void editVitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVitalsButtonActionPerformed
        // TODO add your handling code here:
        modifyTextFields(true);
    }//GEN-LAST:event_editVitalsButtonActionPerformed

    private void saveVitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVitalsButtonActionPerformed
        // TODO add your handling code here:
        try {
            int respiratoryRate = Integer.parseInt(respiratoryText.getText());
            int heartRate = Integer.parseInt(heartText.getText());
            int bloodPressure = Integer.parseInt(pressureText.getText());
            int weight = Integer.parseInt(weightText.getText());
            
            
            vitalSign.setRespiratoryRate(respiratoryRate);
            vitalSign.setHeartRate(heartRate);
            vitalSign.setBloodPressure(bloodPressure);
            vitalSign.setWeight(weight);
            
            vitalSign.setTimestamp(new Date());
            JOptionPane.showMessageDialog(this, "Vital signs added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            
       } catch (Exception ex) {
          JOptionPane.showMessageDialog(this, "Please enter correct values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }  
        modifyTextFields(false);
    }//GEN-LAST:event_saveVitalsButtonActionPerformed
    private void modifyTextFields(Boolean isEdit) {
        if (isEdit) {
            respiratoryText.setEnabled(true);
            heartText.setEnabled(true);
            pressureText.setEnabled(true);
            weightText.setEnabled(true);
        } else {
            respiratoryText.setEnabled(false);
            heartText.setEnabled(false);
            pressureText.setEnabled(false);
            weightText.setEnabled(false);
        }
    }
    private void populateVitalSignDetails() {
        respiratoryText.setText(String.valueOf(vitalSign.getRespiratoryRate()));
        heartText.setText(String.valueOf(vitalSign.getHeartRate()));
        pressureText.setText(String.valueOf(vitalSign.getBloodPressure()));
        weightText.setText(String.valueOf(vitalSign.getWeight()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createHospitalTitle;
    private javax.swing.JButton editVitalsButton;
    private javax.swing.JLabel heartLabel;
    private javax.swing.JTextField heartText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pressureLabel;
    private javax.swing.JTextField pressureText;
    private javax.swing.JTextField respiratoryText;
    private javax.swing.JButton saveVitalsButton;
    private javax.swing.JButton vitalsBackButton;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightText;
    // End of variables declaration//GEN-END:variables
}
