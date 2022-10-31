/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.CommunityAdmin;

//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.InputStream;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.City;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import view.MainJFrame;
//import models.CommunityDirectory.CommunityDirectory;



/**
 *
 * @author karan
 */
public class CommunityCreate extends javax.swing.JPanel {

    /**
     * Creates new form CommunityCreate
     */
    City city;
    
    public CommunityCreate() {
        initComponents();
        AutoCompleteDecorator.decorate(dd_city);
        
        try {
            InputStream is = new FileInputStream("src/main/java/resources/city.json");
            String jsonTxt = IOUtils.toString(is, "UTF-8");
            JSONArray cityList = new JSONObject(jsonTxt).getJSONArray("city");
            
            for (int i = 0; i < cityList.length(); i++) {
                dd_city.addItem(cityList.get(i).toString());}
            
        } catch (IOException | JSONException e) {
            System.out.println(e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dd_city = new javax.swing.JComboBox<>();
        txt_community = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_back_community_admin = new javax.swing.JButton();
        val_community = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(204, 204, 0));

        jLabel1.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("City : ");

        jLabel2.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Community :");

        dd_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dd_cityActionPerformed(evt);
            }
        });

        txt_community.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_communityKeyReleased(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_back_community_admin.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        btn_back_community_admin.setText("Back");
        btn_back_community_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back_community_adminActionPerformed(evt);
            }
        });

        val_community.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        val_community.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_back_community_admin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                            .addComponent(btn_save))
                        .addComponent(dd_city, javax.swing.GroupLayout.Alignment.LEADING, 0, 213, Short.MAX_VALUE)
                        .addComponent(txt_community, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(val_community, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dd_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(val_community, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_back_community_admin))
                .addContainerGap(275, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_back_community_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back_community_adminActionPerformed
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        CommunityAdmin adminArea = new CommunityAdmin();
        adminArea.setVisible(true);
        
    }//GEN-LAST:event_btn_back_community_adminActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        var valid = true;
        
        if (txt_community.getText().isEmpty()) {
            val_community.setText("Community name is required");
            valid = false;
        }
        
        if (!txt_community.getText().isEmpty() && MainJFrame.communityDirectory.isCommunityByCityExist(city, txt_community.getText())) {
            val_community.setText("Community name already exist for this city");
            valid = false;
        } else {
            val_community.setText(null);
        }
        
        if (valid) {
            MainJFrame.communityDirectory.newCommunity(txt_community.getText(), city);
            JOptionPane.showMessageDialog(this, "New Community Added");
            txt_community.setText(null);
            val_community.setText(null);
        }
        
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_communityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_communityKeyReleased
        
        String city_name = dd_city.getSelectedItem().toString();
        if (MainJFrame.cityDirectory.findCity(city_name) == null) {
            city = MainJFrame.cityDirectory.newCity(city_name);
        } else {
            city = MainJFrame.cityDirectory.findCity(city_name);
        }
        
        
        if (txt_community.getText().isEmpty()) {
            val_community.setText("Community name is required");
        } else if (MainJFrame.communityDirectory.isCommunityByCityExist(city, txt_community.getText())) {
            val_community.setText("Community name already exist for this city");
        } else {
            val_community.setText(null);
        }
    }//GEN-LAST:event_txt_communityKeyReleased

    private void dd_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dd_cityActionPerformed
        String city_name = dd_city.getSelectedItem().toString();
        if (MainJFrame.cityDirectory.findCity(city_name) == null) {
            city = MainJFrame.cityDirectory.newCity(city_name);
        } else {
            city = MainJFrame.cityDirectory.findCity(city_name);
        }
        
        if (!txt_community.getText().isEmpty() && MainJFrame.communityDirectory.isCommunityByCityExist(city, txt_community.getText())) {
            val_community.setText("Community name already exist for this city");
        } else {
            val_community.setText(null);
        }
    }//GEN-LAST:event_dd_cityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back_community_admin;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> dd_city;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_community;
    private javax.swing.JLabel val_community;
    // End of variables declaration//GEN-END:variables
}
