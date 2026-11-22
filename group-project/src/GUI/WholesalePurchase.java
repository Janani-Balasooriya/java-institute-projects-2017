package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class WholesalePurchase extends javax.swing.JFrame {
    
    public WholesalePurchase() {
        initComponents();
        warningLabel.setVisible(false);
        PendingDueLabel.setVisible(false);
        invoTxt.setVisible(false);
        chequeNu.setVisible(false);
        jLabel3.setVisible(false);
        setDateAndTime();
        jButton2.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        custTxt = new javax.swing.JTextField();
        warningLabel = new javax.swing.JLabel();
        invoTxt = new javax.swing.JLabel();
        chequeNu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DateLabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PendingDueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custTxtActionPerformed(evt);
            }
        });
        custTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custTxtKeyReleased(evt);
            }
        });
        getContentPane().add(custTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 70));

        warningLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));
        warningLabel.setText("       Invalid Number!");
        warningLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        getContentPane().add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 50));

        invoTxt.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(invoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 380, 60));

        chequeNu.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        getContentPane().add(chequeNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 380, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customer's Id :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("You have pending cheques");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 360, 90));

        jButton1.setText("Customer Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 140, 60));

        DateLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DateLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 30));

        TimeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TimeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 100, 30));

        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("Check all details from here.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 380, -1));

        PendingDueLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(PendingDueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 400, 350));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String cash;
    private void custTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custTxtKeyReleased
        try {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                customerStatus();
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_custTxtKeyReleased

    private void custTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new  Pack_Customer().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new chequeDetails().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(WholesalePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WholesalePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WholesalePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WholesalePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WholesalePurchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel PendingDueLabel;
    private javax.swing.JLabel TimeLabel;
    private static javax.swing.JLabel chequeNu;
    private static javax.swing.JTextField custTxt;
    private static javax.swing.JLabel invoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
    private void customerStatus() {
        try {
            ResultSet rs = MyDB.search("select * from PackCustomer where idCustomer='" + custTxt.getText() + "'");
            if (rs.next()) {
                warningLabel.setVisible(false);
                
                ResultSet rs1 = MyDB.search("select i.PackCustomer_idCustomer,i.InvoiceP,c.ChequeNo,c.InvoiceP_InvoiceP,i.DueAmount,c.status from InvoiceP i join Cheque c on i.InvoiceP=c.InvoiceP_InvoiceP where i.PackCustomer_idCustomer='" + custTxt.getText() + "' and (status='Pending' or status='Return') order by i.DueAmount DESC, c.status");
                
                if (rs1.first()) {
                    if (rs1.getInt("i.DueAmount") != 0) {
                        DuePayment a = new DuePayment();
                        a.setVisible(true);
                        a.setDataTxt(custTxt.getText());
                        a.setInvoice("INV-W" + rs1.getString("i.InvoiceP"));
                        //*********************

                        this.dispose();
//                    }else if((rs1.getInt("i.DueAmount")== 0)&(rs1.getString("c.status"))"Return"){

                    } else if (rs1.getString("c.status").equals("Pending")) { //here's the error
                        jLabel3.setVisible(true);
                        PendingDueLabel.setVisible(true);
                        invoTxt.setVisible(true);
                        chequeNu.setVisible(true);
                        invoTxt.setText("Invoice Number is " + "INV-W" + rs1.getString(2));
                        chequeNu.setText("Cheque Number is : " + rs1.getString(3));
                        jButton2.setVisible(true);
                        
                    } else {
                        new InvoicePack().setVisible(true);
                        ResultSet rs2 = MyDB.search("select Credit from PackCustomer where idCustomer='" + custTxt.getText() + "'");
                        if (rs2.first()) {
                            cash = rs2.getString(1);
                            
                        }
                        System.out.println("Cash is " + cash);
                        InvoicePack.setDataTxt(cash, custTxt.getText());
                        this.dispose();
                    }
                    
                } else {
                    new InvoicePack().setVisible(true);
                    ResultSet rs2 = MyDB.search("select Credit from PackCustomer where idCustomer='" + custTxt.getText() + "'");
                    if (rs2.first()) {
                        cash = rs2.getString(1);
                    }
                    System.out.println("Cash is " + cash);
                    InvoicePack.setDataTxt(cash, custTxt.getText());
                    this.dispose();
                }
            } else {
                warningLabel.setVisible(true);
                PendingDueLabel.setVisible(false);
                invoTxt.setVisible(false);
                chequeNu.setVisible(false);
                jButton2.setVisible(false);
                jLabel3.setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    Date date;
    SimpleDateFormat sdf;
    
    private void setDateAndTime() {
        
        Timer t = new Timer(1000, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                date = new Date();
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                DateLabel.setText(sdf.format(date));
                sdf = new SimpleDateFormat("HH:mm:ss");
                TimeLabel.setText(sdf.format(date));
            }
        });
        t.start();
    }
}
