/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.HospitalAdmin;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.Hospital;
import resources.Validations;
import view.MainJFrame;

/**
 *
 * @author karan
 */
public class HospitalViewUpdate extends javax.swing.JPanel {

    /**
     * Creates new form HospitalViewUpdate
     */
    
    Vector originalTableModel;
    Validations validations;
    public HospitalViewUpdate() {
        initComponents();
        MainJFrame.defaultSearchText(txtSearch, "Search by city or community");
        validations = new Validations();
        populateTable();
        originalTableModel = (Vector) ((DefaultTableModel) tblDetails.getModel()).getDataVector().clone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        lblCommunityRecord = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        valName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        txtAbout = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        valAbout = new javax.swing.JLabel();
        valAddress = new javax.swing.JLabel();
        valZipCode = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "City", "Comunity", "Name", "About", "Address", "ZipCode", "object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(4).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(4).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(4).setMaxWidth(0);
            tblDetails.getColumnModel().getColumn(5).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(5).setMaxWidth(0);
            tblDetails.getColumnModel().getColumn(6).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        lblCommunityRecord.setFont(new java.awt.Font("Lava Kannada", 1, 18)); // NOI18N
        lblCommunityRecord.setForeground(new java.awt.Color(204, 204, 204));
        lblCommunityRecord.setText("Hospital record");

        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblCity.setForeground(new java.awt.Color(204, 204, 204));
        lblCity.setText("City : ");

        lblCommunity.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(204, 204, 204));
        lblCommunity.setText("Community :");

        txtCity.setEditable(false);

        txtCommunity.setEditable(false);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(204, 204, 204));
        lblName.setText("About :");

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valName.setForeground(new java.awt.Color(204, 204, 204));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblName1.setForeground(new java.awt.Color(204, 204, 204));
        lblName1.setText("Name :");

        lblName2.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblName2.setForeground(new java.awt.Color(204, 204, 204));
        lblName2.setText("Zip Code :");

        lblName3.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        lblName3.setForeground(new java.awt.Color(204, 204, 204));
        lblName3.setText("Address :");

        txtAbout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAboutKeyReleased(evt);
            }
        });

        txtZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipCodeKeyReleased(evt);
            }
        });

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        valAbout.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAbout.setForeground(new java.awt.Color(204, 204, 204));

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAddress.setForeground(new java.awt.Color(204, 204, 204));

        valZipCode.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valZipCode.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Lava Kannada", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity)
                            .addComponent(lblCommunity))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                .addComponent(txtCommunity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblName1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCommunityRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSearch))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblName3)
                                    .addComponent(lblName2))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunityRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunity))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblName1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName3)
                    .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName2)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btn_create))
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetailsMouseClicked

        DefaultTableModel tblModel = (DefaultTableModel) tblDetails.getModel();

        // set data to textfield when raw is selected

        String tblCity = tblModel.getValueAt(tblDetails.getSelectedRow(),0).toString();
        String tblCommunity = tblModel.getValueAt(tblDetails.getSelectedRow(),1).toString();
        String tblName = tblModel.getValueAt(tblDetails.getSelectedRow(),2).toString();
        String tblAbout = tblModel.getValueAt(tblDetails.getSelectedRow(),3).toString();
        String tblAddress = tblModel.getValueAt(tblDetails.getSelectedRow(),4).toString();
        String tblZipCode = tblModel.getValueAt(tblDetails.getSelectedRow(),5).toString();
        

        txtCity.setText(tblCity);
        txtCommunity.setText(tblCommunity);
        txtName.setText(tblName);
        txtAbout.setText(tblAbout);
        txtAddress.setText(tblAddress);
        txtZipCode.setText(tblZipCode);
        
        setValidationsNull();

    }//GEN-LAST:event_tblDetailsMouseClicked

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed

        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        HospitalAdminJFrame adminArea = new HospitalAdminJFrame();
        adminArea.setVisible(true);
        adminArea.setHospitalCreateView();

    }//GEN-LAST:event_btn_createActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectRowIndex = tblDetails.getSelectedRow();
        if (selectRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        Hospital selectedDetails = (Hospital) model.getValueAt(selectRowIndex, 6); 

        // Validation
        var valid = true;

        // Validations
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        } else if (!(txtName.getText().equals(selectedDetails.getName())) && MainJFrame.hospitalDirectory.isHospitalExistInCity(txtName.getText(), selectedDetails.getCity())) {
            valName.setText("Hospital already Exist");
            valid = false;
        }
        
        if (!this.validations.ValidateEmpty(txtAbout.getText()) ) {
            valAbout.setText("Details are required");
            valid = false;
        }
        
        if (!this.validations.ValidateEmpty(txtAddress.getText()) ) {
            valAddress.setText("Address is required");
            valid = false;
        }
        
        if (!this.validations.ValidateZip(txtZipCode.getText()) ) {
            valZipCode.setText("Zip Code is invalid");
            valid = false;
        }

        // Validations ended

        if (valid) {

            // Set value
            selectedDetails.setName(txtName.getText());
            selectedDetails.setAbout(txtAbout.getText());
            selectedDetails.setAddress(txtAddress.getText());
            selectedDetails.setZipCode(Integer.parseInt(txtZipCode.getText()));
            JOptionPane.showMessageDialog(this, "Updated the details successfully");

            populateTable();
            originalTableModel = (Vector) ((DefaultTableModel) tblDetails.getModel()).getDataVector().clone();
            setValidationsNull();
            setTextNull();

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        
        setTextNull();
        setValidationsNull();
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();

        model.setRowCount(0);
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().toLowerCase().contains(txtSearch.getText())) {
                    //content found so adding to table
                    model.addRow(rowVector);
                    break;
                }
            }

        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased

        int selectRowIndex = tblDetails.getSelectedRow();
        if (selectRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        String name = model.getValueAt(selectRowIndex, 2).toString();
        Hospital h = (Hospital) model.getValueAt(selectRowIndex, 6);
        
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
        } else if (!(txtName.getText().equals(name)) && MainJFrame.hospitalDirectory.isHospitalExistInCity(txtName.getText(), h.getCity())) {
            valName.setText("Hospital already Exist");
        }
        else {
            valName.setText(null);
        }

    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAboutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAboutKeyReleased
        if (!this.validations.ValidateEmpty(txtAbout.getText()) ) {
            valAbout.setText("Details are required");
        }
        else {
            valAbout.setText(null);
        }
    }//GEN-LAST:event_txtAboutKeyReleased

    private void txtZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipCodeKeyReleased
        if (!this.validations.ValidateZip(txtZipCode.getText()) ) {
            valZipCode.setText("Zip Code is invalid");
        }
        else {
            valZipCode.setText(null);
        }
    }//GEN-LAST:event_txtZipCodeKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        if (!this.validations.ValidateEmpty(txtAddress.getText()) ) {
            valAddress.setText("Address is required");
        }
        else {
            valAddress.setText(null);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        
        for (Hospital c : MainJFrame.hospitalDirectory.getHospitalList()){
            Object[] row = new Object[7];
            row[0] = c.getCity().getName();
            row[1] = c.getCommunity().getName();
            row[2] = c.getName();
            row[3] = c.getAbout();
            row[4] = c.getAddress();
            row[5] = c.getZipCode();
            row[6] = c;
            
            model.addRow(row);
        }
    }
    
    private void setValidationsNull() {
        valAbout.setText(null);
        valAddress.setText(null);
        valName.setText(null);
        valZipCode.setText(null);
    }
    
    private void setTextNull() {
        txtAbout.setText(null);
        txtAddress.setText(null);
        txtCity.setText(null);
        txtCommunity.setText(null);
        txtName.setText(null);
        txtZipCode.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunityRecord;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtAbout;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JLabel valAbout;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valZipCode;
    // End of variables declaration//GEN-END:variables
}
