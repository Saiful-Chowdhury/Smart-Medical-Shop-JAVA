
import javax.swing.JOptionPane;
import java.sql.*;

import java.sql.Connection;
import dou.Connectionprovider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class AddMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
    /**
     * Creates new form AddMedicine
     */
    public AddMedicine() {
        initComponents();
        setLocationRelativeTo(null);
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
        closeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        medicineId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        medicineName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        companyNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pricePerUnit = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        medicineQuantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel1.setText("Add Medicine");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("Medicine ID:");

        medicineId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setText("Company Name:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setText("Price Per Unit:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setText("Quantity:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicineId, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(medicineName)
                    .addComponent(companyNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricePerUnit)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicineQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicineId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricePerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medicineQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addGap(15, 15, 15)))
                .addComponent(companyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void medicineIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineIdActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String uniqueId = medicineId.getText();
        String name = medicineName.getText();
        String companyName = companyNameField.getText();
        String quantity = medicineQuantity.getText();
        String price = pricePerUnit.getText();
        if(uniqueId.equals("")){
            JOptionPane.showMessageDialog(null,"Medicine ID field is required.");
        }
        else if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Medicine Name field is required.");
        }
        else if(companyName.equals("")){
            JOptionPane.showMessageDialog(null,"Company Name field is required.");
        }
        else if(quantity.equals("")){
            JOptionPane.showMessageDialog(null,"Quantity field is required.");
        }
        else if(quantity.matches("numberPattern")){
            JOptionPane.showMessageDialog(null,"Quantity field is Invalid.");
        }
        else if(price.equals("")){
            JOptionPane.showMessageDialog(null,"Price field is required.");
        }
        else if(price.matches("numberPattern")){
            JOptionPane.showMessageDialog(null,"Price field is Invalid.");
        }
        else{
            try{
                Connection con = Connectionprovider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into medicine(uniqueId,name,companyName,quantity,price) values(?,?,?,?,?)");
            ps.setString(1, uniqueId);
            ps.setString(2, name);
            ps.setString(3, companyName);
            ps.setString(4, quantity);
            ps.setString(5, price);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Medicine Added Successfuly!");
            setVisible(true);
            new AddMedicine().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            
        }
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField companyNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField medicineId;
    private javax.swing.JTextField medicineName;
    private javax.swing.JTextField medicineQuantity;
    private javax.swing.JTextField pricePerUnit;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
