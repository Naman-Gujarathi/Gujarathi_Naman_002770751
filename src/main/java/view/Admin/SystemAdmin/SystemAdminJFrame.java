/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.Admin.SystemAdmin;

import view.Admin.AdminJFrame;
import view.MainJFrame;

/**
 *
 * @author karan
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminJFrame
     */
    public SystemAdminJFrame() {
        initComponents();
        workArea.setSize(900, 900);
        setLocationRelativeTo(null);
        HospitalViewUpdate hospitalView = new HospitalViewUpdate();
        splitPane.setRightComponent(hospitalView);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btn_hospitals = new javax.swing.JButton();
        btn_doctors = new javax.swing.JButton();
        btn_patients = new javax.swing.JButton();
        btn_encounters = new javax.swing.JButton();
        btn_back_admin = new javax.swing.JButton();
        btn_community = new javax.swing.JButton();
        btn_houses = new javax.swing.JButton();
        btn_houses1 = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));

        controlPanel.setBackground(new java.awt.Color(0, 0, 0));

        btn_hospitals.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_hospitals.setText("Hospitals");
        btn_hospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hospitalsActionPerformed(evt);
            }
        });

        btn_doctors.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_doctors.setText("Doctors");
        btn_doctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctorsActionPerformed(evt);
            }
        });

        btn_patients.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_patients.setText("Patients");
        btn_patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_patientsActionPerformed(evt);
            }
        });

        btn_encounters.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_encounters.setText("Encounters");
        btn_encounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encountersActionPerformed(evt);
            }
        });

        btn_back_admin.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_back_admin.setText("Logout");
        btn_back_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_adminActionPerformed(evt);
            }
        });

        btn_community.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_community.setText("Community");
        btn_community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_communityActionPerformed(evt);
            }
        });

        btn_houses.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_houses.setText("Houses");
        btn_houses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_housesActionPerformed(evt);
            }
        });

        btn_houses1.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_houses1.setText("Create Admin");
        btn_houses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_houses1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_patients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_houses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_doctors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hospitals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_community, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_houses1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_encounters, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_back_admin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_back_admin)
                .addGap(120, 120, 120)
                .addComponent(btn_hospitals)
                .addGap(18, 18, 18)
                .addComponent(btn_doctors)
                .addGap(18, 18, 18)
                .addComponent(btn_patients)
                .addGap(18, 18, 18)
                .addComponent(btn_encounters)
                .addGap(18, 18, 18)
                .addComponent(btn_community)
                .addGap(18, 18, 18)
                .addComponent(btn_houses)
                .addGap(18, 18, 18)
                .addComponent(btn_houses1)
                .addContainerGap(538, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1385, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hospitalsActionPerformed
        HospitalViewUpdate h = new HospitalViewUpdate();
        splitPane.setRightComponent(h);
    }//GEN-LAST:event_btn_hospitalsActionPerformed

    private void btn_doctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctorsActionPerformed
        DoctorViewUpdate d = new DoctorViewUpdate();
        splitPane.setRightComponent(d);
    }//GEN-LAST:event_btn_doctorsActionPerformed

    private void btn_patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_patientsActionPerformed
        PatientViewUpdate d = new PatientViewUpdate();
        splitPane.setRightComponent(d);
    }//GEN-LAST:event_btn_patientsActionPerformed

    private void btn_encountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encountersActionPerformed
        EncounterViewUpdate d = new EncounterViewUpdate();
        splitPane.setRightComponent(d);
    }//GEN-LAST:event_btn_encountersActionPerformed

    private void btn_back_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_adminActionPerformed
        MainJFrame.loginSession.setObject(null);
        
        this.dispose();
        new AdminJFrame().setVisible(true);
    }//GEN-LAST:event_btn_back_adminActionPerformed

    private void btn_communityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_communityActionPerformed
        CommunityViewUpdate communityView = new CommunityViewUpdate();
        splitPane.setRightComponent(communityView);
    }//GEN-LAST:event_btn_communityActionPerformed

    private void btn_housesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_housesActionPerformed
        CommunityHouseViewUpdate viewHousePanel = new CommunityHouseViewUpdate();
        splitPane.setRightComponent(viewHousePanel);
    }//GEN-LAST:event_btn_housesActionPerformed

    private void btn_houses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_houses1ActionPerformed
        AdminViewUpdate viewAdminPanel = new AdminViewUpdate();
        splitPane.setRightComponent(viewAdminPanel);
    }//GEN-LAST:event_btn_houses1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemAdminJFrame().setVisible(true);
            }
        });
    }
    
    
    public void setHospitalCreateView() {                                               
        // TODO add your handling code here:
        HospitalCreate createPanel = new HospitalCreate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setDoctorCreateView() {                                               
        // TODO add your handling code here:
        DoctorCreate createPanel = new DoctorCreate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setEncounterCreateView() {                                               
        // TODO add your handling code here:
        EncounterCreate createPanel = new EncounterCreate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setPatientCreateView() {                                               
        // TODO add your handling code here:
        PatientCreate createPanel = new PatientCreate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setEncounterUpdateView() {                                               
        // TODO add your handling code here:
        EncounterViewUpdate createPanel = new EncounterViewUpdate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setDoctorUpdateView() {                                               
        
        DoctorViewUpdate createPanel = new DoctorViewUpdate();
        splitPane.setRightComponent(createPanel);
    }
    public void setPatientUpdateView() {                                               
        
        PatientViewUpdate createPanel = new PatientViewUpdate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setCreateView() {                                               
        // TODO add your handling code here:
        CommunityCreate createPanel = new CommunityCreate();
        splitPane.setRightComponent(createPanel);
    }
    
    public void setHouseCreateView() {                                               
        // TODO add your handling code here:
        CommunityHouseCreate createHousePanel = new CommunityHouseCreate();
        splitPane.setRightComponent(createHousePanel);
    }
    
    public void setHouseReadView() {                                               
        // TODO add your handling code here:
        CommunityHouseViewUpdate viewHousePanel = new CommunityHouseViewUpdate();
        splitPane.setRightComponent(viewHousePanel);
    } 
    
    public void setCommunityView() {
        CommunityViewUpdate communityView = new CommunityViewUpdate();
        splitPane.setRightComponent(communityView);
    }
    
    public void setAdminView() {
        AdminViewUpdate communityView = new AdminViewUpdate();
        splitPane.setRightComponent(communityView);
    }
    
    public void setAdminCreate() {
        AdminCreate communityView = new AdminCreate();
        splitPane.setRightComponent(communityView);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_admin;
    private javax.swing.JButton btn_community;
    private javax.swing.JButton btn_doctors;
    private javax.swing.JButton btn_encounters;
    private javax.swing.JButton btn_hospitals;
    private javax.swing.JButton btn_houses;
    private javax.swing.JButton btn_houses1;
    private javax.swing.JButton btn_patients;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
