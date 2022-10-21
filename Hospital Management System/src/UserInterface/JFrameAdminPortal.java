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
public class JFrameAdminPortal extends javax.swing.JFrame {

    /**
     * Creates new form JFrameAdminPortal
     */
    public JFrameAdminPortal() {
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

        jSplitPaneAdminPortal = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        JFrameSystemAdminJButtonDoctor = new javax.swing.JButton();
        JFrameSystemAdminjButtonHospital = new javax.swing.JButton();
        JFrameSystemAdminJButtonEncounter = new javax.swing.JButton();
        JFrameSystemAdminJButtonCredentials = new javax.swing.JButton();
        JFrameSystemAdminJButtonPatient = new javax.swing.JButton();
        jPanelRightAdminPortal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPaneAdminPortal.setBackground(new java.awt.Color(204, 204, 255));
        jSplitPaneAdminPortal.setBorder(null);
        jSplitPaneAdminPortal.setDividerLocation(250);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 51, 255)));

        JFrameSystemAdminJButtonDoctor.setText("Doctor");

        JFrameSystemAdminjButtonHospital.setText("Hospital");

        JFrameSystemAdminJButtonEncounter.setText("Encounter");

        JFrameSystemAdminJButtonCredentials.setText("Credentials");

        JFrameSystemAdminJButtonPatient.setText("Patient ");
        JFrameSystemAdminJButtonPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFrameSystemAdminJButtonPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JFrameSystemAdminJButtonPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JFrameSystemAdminJButtonDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JFrameSystemAdminjButtonHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JFrameSystemAdminJButtonEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JFrameSystemAdminJButtonCredentials, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JFrameSystemAdminJButtonPatient)
                .addGap(53, 53, 53)
                .addComponent(JFrameSystemAdminJButtonDoctor)
                .addGap(47, 47, 47)
                .addComponent(JFrameSystemAdminjButtonHospital)
                .addGap(50, 50, 50)
                .addComponent(JFrameSystemAdminJButtonEncounter)
                .addGap(50, 50, 50)
                .addComponent(JFrameSystemAdminJButtonCredentials)
                .addGap(202, 202, 202))
        );

        jSplitPaneAdminPortal.setLeftComponent(jPanel2);

        jPanelRightAdminPortal.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanelRightAdminPortalLayout = new javax.swing.GroupLayout(jPanelRightAdminPortal);
        jPanelRightAdminPortal.setLayout(jPanelRightAdminPortalLayout);
        jPanelRightAdminPortalLayout.setHorizontalGroup(
            jPanelRightAdminPortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 818, Short.MAX_VALUE)
        );
        jPanelRightAdminPortalLayout.setVerticalGroup(
            jPanelRightAdminPortalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );

        jSplitPaneAdminPortal.setRightComponent(jPanelRightAdminPortal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneAdminPortal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneAdminPortal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JFrameSystemAdminJButtonPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFrameSystemAdminJButtonPatientActionPerformed
JPanelPatientRecord patientRecord = new JPanelPatientRecord();
        jSplitPaneAdminPortal.setRightComponent(patientRecord );        // TODO add your handling code here:
    }//GEN-LAST:event_JFrameSystemAdminJButtonPatientActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdminPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JFrameSystemAdminJButtonCredentials;
    private javax.swing.JButton JFrameSystemAdminJButtonDoctor;
    private javax.swing.JButton JFrameSystemAdminJButtonEncounter;
    private javax.swing.JButton JFrameSystemAdminJButtonPatient;
    private javax.swing.JButton JFrameSystemAdminjButtonHospital;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelRightAdminPortal;
    private javax.swing.JSplitPane jSplitPaneAdminPortal;
    // End of variables declaration//GEN-END:variables
}