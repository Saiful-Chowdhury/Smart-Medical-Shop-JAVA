/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class SellMedicine extends javax.swing.JFrame {

    /**
     * Creates new form SellMedicine
     */
    public SellMedicine() {
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

        jLabel1 = new javax.swing.JLabel();
        medicineName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        searchMedicine = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        customerPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        billButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addMedicineToSellList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sell Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 370, -1));

        medicineName.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(medicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 260, 40));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("Medicine Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        customerName.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });
        getContentPane().add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, 40));

        searchMedicine.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        searchMedicine.setText("Search");
        searchMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMedicineActionPerformed(evt);
            }
        });
        getContentPane().add(searchMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        customerPhone.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        getContentPane().add(customerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 240, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setText("Customer Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        billButton.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        billButton.setText("Bill");
        billButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billButtonActionPerformed(evt);
            }
        });
        getContentPane().add(billButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 30)); // NOI18N
        jLabel5.setText("Medicine List");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        addMedicineToSellList.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        addMedicineToSellList.setText("Add");
        getContentPane().add(addMedicineToSellList, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicine Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 450, 340));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 20)); // NOI18N
        jLabel6.setText("Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jTextField1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void searchMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMedicineActionPerformed

    private void billButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineToSellList;
    private javax.swing.JButton billButton;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField customerPhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField medicineName;
    private javax.swing.JButton searchMedicine;
    // End of variables declaration//GEN-END:variables
}