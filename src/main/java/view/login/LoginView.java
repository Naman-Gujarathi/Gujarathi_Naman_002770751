/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.login;

import models.Admins;
import models.Doctor;
import models.Patient;
import view.Admin.CommunityAdmin.CommunityAdmin;
import view.Admin.HospitalAdmin.HospitalAdminJFrame;
import view.Admin.SystemAdmin.SystemAdminJFrame;
import view.Doctor.DoctorEncounters;
import view.MainJFrame;
import view.Patient.PatientView;

/**
 *
 * @author karan
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    
    String type;
    
    public LoginView(String type) {
        initComponents();
        this.type = type;
        setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btnLogin);
        
        if (!type.equals("patient")) {
            btnRegister.setVisible(false);
        }
        
        switch(type) {
            case("patient") -> lblLogin.setText("Patient Login");
            case("doctor") -> lblLogin.setText("Doctor Login");
            case("system") -> lblLogin.setText("System Admin Login");
            case("community") -> lblLogin.setText("Community Admin Login");
            case("hospital") -> lblLogin.setText("Hospital Admin Login");
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

        jPanel1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        valCreds = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Lava Kannada", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(204, 204, 204));
        lblLogin.setText("Please Login ");

        lblUsername.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(204, 204, 204));
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 204, 204));
        lblPassword.setText("Password:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        valCreds.setForeground(new java.awt.Color(255, 255, 0));

        btnBack.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(valCreds, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(34, 34, 34)
                                .addComponent(lblLogin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnRegister)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLogin))
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogin)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnLogin))
                .addGap(56, 56, 56)
                .addComponent(valCreds, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtUsername.getText().equals("")) {
            valCreds.setText("Username is required");
        } else if (String.valueOf(txtPassword.getPassword()).equals("")) {
            valCreds.setText("Password is required");
        } else {
            if (type.equals("patient")) {
                Patient p = MainJFrame.patientDirectory.checkPatientCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
                if (p == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(p);
                    this.dispose();
                    new PatientView().setVisible(true);
                }
            } else if (type.equals("doctor")) {
                Doctor d = MainJFrame.doctorDirectory.checkDoctorCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()));
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new DoctorEncounters().setVisible(true);
                }
            } else if (type.equals("community")) {
                Admins d = MainJFrame.adminDirectory.checkAdminCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), Admins.AdminType.COMMUNITY);
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new CommunityAdmin().setVisible(true);
                }
            } else if (type.equals("system")) {
                Admins d = MainJFrame.adminDirectory.checkAdminCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), Admins.AdminType.SYSTEM);
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new SystemAdminJFrame().setVisible(true);
                }
            } else if (type.equals("hospital")) {
                Admins d = MainJFrame.adminDirectory.checkAdminCredentials(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), Admins.AdminType.HOSPITAL);
                if (d == null) {
                    valCreds.setText("Invalid Credentials.");
                } else {
                    MainJFrame.loginSession.setObject(d);
                    this.dispose();
                    new HospitalAdminJFrame().setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new MainJFrame().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        this.dispose();
        PatientRegister p = new PatientRegister();
        p.setVisible(true);
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView("admin").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel valCreds;
    // End of variables declaration//GEN-END:variables
}
