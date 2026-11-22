/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class DuePayment extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public DuePayment() {
        initComponents();
        payBtn.setEnabled(false);
        //RedLabel.setVisible(false);
        setDateAndTime();
        clear();
//        Toolkit t = getToolkit();
//        Dimension d1 = t.getScreenSize();
//        setSize(d1);

//        invoId.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent evt) {
//                String Category = invoId.getEditor().getItem().toString();
//                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8) {
//                    invoId.setModel(DuePaymentCombo.getList(Category));
//
//                    if (invoId.getItemCount() > 0) {
//                        invoId.showPopup();
//                        if (evt.getKeyCode() != 8) {
//                            ((JTextComponent) invoId.getEditor().getEditorComponent()).select(Category.length(), invoId.getEditor().getItem().toString().length());
//                        } else {
//                            invoId.getEditor().setItem(Category);
//                        }
//                    } else {
//                        invoId.addItem(Category);
//
//                    }
//                }
//                if (evt.getKeyChar() == evt.VK_ENTER) {
//                    loadToTable();
//
//                }
//            }
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        customerTxt = new javax.swing.JTextField();
        DateLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BalanceTxt = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        cashTxt = new javax.swing.JTextField();
        cardTxt = new javax.swing.JTextField();
        chequeTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SubTotalTxt = new javax.swing.JLabel();
        DueTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        discountTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        payBtn = new javax.swing.JButton();
        NetTot = new javax.swing.JTextField();
        invoiceTxt = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Due Payment");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TimeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TimeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 140, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Customer Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 80, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Invoice Id");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        customerTxt.setEditable(false);
        customerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTxtActionPerformed(evt);
            }
        });
        getContentPane().add(customerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 170, 40));

        DateLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 130, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Balance:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 90, 40));

        BalanceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BalanceTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BalanceTxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(BalanceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 160, 40));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton7.setText("+");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 50, 40));

        cashTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cashTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cashTxtFocusLost(evt);
            }
        });
        cashTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashTxtActionPerformed(evt);
            }
        });
        cashTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashTxtKeyReleased(evt);
            }
        });
        getContentPane().add(cashTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 160, 40));

        cardTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cardTxtFocusLost(evt);
            }
        });
        cardTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cardTxtKeyReleased(evt);
            }
        });
        getContentPane().add(cardTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 160, 40));

        chequeTxt.setEditable(false);
        chequeTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                chequeTxtFocusLost(evt);
            }
        });
        getContentPane().add(chequeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 160, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cash", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 270, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cheque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 270, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Credit/Debit Card", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 270, 70));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Discount:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 90, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Total:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 90, 30));

        SubTotalTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SubTotalTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SubTotalTxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(SubTotalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 162, 30));

        DueTxt.setEditable(false);
        getContentPane().add(DueTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 240, 32));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Net Total");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 19));
        getContentPane().add(discountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 162, 30));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 660, 340));

        payBtn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        payBtn.setText("PAY DUE");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        getContentPane().add(payBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 180, 70));
        getContentPane().add(NetTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 160, 40));

        invoiceTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(invoiceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 160, 40));

        jLabel31.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel31MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 680));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cashTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashTxtActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        try {
            PayDue();

            try {
//                String invoiceNo = invoId.getEditor().getItem().toString().substring(5);
                MyDB.iud("update Cheque set InvoiceP_InvoiceP='" + getInvoice() + "' where InvoiceP_InvoiceP is null");

            } catch (Exception e) {
                e.printStackTrace();
            }
            printGRN();
            new WholesalePurchase().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_payBtnActionPerformed
    static boolean Cartvalidate = true;
    private void cashTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashTxtKeyReleased
        setBalance();
// TODO add your handling code here:
    }//GEN-LAST:event_cashTxtKeyReleased

    private void cardTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardTxtKeyReleased
        setLimitForCard();
        setBalance();// TODO add your handling code here:
    }//GEN-LAST:event_cardTxtKeyReleased

    private void cashTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cashTxtFocusLost
        if (cashTxt.getText().equals("")) {
            cashTxt.setText("0");

        }
        setBalance();    // TODO add your handling code here:
    }//GEN-LAST:event_cashTxtFocusLost

    private void cardTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardTxtFocusLost
        if (cardTxt.getText().equals("")) {
            cardTxt.setText("0");
        }
        setBalance();  // TODO add your handling code here:
    }//GEN-LAST:event_cardTxtFocusLost

    private void chequeTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chequeTxtFocusLost
        if (chequeTxt.getText().equals("")) {
            chequeTxt.setText("0");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_chequeTxtFocusLost

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new ChequeRegistationDue().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void customerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTxtActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jLabel31MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseMoved
        payDueBtnStatus();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseMoved

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
            java.util.logging.Logger.getLogger(DuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DuePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());

                    new DuePayment().setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceTxt;
    private javax.swing.JLabel DateLabel;
    private static javax.swing.JTextField DueTxt;
    private javax.swing.JTextField NetTot;
    private javax.swing.JLabel SubTotalTxt;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JTextField cardTxt;
    private static javax.swing.JTextField cashTxt;
    private static javax.swing.JTextField chequeTxt;
    private static javax.swing.JTextField customerTxt;
    private javax.swing.JTextField discountTxt;
    private javax.swing.JLabel invoiceTxt;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private static javax.swing.JButton payBtn;
    // End of variables declaration//GEN-END:variables
 public void setDataTxt(String cid) {
        customerTxt.setText(cid);

    }

    private void addToCart() {

    }

    private void getTotal() {
        try {
            int rc = jTable1.getRowCount();
            int tot = 0;
            for (int i = 0; i < rc; i++) {
                tot += Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            }
            SubTotalTxt.setText(tot + "");

            if (SubTotalTxt.getText().equals("0")) {
                discountTxt.setText("0");
                DueTxt.setText(SubTotalTxt.getText());
            } else if (discountTxt.getText().equals("0")) {
                DueTxt.setText(SubTotalTxt.getText());
            }
        } catch (Exception e) {
            System.out.println("gettotal");
            e.printStackTrace();
        }
    }
    static double d;

    private void PayDue() {
        //  double d=Double.parseDouble(cashTxt.getText())-Double.parseDouble(NetTotalTxt.getText());
        double all = Double.parseDouble(cardTxt.getText()) + Double.parseDouble(chequeTxt.getText());
        double canbe = Double.parseDouble(DueTxt.getText()) - all;

        if (Double.parseDouble(cashTxt.getText()) >= canbe) {
            d = canbe;
        }
        try {
            double a1 = (Double.parseDouble(cardTxt.getText()) + Double.parseDouble(chequeTxt.getText()) + Double.parseDouble(cashTxt.getText()))-Double.parseDouble(BalanceTxt.getText());
            double a2 = Double.parseDouble(DueTxt.getText()) - a1;
            MyDB.iud("update InvoiceP set DueAmount='" + a2 + "' where InvoiceP='" + getInvoice() + "'");
            JOptionPane.showMessageDialog(rootPane, "Payment Success!!");
        } catch (Exception e) {
            System.out.println("save invoice");
            e.printStackTrace();
        }
    }

    private void clear() {
        SubTotalTxt.setText("0");
        discountTxt.setText("0");
        DueTxt.setText("0");
        cashTxt.setText("0");
        cardTxt.setText("0");
        chequeTxt.setText("0");
        BalanceTxt.setText("0");
    }

    private void setLimitForCard() {

        double d = Double.parseDouble(DueTxt.getText());
        double cash = Double.parseDouble(cashTxt.getText());
        double cheque = Double.parseDouble(chequeTxt.getText());
        //  double exchangej = Double.parseDouble(exchangeTxt.getText());
        double card = Double.parseDouble(cardTxt.getText());

        if (cash >= d) {
            cardTxt.setBackground(Color.red);
            JOptionPane.showMessageDialog(rootPane, "you exceed the limit");
            cardTxt.setText("0");
            cardTxt.setBackground(Color.white);
        } else {
            double limit = d - (cheque + cash);
            if (!DueTxt.getText().equals("")) {
                if (card > limit) {
                    cardTxt.setBackground(Color.red);
                    JOptionPane.showMessageDialog(rootPane, "you exceed the limit");
                    cardTxt.setText("0");
                    cardTxt.setBackground(Color.white);
                } else if (cash <= limit) {
                    cardTxt.setBackground(Color.white);
                }
            }
        }

    }

//    private void setLimitForExchange() {
//        double d = Double.parseDouble(DueTxt.getText());
//        double cashj = Double.parseDouble(cashTxt.getText());
//        double cheque = Double.parseDouble(chequeTxt.getText());
//     //   double exchangej = Double.parseDouble(exchangeTxt.getText());
//        double card = Double.parseDouble(cardTxt.getText());
//      //  double available = Double.parseDouble(availabaleExchangeTxt.getText());
//
//        double limit = d - (cheque + cashj + card);
//        if (!DueTxt.getText().equals("")) {
//            if (exchangej > available) {
//                exchangeTxt.setBackground(Color.red);
//                JOptionPane.showMessageDialog(rootPane, "No money");
//
//                exchangeTxt.setText("0");
//                exchangeTxt.setBackground(Color.white);
//
//            } else if (exchangej > limit) {
//                exchangeTxt.setBackground(Color.red);
//                JOptionPane.showMessageDialog(rootPane, "you exceed the limit");
//                exchangeTxt.setText("0");
//                exchangeTxt.setBackground(Color.white);
//            } else if (exchangej <= limit) {
//                exchangeTxt.setBackground(Color.white);
//            }
//        }
//    }
    private void setBalance() {
        try {
            double all = Double.parseDouble(cardTxt.getText()) + Double.parseDouble(chequeTxt.getText());
            double canbe = Double.parseDouble(DueTxt.getText()) - all;

            double cash = Double.parseDouble(cashTxt.getText());
            if (cash > canbe) {
                BalanceTxt.setText(cash - canbe + "");
            } else if (cash < canbe) {
                BalanceTxt.setText("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updatePack() {
        try {

        } catch (Exception e) {
        }
    }

    public static double setLimitForCheque() {
        double d = Double.parseDouble(DueTxt.getText());
        double cashj = Double.parseDouble(cashTxt.getText());
        double cheque = Double.parseDouble(chequeTxt.getText());
        // double exchangej = Double.parseDouble(exchangeTxt.getText());
        double card = Double.parseDouble(cardTxt.getText());

        double limit = d - (card + cashj);

        return limit;
    }

    public static void setChequePayment() {
        try {
            ResultSet rs = MyDB.search("select sum(ChequeValue) from Cheque where InvoiceP_InvoiceP is null");
            while (rs.next()) {

                chequeTxt.setText(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deleteNullInvoiceInCheque() {
        try {
            MyDB.iud("delete from Cheque where InvoiceP_InvoiceP is null");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void loadToTable() {
        try {

            ResultSet rs = MyDB.search("select DueAmount,subTotal,discount,netTotal from InvoiceP where InvoiceP like '" + getInvoice() + "%'");
            while (rs.next()) {
                DueTxt.setText(rs.getString("DueAmount"));
                SubTotalTxt.setText(rs.getString("subTotal"));
                discountTxt.setText(rs.getString("discount"));
                NetTot.setText(rs.getString("netTotal"));
                if (rs.getString("DueAmount").equals("0")) {
                    //RedLabel.setVisible(true);
                    payBtn.setEnabled(false);
                    //JOptionPane.showMessageDialog(rootPane,"No Due");
                } else {
                    payBtn.setEnabled(true);
                    // RedLabel.setVisible(false);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
//            String id = invoId.getEditor().getItem().toString();
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            ResultSet rs = MyDB.search("select Pack_idPack,name,unitPrice,idinvoiceItemP from invoiceItemP where InvoiceP_InvoiceP ='" + getInvoice() + "'");
            while (rs.next()) {

                Vector v = new Vector();

                ResultSet rs1 = MyDB.search("select idinvoiceItemP from InvoiceItemReturn where idinvoiceItemP='" + rs.getString("idinvoiceItemP") + "'");
                v.add(rs.getString("Pack_idPack"));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                if (rs1.next()) {
                    v.add("Return");
                } else {
                    v.add("Accept");
                }
                tb.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String invoice;

    public String getInvoice() {
        return invoice.substring(5);
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
        loadToTable();
        invoiceTxt.setText("INV-W" + getInvoice());
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

    private static void payDueBtnStatus() {
        double all = Double.parseDouble(cardTxt.getText()) + Double.parseDouble(chequeTxt.getText()) + Double.parseDouble(cashTxt.getText());
        if (all > 0) {
            payBtn.setEnabled(true);
        } else {
            payBtn.setEnabled(false);
        }
    }

    private void printGRN() {
        try {
            
            InputStream stream = this.getClass().getResourceAsStream("/Report/DuePayment.jrxml");

            JasperReport jr = JasperCompileManager.compileReport(JRXmlLoader.load(stream));
            
            //JasperReport jr = JasperCompileManager.compileReport("H:\\FinalProject\\TestJasper\\DuePayment.jrxml");
            Map<String, Object> para = new HashMap<String, Object>();

           para.put("Invoice", invoiceTxt.getText().substring(5));
            para.put("Cheque", chequeTxt.getText());
            para.put("Customer", Integer.parseInt(customerTxt.getText()));
            para.put("Date", DateLabel.getText());
            para.put("Time", TimeLabel.getText());
            para.put("Cash", cashTxt.getText());
            para.put("Card", cardTxt.getText());
            para.put("Balance", BalanceTxt.getText());

            JasperPrint jp = JasperFillManager.fillReport(jr, para,MyDB.getMyCon());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
