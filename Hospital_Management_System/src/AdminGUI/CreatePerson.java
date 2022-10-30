/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminGUI;
import code.Person;
import code.PersonDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajvi
 */
import javax.swing.JPanel;
import javax.swing.JSplitPane;
public class CreatePerson extends javax.swing.JPanel {

    /**
     * Creates new form CreatePerson
     * 
     */
    private PersonDirectory personDirectory;
    JSplitPane sp;
    
    public CreatePerson(JSplitPane sp,PersonDirectory personDirectory) {
        this.sp= sp;
        this.personDirectory=personDirectory;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminLoginLabel = new javax.swing.JLabel();
        personFNameLabel = new javax.swing.JLabel();
        personLNameLabel = new javax.swing.JLabel();
        personAgeLabel = new javax.swing.JLabel();
        personGenderLabel = new javax.swing.JLabel();
        peronContactLabel = new javax.swing.JLabel();
        personRoleLabel = new javax.swing.JLabel();
        personFNameText = new javax.swing.JTextField();
        personLNameText = new javax.swing.JTextField();
        personAgeText = new javax.swing.JTextField();
        personGenderText = new javax.swing.JTextField();
        personContactText = new javax.swing.JTextField();
        personRoleText = new javax.swing.JTextField();
        addPersonButton = new javax.swing.JButton();
        adminPersonBackButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        adminLoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        adminLoginLabel.setText("ADD A PERSON");

        personFNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personFNameLabel.setText("First Name :");

        personLNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personLNameLabel.setText("Last Name :");

        personAgeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personAgeLabel.setText("Age :");

        personGenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personGenderLabel.setText("Gender :");

        peronContactLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        peronContactLabel.setText("Contact :");

        personRoleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personRoleLabel.setText("Role :");

        personFNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personFNameTextActionPerformed(evt);
            }
        });

        personLNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personLNameTextActionPerformed(evt);
            }
        });

        personAgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personAgeTextActionPerformed(evt);
            }
        });

        personGenderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personGenderTextActionPerformed(evt);
            }
        });

        personContactText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personContactTextActionPerformed(evt);
            }
        });

        personRoleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personRoleTextActionPerformed(evt);
            }
        });

        addPersonButton.setText("Add ");
        addPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonButtonActionPerformed(evt);
            }
        });

        adminPersonBackButton.setText("<<Back ");
        adminPersonBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPersonBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(adminLoginLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addPersonButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(personLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peronContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personRoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personLNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personGenderText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personContactText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(personRoleText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(261, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminPersonBackButton)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(adminLoginLabel)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personFNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personLNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personGenderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(peronContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personContactText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personRoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personRoleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(addPersonButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(adminPersonBackButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personFNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personFNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personFNameTextActionPerformed

    private void personLNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personLNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personLNameTextActionPerformed

    private void personAgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personAgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personAgeTextActionPerformed

    private void personGenderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personGenderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personGenderTextActionPerformed

    private void personContactTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personContactTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personContactTextActionPerformed

    private void personRoleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personRoleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personRoleTextActionPerformed

    private void adminPersonBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPersonBackButtonActionPerformed
        // TODO add your handling code here:
        ManagePersons createPanel = new ManagePersons(sp,personDirectory);
        sp.setRightComponent(createPanel);
    }//GEN-LAST:event_adminPersonBackButtonActionPerformed

    private void addPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonButtonActionPerformed
        // TODO add your handling code here:
        if (checkBlankInput ()==Boolean.TRUE){
            
            String personFName=personFNameText.getText();
            String personLName=personLNameText.getText();
            String personGender=personGenderText.getText();
            String Age=personAgeText.getText();
            String personContact=personContactText.getText();
            String personRole=personRoleText.getText();
            
            int personAge = Integer.parseInt(Age);
            
            Person person = new Person(personFName,personLName,personAge,personGender,personContact,personRole);
            person.setPersonFirstName(personFName);
            person.setPersonLastName(personLName);
            person.setPersonAge(personAge);
            person.setPersonGender(personGender);
            person.setPersonRole(personRole);
            
            if(personDirectory != null){
	personDirectory.addPersonToList(person);
}
else{
	personDirectory=new PersonDirectory();
	personDirectory.addPersonToList(person);
}
            
            
            
            /*Person person = personDirectory.createAndAddPerson();
            person.setPersonFirstName(personFNameText.getText());
            person.setPersonLastName(personLNameText.getText());
            person.setPersonAge(Integer.parseInt(personAgeText.getText()));
            person.setPersonGender(personGenderText.getText());
            person.setPersonContactNumber(personContactText.getText());
            person.setPersonRole(personRoleText.getText());*/
            
            
            JOptionPane.showMessageDialog(this, "Person added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
            
        }
        else
         {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addPersonButtonActionPerformed
    private void clearFields()
    {
        personFNameText.setText("");
        personLNameText.setText("");
        personAgeText.setText("");
        personGenderText.setText("");
        personContactText.setText("");
        personRoleText.setText("");
    }
    
    private Boolean checkBlankInput()
    {
        if(personFNameText.getText().length()==0
                ||personLNameText.getText().length()==0 
                    ||personAgeText.getText().length()==0
                        ||personGenderText.getText().length()==0
                            ||personContactText.getText().length()==0
                                ||personRoleText.getText().length()==0)
        {
            return false;
        }
        else{
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPersonButton;
    private javax.swing.JLabel adminLoginLabel;
    private javax.swing.JButton adminPersonBackButton;
    private javax.swing.JLabel peronContactLabel;
    private javax.swing.JLabel personAgeLabel;
    private javax.swing.JTextField personAgeText;
    private javax.swing.JTextField personContactText;
    private javax.swing.JLabel personFNameLabel;
    private javax.swing.JTextField personFNameText;
    private javax.swing.JLabel personGenderLabel;
    private javax.swing.JTextField personGenderText;
    private javax.swing.JLabel personLNameLabel;
    private javax.swing.JTextField personLNameText;
    private javax.swing.JLabel personRoleLabel;
    private javax.swing.JTextField personRoleText;
    // End of variables declaration//GEN-END:variables
}
