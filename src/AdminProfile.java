/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.sql.Connection;
import dou.Connectionprovider;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AdminProfile extends javax.swing.JFrame {
   public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
   String username="";
    /**
     * Creates new form AdminProfile
     * @param
     */
    public AdminProfile() {
        initComponents();
    
    }
       public AdminProfile(String tempUserName) {
        initComponents();
        username=tempUserName;
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
        adminProfileBackBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Profile");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 25, 244, -1));

        adminProfileBackBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminProfileBackBtn.setText("Back");
        adminProfileBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminProfileBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminProfileBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 16, -1, -1));

        jLabel2.setText("User Profile");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 164, -1, -1));

        labelName.setText("User Name");
        getContentPane().add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 192, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 50, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 220, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 50, 20));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 210, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));
        getContentPane().add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 210, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 220, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {
            Connection con = Connectionprovider.getCon();
          Statement st=con.createStatement();
            ResultSet rs = st.executeQuery("select *from appuser where email='"+username+"' ");
           
            while (rs.next()) {
                 txtName.setText(rs.getString("name"));
                    txtEmail.setText(rs.getString("email"));
                    txtPhone.setText(rs.getString("mobileNumber"));
                    txtAddress.setText(rs.getString("address"));
                      labelName.setText(rs.getString("name"));
              
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void adminProfileBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminProfileBackBtnActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new AdminDasboard(username).setVisible(true);
    }//GEN-LAST:event_adminProfileBackBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String email = txtEmail.getText();
        String mobileNumber = txtPhone.getText();
        String address = txtAddress.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "This field can't empty");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "This field can't empty");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Invalid Email Address");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "This field can't empty");
        } else if (mobileNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "This field can't empty");
        } else {
            try {
                Connection con = Connectionprovider.getCon();
                PreparedStatement ps = con.prepareStatement("update appuser set  name=?, email=?, mobileNumber=?, address=? where email=?");
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, mobileNumber);
                ps.setString(4, address);
                ps.setString(5, email);  // Set the email for the WHERE clause
              

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Information Updated Succesfully.");
                setVisible(false);
                new AdminProfile(username).setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminProfileBackBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
