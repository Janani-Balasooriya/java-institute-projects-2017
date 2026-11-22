/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.AbstractAction;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author My
 */
public class UpdatePriviledge extends javax.swing.JFrame {

    /**
     * Creates new form SetPriviledge
     */
    public UpdatePriviledge() {
        initComponents();
        jComboBox1.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                String Category = jComboBox1.getEditor().getItem().toString();
                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8) {
                    jComboBox1.setModel(ResetAccountCombo.getList(Category));

                    if (jComboBox1.getItemCount() > 0) {
                        jComboBox1.showPopup();
                        if (evt.getKeyCode() != 8) {
                            ((JTextComponent) jComboBox1.getEditor().getEditorComponent()).select(Category.length(), jComboBox1.getEditor().getItem().toString().length());
                        } else {
                            jComboBox1.getEditor().setItem(Category);
                        }
                    } else {
                        jComboBox1.addItem(Category);

                    }
                }
                if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

                    method();
                }

            }

            private void method() {
                Component[] components = (Component[]) getContentPane().getComponents();

                for (Component comp : components) {

                    if (comp instanceof JCheckBox) {
                        JCheckBox box = (JCheckBox) comp;
                        box.setSelected(false);
                    }
                }
                try {
                    if (jComboBox1.getEditor().getItem().toString().equals("Admin")) {
                        JOptionPane.showMessageDialog(rootPane, "This is admin account!");
                    } else {
                        ResultSet rs = MyDB.search("select username from login");
                        label1:
                        while (rs.next()) {
                            if (jComboBox1.getEditor().getItem().toString().equals(rs.getString(1))) {

                                JOptionPane.showMessageDialog(rootPane, "OK");
                                unlockStuff();
                                setPrivilege();
                                throw new Exception();
                            }

                        }
                        lockStuff();
                        JOptionPane.showMessageDialog(rootPane, "Invalid username!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void unlockStuff() {
                jButton1.setEnabled(true);
                setComponentVisibility(rootPane, JCheckBox.class, true);
            }

            private void lockStuff() {
                jButton1.setEnabled(false);
                setComponentVisibility(rootPane, JCheckBox.class, false);
            }
        }
        );

    }

    static void setComponentVisibility(Container container, Class<? extends Component> componentClass, boolean visible) {
        for (Component c : container.getComponents()) {
            if (componentClass.isAssignableFrom(c.getClass())) {
                c.setEnabled(visible);
            } else if (c instanceof Container) {
                setComponentVisibility((Container) c, componentClass, visible);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        invoiceW = new javax.swing.JCheckBox();
        invoiceRetail = new javax.swing.JCheckBox();
        returnpackW = new javax.swing.JCheckBox();
        returnItem = new javax.swing.JCheckBox();
        addCategory = new javax.swing.JCheckBox();
        packConfig = new javax.swing.JCheckBox();
        unpack = new javax.swing.JCheckBox();
        manageReturnItem = new javax.swing.JCheckBox();
        wholesaleStock = new javax.swing.JCheckBox();
        transfer = new javax.swing.JCheckBox();
        grn = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        RetailStock = new javax.swing.JCheckBox();
        chequeConfiguration = new javax.swing.JCheckBox();
        chequeDetails = new javax.swing.JCheckBox();
        manageReturnCheque = new javax.swing.JCheckBox();
        Backup = new javax.swing.JCheckBox();
        Restore = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SalesR = new javax.swing.JCheckBox();
        supplier = new javax.swing.JCheckBox();
        Cusomer = new javax.swing.JCheckBox();
        User = new javax.swing.JCheckBox();
        Discount = new javax.swing.JCheckBox();
        salesW = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        Discount_R = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invoiceW.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        invoiceW.setText("Invoice - Wholesale");
        invoiceW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceWActionPerformed(evt);
            }
        });
        getContentPane().add(invoiceW, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 210, 40));

        invoiceRetail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        invoiceRetail.setText("Invoice - Retail");
        getContentPane().add(invoiceRetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 170, 40));

        returnpackW.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        returnpackW.setText("Return - Wholesale");
        returnpackW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnpackWActionPerformed(evt);
            }
        });
        getContentPane().add(returnpackW, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 180, 40));

        returnItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        returnItem.setText("Return - Retail");
        getContentPane().add(returnItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 200, 40));

        addCategory.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addCategory.setText("Add Category");
        getContentPane().add(addCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, 40));

        packConfig.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        packConfig.setText("Pack Config");
        getContentPane().add(packConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 40));

        unpack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unpack.setText("Unpack");
        getContentPane().add(unpack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 40));

        manageReturnItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageReturnItem.setText("Manage Return Item");
        getContentPane().add(manageReturnItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 190, 40));

        wholesaleStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wholesaleStock.setText("Stock - Wholesale");
        getContentPane().add(wholesaleStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 170, 40));

        transfer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        transfer.setText("Transfer");
        getContentPane().add(transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, 40));

        grn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        grn.setText("GRN");
        getContentPane().add(grn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 170, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Update Privilege");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 240, 50));

        RetailStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RetailStock.setText("Stock - Retail");
        RetailStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetailStockActionPerformed(evt);
            }
        });
        getContentPane().add(RetailStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 170, 40));

        chequeConfiguration.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chequeConfiguration.setText("Cheque Configuration");
        getContentPane().add(chequeConfiguration, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 210, 40));

        chequeDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        chequeDetails.setText("Cheque Details");
        getContentPane().add(chequeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 170, 40));

        manageReturnCheque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageReturnCheque.setText("Manage Return Cheque");
        getContentPane().add(manageReturnCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 220, 40));

        Backup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Backup.setText("Backup");
        getContentPane().add(Backup, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 130, 40));

        Restore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Restore.setText("Restore");
        getContentPane().add(Restore, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 140, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "MASTER ENTRY"));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 210));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("CHEQUE"));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 240, 210));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder("SETTINGS"));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 230, 120));

        SalesR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SalesR.setText("Retail Sales");
        SalesR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesRActionPerformed(evt);
            }
        });
        getContentPane().add(SalesR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 170, 30));

        supplier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supplier.setText("Supplier");
        getContentPane().add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 170, 30));

        Cusomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cusomer.setText("Customer");
        Cusomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusomerActionPerformed(evt);
            }
        });
        getContentPane().add(Cusomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 170, 30));

        User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        User.setText("User");
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 170, 30));

        Discount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Discount.setText("D - Wholesale");
        Discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountActionPerformed(evt);
            }
        });
        getContentPane().add(Discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 170, 30));

        salesW.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salesW.setText("Wholesale Sales");
        salesW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesWActionPerformed(evt);
            }
        });
        getContentPane().add(salesW, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 170, 30));

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder("STOCK"));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, 190, 120));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "REGISTRATION"));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 220, 210));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder("SALES"));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 220, 120));

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "INVOICE"));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 230, 110));

        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "RETURN"));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 230, 100));

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 310, 40));

        Discount_R.setText("D - Retail");
        Discount_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Discount_RActionPerformed(evt);
            }
        });
        getContentPane().add(Discount_R, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, 40));

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Discount"));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 190, 150));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnpackWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnpackWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnpackWActionPerformed
    static int aa, bb, cc, dd, ee, ff, gg, hh, ii, jj, kk, ll, mm, nn, oo, pp, qq, rr, ss, uu, vv, ww, xx, yy, tt = 0;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            boolean a = invoiceW.isSelected();
            if (a) {
                aa = 1;
            }
            boolean b = returnpackW.isSelected();
            if (b) {
                bb = 1;
            }
            boolean c = SalesR.isSelected();
            if (c) {
                cc = 1;
            }
            boolean d = invoiceRetail.isSelected();
            if (d) {
                dd = 1;
            }
            boolean e = returnItem.isSelected();
            if (e) {
                ee = 1;
            }
            boolean f = addCategory.isSelected();
            if (f) {
                ff = 1;
            }
            boolean g = grn.isSelected();
            if (g) {
                gg = 1;
            }
            boolean h = packConfig.isSelected();
            if (h) {
                hh = 1;
            }
            boolean i = unpack.isSelected();
            if (i) {
                ii = 1;
            }
            boolean j = transfer.isSelected();
            if (j) {
                jj = 1;
            }
            boolean k = manageReturnItem.isSelected();
            if (k) {
                kk = 1;
            }
            boolean l = wholesaleStock.isSelected();
            if (l) {
                ll = 1;
            }
            boolean m = RetailStock.isSelected();
            if (m) {
                mm = 1;
            }
            boolean n = chequeDetails.isSelected();
            if (n) {
                nn = 1;
            }
            boolean o = chequeConfiguration.isSelected();
            if (o) {
                oo = 1;
            }
            boolean p = manageReturnCheque.isSelected();
            if (p) {
                pp = 1;
            }
            boolean q = Backup.isSelected();
            if (q) {
                qq = 1;
            }
            boolean r = Restore.isSelected();
            if (r) {
                rr = 1;
            }
            boolean s = supplier.isSelected();
            if (s) {
                ss = 1;
            }
            boolean t = Cusomer.isSelected();
            if (t) {
                tt = 1;
            }
            boolean u = User.isSelected();
            if (u) {
                uu = 1;
            }
            boolean v = Discount.isSelected();
            if (v) {
                vv = 1;
            }
            boolean w = salesW.isSelected();
            if (w) {
                ww = 1;
            }
            boolean x = Discount_R.isSelected();
            if (x) {
                xx = 1;
            }
            String id = "";
            ResultSet rs1 = MyDB.search("select DynamicPrivilege_idDynamicPrivilege from login where username ='" + jComboBox1.getEditor().getItem().toString() + "'");
            while (rs1.next()) {
                id = rs1.getString(1);
            }
            MyDB.iud("update dynamicprivilege set "
                    + "invoicew='" + aa + "',returnw='" + bb + "',SalesR='" + cc + "',invoicer='" + dd + "',returnr='" + ee + "',"
                    + "addcategory='" + ff + "',grn='" + gg + "',packconfig='" + hh + "',unpack='" + ii + "',transfer='" + jj + "',"
                    + "managereturnitem='" + kk + "',stockw='" + ll + "',stockR='" + mm + "',chequedetails='" + nn + "',"
                    + "chequeconfig='" + oo + "',managereturncheque='" + pp + "',backup='" + qq + "',restore='" + rr + "',supplier='" + ss + "'"
                    + ",customer='" + tt + "',user='" + uu + "',setdiscount='" + vv + "',salesW='" + ww + "',setdiscountR='" + xx + "' where idDynamicPrivilege='" + id + "'");

            JOptionPane.showMessageDialog(rootPane, "User Account Updated!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SalesRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalesRActionPerformed

    private void CusomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CusomerActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void DiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountActionPerformed

    private void salesWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesWActionPerformed

    private void RetailStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetailStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetailStockActionPerformed

    private void invoiceWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceWActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Discount_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Discount_RActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Discount_RActionPerformed
    static int pid;

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
            java.util.logging.Logger.getLogger(UpdatePriviledge.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePriviledge.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePriviledge.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePriviledge.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePriviledge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Backup;
    private javax.swing.JCheckBox Cusomer;
    private javax.swing.JCheckBox Discount;
    private javax.swing.JCheckBox Discount_R;
    private javax.swing.JCheckBox Restore;
    private javax.swing.JCheckBox RetailStock;
    private javax.swing.JCheckBox SalesR;
    private javax.swing.JCheckBox User;
    private javax.swing.JCheckBox addCategory;
    private javax.swing.JCheckBox chequeConfiguration;
    private javax.swing.JCheckBox chequeDetails;
    private javax.swing.JCheckBox grn;
    private javax.swing.JCheckBox invoiceRetail;
    private javax.swing.JCheckBox invoiceW;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox manageReturnCheque;
    private javax.swing.JCheckBox manageReturnItem;
    private javax.swing.JCheckBox packConfig;
    private javax.swing.JCheckBox returnItem;
    private javax.swing.JCheckBox returnpackW;
    private javax.swing.JCheckBox salesW;
    private javax.swing.JCheckBox supplier;
    private javax.swing.JCheckBox transfer;
    private javax.swing.JCheckBox unpack;
    private javax.swing.JCheckBox wholesaleStock;
    // End of variables declaration//GEN-END:variables
// private class CheckAllAction extends AbstractAction {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        }
//    }

    private void setPrivilege() {
        Component[] components = (Component[]) getContentPane().getComponents();

        for (Component comp : components) {

            if (comp instanceof JCheckBox) {
                JCheckBox box = (JCheckBox) comp;
                box.setSelected(false);
            }
        }
        try {
            String a = "";
            ResultSet rs1 = MyDB.search("select DynamicPrivilege_idDynamicPrivilege from login where username ='" + jComboBox1.getEditor().getItem().toString() + "'");
            while (rs1.next()) {
                a = rs1.getString(1);
            }
            ResultSet rs = MyDB.search("select * from DynamicPrivilege where idDynamicPrivilege='" + a + "'");
            System.out.println("outside");
            while (rs.next()) {

                if (rs.getString("InvoiceW").equals("1")) {
                    invoiceW.setSelected(true);

                }
                if (rs.getString("ReturnW").equals("1")) {
                    returnpackW.setSelected(true);
                }
                if (rs.getString("SalesR").equals("1")) {
                    SalesR.setSelected(true);
                }
                if (rs.getString("InvoiceR").equals("1")) {
                    invoiceRetail.setSelected(true);
                }
                if (rs.getString("ReturnR").equals("1")) {
                    returnItem.setSelected(true);
                }
                if (rs.getString("AddCategory").equals("1")) {
                    addCategory.setSelected(true);
                }
                if (rs.getString("GRN").equals("1")) {
                    grn.setSelected(true);
                }
                if (rs.getString("PackConfig").equals("1")) {
                    packConfig.setSelected(true);
                }
                if (rs.getString("Unpack").equals("1")) {
                    unpack.setSelected(true);
                }
                if (rs.getString("Transfer").equals("1")) {
                    transfer.setSelected(true);
                }
                if (rs.getString("ManageReturnItem").equals("1")) {
                    manageReturnItem.setSelected(true);
                }
                if (rs.getString("StockW").equals("1")) {
                    wholesaleStock.setSelected(true);
                }
                if (rs.getString("StockR").equals("1")) {
                    RetailStock.setSelected(true);
                }
                if (rs.getString("ChequeDetails").equals("1")) {
                    chequeDetails.setSelected(true);
                }
                if (rs.getString("ChequeConfig").equals("1")) {
                    chequeConfiguration.setSelected(true);
                }
                if (rs.getString("ManageReturnCheque").equals("1")) {
                    manageReturnCheque.setSelected(true);
                }
                if (rs.getString("Backup").equals("1")) {
                    Backup.setSelected(true);
                }
                if (rs.getString("Restore").equals("1")) {
                    Restore.setSelected(true);
                }
                if (rs.getString("Supplier").equals("1")) {
                    supplier.setSelected(true);
                }
                if (rs.getString("Customer").equals("1")) {
                    Cusomer.setSelected(true);
                }
                if (rs.getString("User").equals("1")) {
                    User.setSelected(true);
                }
                if (rs.getString("SetDiscount").equals("1")) {
                    Discount.setSelected(true);
                }
                if (rs.getString("SalesW").equals("1")) {
                    salesW.setSelected(true);
                }
                if (rs.getString("SetDiscountR").equals("1")) {
                    Discount_R.setSelected(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
