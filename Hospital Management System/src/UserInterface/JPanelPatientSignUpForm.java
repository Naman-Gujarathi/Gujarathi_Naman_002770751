/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Model.Patient;
import Model.PatientHistory;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author naman
 */
public class JPanelPatientSignUpForm extends javax.swing.JPanel {

    /**
     * Creates new form JPanelSignUpForm
     */
    
    PatientHistory history;
    public JPanelPatientSignUpForm( PatientHistory history) {
        initComponents();
         this.history = history;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonPatientSubmit = new javax.swing.JButton();
        jTextFieldPatientHouse = new javax.swing.JTextField();
        jComboBoxPatientCommunity = new javax.swing.JComboBox<>();
        jTextFieldPatientCity = new javax.swing.JTextField();
        jTextFieldPatientEmailID = new javax.swing.JTextField();
        jTextFieldPatientContactNumber = new javax.swing.JTextField();
        jRadioButtonPatientMale = new javax.swing.JRadioButton();
        jRadioButtonPatientFemale = new javax.swing.JRadioButton();
        jComboBoxPatientBloodGroup = new javax.swing.JComboBox<>();
        jTextFieldPatientAge = new javax.swing.JTextField();
        jTextFieldPatientUsername = new javax.swing.JTextField();
        jTextFieldPatientPassword = new javax.swing.JTextField();
        jTextFieldPatientName = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lava Kannada", 1, 24)); // NOI18N
        jLabel1.setText("Patient Sign Up Form");

        jLabel10.setText("Name");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Age");

        jLabel5.setText("Blood Group");

        jLabel7.setText("Gender");

        jLabel9.setText("Contact Number");

        jLabel11.setText("Email ID");

        jLabel12.setText("City");

        jLabel13.setText("Community");

        jLabel14.setText("House");

        jButtonPatientSubmit.setBackground(new java.awt.Color(51, 51, 255));
        jButtonPatientSubmit.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jButtonPatientSubmit.setText("Submit");
        jButtonPatientSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPatientSubmitActionPerformed(evt);
            }
        });

        jComboBoxPatientCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButtonPatientMale.setText("Male");

        jRadioButtonPatientFemale.setText("Female");

        jComboBoxPatientBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A RhD positive (A+) ,", " A RhD negative (A-) ,", "B RhD positive (B+) ,", " B RhD negative (B-) ,", "O RhD positive (O+) ,", "O RhD negative (O-) ,", " AB RhD positive (AB+) ,", "AB RhD negative (AB-)", " ", " ", " " }));

        jTextFieldPatientPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientPasswordActionPerformed(evt);
            }
        });

        jButtonBack.setBackground(new java.awt.Color(51, 51, 255));
        jButtonBack.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPatientHouse)
                            .addComponent(jTextFieldPatientUsername)
                            .addComponent(jTextFieldPatientName)
                            .addComponent(jTextFieldPatientPassword)
                            .addComponent(jTextFieldPatientAge)
                            .addComponent(jTextFieldPatientContactNumber)
                            .addComponent(jTextFieldPatientEmailID)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonPatientMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonPatientFemale))
                            .addComponent(jTextFieldPatientCity)
                            .addComponent(jComboBoxPatientBloodGroup, 0, 213, Short.MAX_VALUE)
                            .addComponent(jComboBoxPatientCommunity, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonPatientSubmit)
                        .addGap(193, 193, 193))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxPatientBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jRadioButtonPatientMale)
                            .addComponent(jRadioButtonPatientFemale))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldPatientContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldPatientEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxPatientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPatientHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(39, 39, 39)
                .addComponent(jButtonPatientSubmit)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPatientSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPatientSubmitActionPerformed
String personName = jTextFieldPatientName.getText();
        String personUserName = jTextFieldPatientUsername.getText();
        String personPassword = jTextFieldPatientPassword.getText();
       String patientBloodGroup = jComboBoxPatientBloodGroup.getSelectedItem().toString();
        //String patientGender = jTextFieldStartDate.getText();
        String personContactNumber = jTextFieldPatientContactNumber.getText();
      //  String empGender = jTextFieldGender.getText();
        String personEmailID = jTextFieldPatientEmailID.getText();
        String personCity = jTextFieldPatientCity.getText();
      String patientCommunity  = jComboBoxPatientCommunity.getSelectedItem().toString();
        String personHouse = jTextFieldPatientHouse.getText();
        
        
     
        int personAge = Integer.parseInt(jTextFieldPatientAge.getText());
         
      //  int emp = Integer.parseInt(jTextFieldEmployeeID.getText()); 
        //String empName = jTextFieldName.getText();

        //FramePatientSignUpForm btn = new JFramePatientSignUpForm();
        //btn.setVisible(false);
        // TODO add your handling code here:
//         if (history!=null)
             Patient vs = new Patient();
         
           vs.setPersonName(personName);
           vs.setPersonUserName(personUserName);
           vs.setPersonPassword(personPassword);
           vs.setPersonAge(personAge);
         //  vs.setPersonBloodGroup(personBloodGroup);
          // vs.setPersonContactNumber(personFatherName);
        //   vs.setPersonGender(personGender);
           vs.setPersonCity(personCity);
           vs.setPersonHouse(personEmailID);
            vs.setPersonHouse(personHouse);
             vs.setPersonContactNumber(personContactNumber);
             //vs.setPersonHouse(personHouse);
           
          // vs.setPersonCommunity(personCommunity);
          
            if(history!=null)
          {
          history.addNewPatient();
          }
          else
          {
          history = new PatientHistory();
          history.addNewPatient();
          }
        
         JOptionPane.showMessageDialog(this, "You have successfully created record");

          jTextFieldPatientName.setText("");
          jTextFieldPatientUsername.setText("");
          jTextFieldPatientPassword.setText("");
          jTextFieldPatientAge.setText("");
          jTextFieldPatientCity.setText("");
         // jTextFieldGender.setText("");
          jTextFieldPatientEmailID.setText("");
         jTextFieldPatientHouse.setText("");
         // jTextFieldEmployeeID.setText("");
          jTextFieldPatientContactNumber.setText("");
        
        
    }//GEN-LAST:event_jButtonPatientSubmitActionPerformed

    private void jTextFieldPatientPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientPasswordActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your dling code here:
       PatientSignInSignUp patient = new PatientSignInSignUp();
        patient.setVisible(true);
        // JPanelPatientRecord patientRecord = new JPanelPatientRecord();
        //jSplitPaneAdminPortal.setRightComponent(patientRecord );
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonPatientSubmit;
    private javax.swing.JComboBox<String> jComboBoxPatientBloodGroup;
    private javax.swing.JComboBox<String> jComboBoxPatientCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonPatientFemale;
    private javax.swing.JRadioButton jRadioButtonPatientMale;
    private javax.swing.JTextField jTextFieldPatientAge;
    private javax.swing.JTextField jTextFieldPatientCity;
    private javax.swing.JTextField jTextFieldPatientContactNumber;
    private javax.swing.JTextField jTextFieldPatientEmailID;
    private javax.swing.JTextField jTextFieldPatientHouse;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldPatientPassword;
    private javax.swing.JTextField jTextFieldPatientUsername;
    // End of variables declaration//GEN-END:variables
}
