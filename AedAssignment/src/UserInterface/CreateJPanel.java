/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Model.Employee;
import Model.EmployeeHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author naman
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistory history;
    public CreateJPanel(EmployeeHistory history) {
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
        jLabelName = new javax.swing.JLabel();
        jLabelEmployeeID = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelStartDate = new javax.swing.JLabel();
        jLabelContactNumber = new javax.swing.JLabel();
        jLabelLevel = new javax.swing.JLabel();
        jLabelEmailID = new javax.swing.JLabel();
        jLabelPositionTitle = new javax.swing.JLabel();
        jLabelTeamInformation = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmployeeID = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldStartDate = new javax.swing.JTextField();
        jTextFieldContactNumber = new javax.swing.JTextField();
        jTextFieldPositionTitle = new javax.swing.JTextField();
        jTextFieldEmailID = new javax.swing.JTextField();
        jTextFieldLevel = new javax.swing.JTextField();
        jTextFieldTeamInformation = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jLabelNameComment = new javax.swing.JLabel();
        jLabelAgeComment = new javax.swing.JLabel();
        jLabelGenderComment = new javax.swing.JLabel();
        jLabelContactNumberComment = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Information Form");

        jLabelName.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelName.setText("Name:");

        jLabelEmployeeID.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelEmployeeID.setText("Employee ID:");

        jLabelGender.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelGender.setText("Gender:");

        jLabelAge.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelAge.setText("Age:");

        jLabelStartDate.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelStartDate.setText("Start Date:");

        jLabelContactNumber.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelContactNumber.setText("Contact Number:");

        jLabelLevel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelLevel.setText("Level:");

        jLabelEmailID.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelEmailID.setText("Email ID:");

        jLabelPositionTitle.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelPositionTitle.setText("Position Title:");

        jLabelTeamInformation.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabelTeamInformation.setText("Team Information:");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyPressed(evt);
            }
        });

        jTextFieldAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAgeKeyPressed(evt);
            }
        });

        jTextFieldGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldGenderKeyPressed(evt);
            }
        });

        jTextFieldContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldContactNumberKeyPressed(evt);
            }
        });

        jButtonSubmit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPositionTitle)
                            .addComponent(jLabelTeamInformation))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLevel)
                            .addComponent(jLabelEmailID)
                            .addComponent(jLabelStartDate)
                            .addComponent(jLabelContactNumber)
                            .addComponent(jLabelGender)
                            .addComponent(jLabelAge)
                            .addComponent(jLabelEmployeeID)
                            .addComponent(jLabelName))
                        .addGap(69, 69, 69)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNameComment))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabelAgeComment))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelGenderComment))
                    .addComponent(jTextFieldStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelContactNumberComment))
                    .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTeamInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 331, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName)
                    .addComponent(jLabelNameComment))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmployeeID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAge)
                    .addComponent(jLabelAgeComment))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGender)
                    .addComponent(jLabelGenderComment))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStartDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContactNumber)
                    .addComponent(jLabelContactNumberComment))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailID)
                    .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLevel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPositionTitle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTeamInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTeamInformation))
                .addGap(42, 42, 42)
                .addComponent(jButtonSubmit)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
        String empName = jTextFieldName.getText();
        String empContactNumber = jTextFieldContactNumber.getText();
        String empLevel = jTextFieldLevel.getText();
        String empPositionTitle = jTextFieldPositionTitle.getText();
        String empStartDate = jTextFieldStartDate.getText();
        String empTeamInfo = jTextFieldTeamInformation.getText();
        String empGender = jTextFieldGender.getText();
        String empEmailID = jTextFieldEmailID.getText();
     
        int empAge = Integer.parseInt(jTextFieldAge.getText());
         
        int empId  = Integer.parseInt(jTextFieldEmployeeID.getText());  
    
        Employee vs = history.addNewEmployee();
        vs.setEmpAge(empAge);
        vs.setEmpContactNumber(empContactNumber);
        vs.setEmpEmail(empEmailID);
        vs.setEmpGender(empGender);
        vs.setEmpId(empId);
        vs.setEmpLevel(empLevel);
        vs.setEmpName(empName);
        vs.setEmpPositionTitle(empPositionTitle);
        vs.setEmpStartDate(empStartDate);
       vs.setEmpTeamInfo(empTeamInfo);
       
       
       JOptionPane.showMessageDialog(this, "New employee information added.");
       jTextFieldName.setText("");
       jTextFieldContactNumber.setText("");
       jTextFieldLevel.setText("");
       jTextFieldStartDate.setText("");
       jTextFieldTeamInformation.setText("");
       jTextFieldGender.setText("");
       jTextFieldEmailID.setText("");
       jTextFieldAge.setText("");
       jTextFieldEmployeeID.setText("");
       jTextFieldPositionTitle.setText("");
               
       
       
        
        
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyPressed
       int chr = evt.getKeyChar();
if(Character.isDigit(chr)){
jTextFieldName.setEditable(false);
jLabelNameComment.setText("not valid");
}
else{

jTextFieldName.setEditable(true);
jLabelNameComment.setText("");
}
    }//GEN-LAST:event_jTextFieldNameKeyPressed

    private void jTextFieldAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAgeKeyPressed
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        
        if(Character.isLetter(ch)){
            jTextFieldAge.setEditable(false);
           jLabelAgeComment.setText("Please enter number only");
            }
        else{
         jTextFieldAge.setEditable(true);
         jLabelAgeComment.setText("");
        }
    }//GEN-LAST:event_jTextFieldAgeKeyPressed

    private void jTextFieldGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldGenderKeyPressed
               int chr = evt.getKeyChar();
               if(Character.isDigit(chr)){
              jTextFieldGender.setEditable(false);
               jLabelGenderComment.setText("not valid");
}
else{

               jTextFieldGender.setEditable(true);
               jLabelGenderComment.setText("");
}
    }//GEN-LAST:event_jTextFieldGenderKeyPressed

    private void jTextFieldContactNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContactNumberKeyPressed
             char ch = evt.getKeyChar();
        
             if(Character.isLetter(ch)){
            jTextFieldContactNumber.setEditable(false);
           jLabelContactNumberComment.setText("Please enter number only");
            }
        else{
         jTextFieldContactNumber.setEditable(true);
         jLabelContactNumberComment.setText("");
        }
    }//GEN-LAST:event_jTextFieldContactNumberKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelAgeComment;
    private javax.swing.JLabel jLabelContactNumber;
    private javax.swing.JLabel jLabelContactNumberComment;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelGenderComment;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameComment;
    private javax.swing.JLabel jLabelPositionTitle;
    private javax.swing.JLabel jLabelStartDate;
    private javax.swing.JLabel jLabelTeamInformation;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldContactNumber;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldEmployeeID;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldLevel;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPositionTitle;
    private javax.swing.JTextField jTextFieldStartDate;
    private javax.swing.JTextField jTextFieldTeamInformation;
    // End of variables declaration//GEN-END:variables
}
