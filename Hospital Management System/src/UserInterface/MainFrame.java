/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

/**
 *
 * @author naman
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jMainFrameButtonPatient = new javax.swing.JButton();
        jMainFrameButtonDoctor = new javax.swing.JButton();
        jMainFrameButtonSystemAdmin = new javax.swing.JButton();
        jMainFrameButtonCommunityAdmin = new javax.swing.JButton();
        jMainFrameButtonHospitalAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jMainFrameButtonPatient.setBackground(new java.awt.Color(102, 102, 255));
        jMainFrameButtonPatient.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jMainFrameButtonPatient.setText("Patient");
        jMainFrameButtonPatient.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 255)));
        jMainFrameButtonPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMainFrameButtonPatientActionPerformed(evt);
            }
        });

        jMainFrameButtonDoctor.setBackground(new java.awt.Color(102, 102, 255));
        jMainFrameButtonDoctor.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jMainFrameButtonDoctor.setText("Doctor");
        jMainFrameButtonDoctor.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 255)));

        jMainFrameButtonSystemAdmin.setBackground(new java.awt.Color(102, 102, 255));
        jMainFrameButtonSystemAdmin.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jMainFrameButtonSystemAdmin.setText("System Admin");
        jMainFrameButtonSystemAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 255)));
        jMainFrameButtonSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMainFrameButtonSystemAdminActionPerformed(evt);
            }
        });

        jMainFrameButtonCommunityAdmin.setBackground(new java.awt.Color(102, 102, 255));
        jMainFrameButtonCommunityAdmin.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jMainFrameButtonCommunityAdmin.setText("Community Admin");
        jMainFrameButtonCommunityAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 255)));

        jMainFrameButtonHospitalAdmin.setBackground(new java.awt.Color(102, 102, 255));
        jMainFrameButtonHospitalAdmin.setFont(new java.awt.Font("Lava Kannada", 1, 14)); // NOI18N
        jMainFrameButtonHospitalAdmin.setText("Hospital Admin");
        jMainFrameButtonHospitalAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 255)));

        jLabel1.setFont(new java.awt.Font("Lava Kannada", 1, 24)); // NOI18N
        jLabel1.setText("Hospital Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMainFrameButtonDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMainFrameButtonPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMainFrameButtonSystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMainFrameButtonCommunityAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMainFrameButtonHospitalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jMainFrameButtonPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jMainFrameButtonDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jMainFrameButtonSystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jMainFrameButtonCommunityAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jMainFrameButtonHospitalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMainFrameButtonPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMainFrameButtonPatientActionPerformed
        // TODO add your handling code here: PatientJPanel viewPanel = new PatientJPanel();
       // jSplitPane1MainFrame.setRightComponent(viewPanel);
       JFramePatient patient = new JFramePatient();
       patient.setVisible(true);
    }//GEN-LAST:event_jMainFrameButtonPatientActionPerformed

    private void jMainFrameButtonSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMainFrameButtonSystemAdminActionPerformed
         
            JFrameSystemAdmin  systemAdmin = new  JFrameSystemAdmin();
            systemAdmin.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jMainFrameButtonSystemAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jMainFrameButtonCommunityAdmin;
    private javax.swing.JButton jMainFrameButtonDoctor;
    private javax.swing.JButton jMainFrameButtonHospitalAdmin;
    private javax.swing.JButton jMainFrameButtonPatient;
    private javax.swing.JButton jMainFrameButtonSystemAdmin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}