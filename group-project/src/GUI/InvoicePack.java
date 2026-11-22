package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class InvoicePack extends javax.swing.JFrame {

    public InvoicePack() {
        initComponents();
        GenerateInvoId();
        setDateAndTime();
        deleteNullInvoiceInCheque();
        Toolkit t = getToolkit();
        Dimension d1 = t.getScreenSize();
        setSize(d1);
        //  JOptionPane.showMessageDialog(rootPane,d1);
        clear();
        lockPayment();
    }

//    public static InvoicePack ob;
//    public static InvoicePack getOb() {
//        if (ob == null) {
//            ob = new InvoicePack();
//        }
//        return ob;
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        SubTotalTxt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NetTotalTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        discountTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TimeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        barcodeTxt = new javax.swing.JTextField();
        InvoTxt = new javax.swing.JTextField();
        customerTxt = new javax.swing.JTextField();
        DateLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BalanceTxt = new javax.swing.JLabel();
        exchangeTxt = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        cashTxt = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        cardTxt = new javax.swing.JTextField();
        availabaleExchangeTxt = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        chequeTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Invoice");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SubTotalTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SubTotalTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SubTotalTxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Total:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Discount:");

        NetTotalTxt.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Net Total");

        discountTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                discountTxtFocusLost(evt);
            }
        });
        discountTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                discountTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NetTotalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(SubTotalTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(discountTxt))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(discountTxt))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(NetTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 370, 140));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 790, 370));

        TimeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TimeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 100, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton1.setText("Remove Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 50));

        payBtn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        payBtn.setText("PAY");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        jPanel2.add(payBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 120, 50));

        jButton29.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton29.setText("Remove All");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 50));

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 110, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 520, 130));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Customer Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 80, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Barcode Number:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));

        barcodeTxt.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        barcodeTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barcodeTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barcodeTxtMouseEntered(evt);
            }
        });
        barcodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barcodeTxtKeyReleased(evt);
            }
        });
        getContentPane().add(barcodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 30));

        InvoTxt.setEditable(false);
        getContentPane().add(InvoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 190, 30));

        customerTxt.setEditable(false);
        customerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTxtActionPerformed(evt);
            }
        });
        customerTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerTxtKeyReleased(evt);
            }
        });
        getContentPane().add(customerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 110, 30));

        DateLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DateLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 110, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Invoice Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 70, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Balance:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 630, 90, 30));

        BalanceTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BalanceTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BalanceTxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(BalanceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 630, 122, 30));

        exchangeTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        exchangeTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                exchangeTxtFocusLost(evt);
            }
        });
        exchangeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangeTxtActionPerformed(evt);
            }
        });
        exchangeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                exchangeTxtKeyReleased(evt);
            }
        });
        getContentPane().add(exchangeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, 179, 37));

        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton9.setText("EXCHANGE");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 460, 180, 50));

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton7.setText("CHEQUE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 460, 180, 50));

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
        getContentPane().add(cashTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 179, 37));

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton8.setText("CREDIT/DEBIT CARD");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 320, 180, 50));

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
        getContentPane().add(cardTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 180, 40));

        availabaleExchangeTxt.setEditable(false);
        availabaleExchangeTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        availabaleExchangeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabaleExchangeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(availabaleExchangeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 510, 179, 37));

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton10.setText("CASH");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 180, 50));

        chequeTxt.setEditable(false);
        chequeTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                chequeTxtFocusLost(evt);
            }
        });
        getContentPane().add(chequeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 510, 180, 40));

        jButton2.setText("Proceed For Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 370, 40));

        jLabel31.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel31MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cashTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashTxtActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        try {
            saveInvoice();
            saveInvoiceItem();
            payBtn.setEnabled(false);
            try {
                String invoiceNo = InvoTxt.getText().substring(5);
                MyDB.iud("update Cheque set InvoiceP_InvoiceP='" + invoiceNo + "' where InvoiceP_InvoiceP is null");

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int x = jTable1.getSelectedRow();
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.removeRow(x);
            getTotal();
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        try {
            int x = jTable1.getSelectedRow();
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            SubTotalTxt.setText("0");
            discountTxt.setText("0");
            NetTotalTxt.setText("0");
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void barcodeTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodeTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtMouseEntered

    private void barcodeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodeTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtMouseClicked
    static boolean Cartvalidate = true;
    static boolean CannotPurchase = false;

    private void barcodeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeTxtKeyReleased

        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            try {
                String barcode = barcodeTxt.getText();
                DefaultTableModel tb1 = (DefaultTableModel) jTable1.getModel();
                if (tb1.getRowCount() == 0) {
                    System.out.println(tb1.getRowCount() == 0);
                    Cartvalidate = true;
                    //   JOptionPane.showMessageDialog(rootPane, "row count o");
                } else {

                    for (int i = 0; i < tb1.getRowCount(); i++) {
                        String id = jTable1.getValueAt(i, 0).toString();
                        if (id.equals(barcode)) {
                            Cartvalidate = false;
                            //  JOptionPane.showMessageDialog(rootPane, "id.equals(barcode)");
                            // JOptionPane.showMessageDialog(rootPane, "already added");
                            break;
                        } else if (!(id.equals(barcode))) {
                            Cartvalidate = true;
                            //   JOptionPane.showMessageDialog(rootPane, "!(id.equals(barcode))");
                            // JOptionPane.showMessageDialog(rootPane, "add will you");
                        }
                    }
                }
                if (Cartvalidate) {
                    ResultSet rs1 = MyDB.search("select idPack,Category_name,SellingPrice from Pack where idPack='" + barcode + "' and SellingPrice not like '0' and quantity not like '0' ");
                    DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
                    while (rs1.next()) {
                        Vector v = new Vector();
                        v.add(rs1.getString(1));
                        v.add(rs1.getString(2));
                        v.add(rs1.getString(3));
                        tb.addRow(v);
                    }
                    getTotal();
                    barcodeTxt.setText("");
                    System.out.println(InvoTxt.getText().substring(5));
                }
            } catch (Exception e) {
                System.out.println("addToCart");
                e.printStackTrace();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtKeyReleased

    private void exchangeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exchangeTxtActionPerformed

    private void availabaleExchangeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabaleExchangeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availabaleExchangeTxtActionPerformed

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
        }       // TODO add your handling code here:
    }//GEN-LAST:event_cashTxtFocusLost

    private void cardTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardTxtFocusLost
        if (cardTxt.getText().equals("")) {
            cardTxt.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cardTxtFocusLost

    private void exchangeTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exchangeTxtFocusLost
        if (exchangeTxt.getText().equals("")) {
            exchangeTxt.setText("0");
        }
        setBalance();
// TODO add your handling code here:
    }//GEN-LAST:event_exchangeTxtFocusLost

    private void chequeTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_chequeTxtFocusLost
        if (chequeTxt.getText().equals("")) {
            chequeTxt.setText("0");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_chequeTxtFocusLost

    private void exchangeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exchangeTxtKeyReleased
        setLimitForExchange();
        setBalance();// TODO add your handling code here:
    }//GEN-LAST:event_exchangeTxtKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new ChequeRegistationInvoice().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void customerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTxtActionPerformed

    }//GEN-LAST:event_customerTxtActionPerformed

    private void customerTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerTxtKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            checkCustomer();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTxtKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // JOptionPane.showMessageDialog(rootPane, "closed yeh");
        deleteNullInvoiceInCheque();// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    boolean j = false;
    private void discountTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discountTxtKeyReleased
        try {
            discountTxt.setEnabled(true);
            j = false;
            ResultSet rs = MyDB.search("select DiscountLimit from Discount");
            if (rs.next()) {

                if (Double.parseDouble(discountTxt.getText()) > rs.getDouble(1)) {
                    discountTxt.setBackground(Color.red);
                    NetTotalTxt.setText("0");
                } else {
                    discountTxt.setBackground(Color.white);
                    NetTotalTxt.setText("");
                    int grandtot = Integer.parseInt(SubTotalTxt.getText());
                    int dis = Integer.parseInt(discountTxt.getText());
                    //double a = (grandtot * (1 - (dis * (0.01))));
                    double a = grandtot - (grandtot * (dis * (0.01)));

                    NetTotalTxt.setText(a + "");
                    //cashTextKeyReleased(evt);
                }
            } else if (!rs.next()) {
                j = true;
                JOptionPane.showMessageDialog(rootPane, "Discount limit is not determined!");
                discountTxt.setEnabled(false);
            }

        } catch (Exception e) {
            System.out.println("calculating discount");
            e.printStackTrace();
        }
    }//GEN-LAST:event_discountTxtKeyReleased

    private void jLabel31MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseMoved
        saveButtonStatus();
        if (j == false) {
            if (Double.parseDouble(SubTotalTxt.getText()) > 0) {
                discountTxt.setEnabled(true);
            } else {
                discountTxt.setEnabled(false);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTable1.getRowCount() != 0) {
            onPayment();
            j = true;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void discountTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_discountTxtFocusLost
        discountTxt.setText("0");      // TODO add your handling code here:
    }//GEN-LAST:event_discountTxtFocusLost

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new WholesalePurchase().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(InvoicePack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoicePack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoicePack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoicePack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
//                    WebLookAndFeel.install();
//                    WebLookAndFeel.initializeManagers();
//                    WebLookAndFeel.setAllowLinuxTransparency(true);
//                    WebLookAndFeel.setDecorateAllWindows(true);
//                    WebLookAndFeel.setDecorateFrames(true);
//                    WebLookAndFeel.isLeftToRight();

                    new InvoicePack().setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceTxt;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField InvoTxt;
    private static javax.swing.JTextField NetTotalTxt;
    private javax.swing.JLabel SubTotalTxt;
    private javax.swing.JLabel TimeLabel;
    private static javax.swing.JTextField availabaleExchangeTxt;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private static javax.swing.JTextField cardTxt;
    private static javax.swing.JTextField cashTxt;
    private static javax.swing.JTextField chequeTxt;
    private static javax.swing.JTextField customerTxt;
    private javax.swing.JTextField discountTxt;
    private static javax.swing.JTextField exchangeTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private static javax.swing.JButton payBtn;
    // End of variables declaration//GEN-END:variables

    private void addToCart() {

    }

    private void GenerateInvoId() {
        try {
            ResultSet r = MyDB.search("select max(InvoiceP) from InvoiceP");
            //System.out.println("before if");
            if (r.first()) {
                InvoTxt.setText("INV-W" + (r.getInt(1) + 1) + "");
                //System.out.println("true");
            } else if (!r.first()) {
                System.out.println("false");
                //InvoTxt.setText("1");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
                NetTotalTxt.setText(SubTotalTxt.getText());
            } else if (discountTxt.getText().equals("0")) {
                NetTotalTxt.setText(SubTotalTxt.getText());
            }
        } catch (Exception e) {
            System.out.println("gettotal");
            e.printStackTrace();
        }
    }
    static double d;

    private void saveInvoice() {
        //  double d=Double.parseDouble(cashTxt.getText())-Double.parseDouble(NetTotalTxt.getText());
        double all = Double.parseDouble(cardTxt.getText()) + Double.parseDouble(exchangeTxt.getText()) + Double.parseDouble(chequeTxt.getText());
        double canbe = Double.parseDouble(NetTotalTxt.getText()) - all;

        if (Double.parseDouble(cashTxt.getText()) >= canbe) {
            d = canbe;
        }
        try {
            MyDB.iud("insert into InvoiceP (InvoiceP,PackCustomer_idCustomer,date,time,subTotal,discount,netTotal,cash,CreditCard,exchange,payment,balance,User_idUser,DueAmount) values ('" + InvoTxt.getText().substring(5) + "','" + customerTxt.getText() + "','" + DateLabel.getText() + "','" + TimeLabel.getText() + "','" + SubTotalTxt.getText() + "','" + discountTxt.getText() + "','" + NetTotalTxt.getText() + "','" + d + "','" + cardTxt.getText() + "','" + exchangeTxt.getText() + "','" + cashTxt.getText() + "','" + BalanceTxt.getText() + "','" + Login.getUserIdRecord() + "','0')");
            //  JOptionPane.showMessageDialog(rootPane, "invoice save");
            
           
            double d=Double.parseDouble(availabaleExchangeTxt.getText())-Double.parseDouble(exchangeTxt.getText());
            MyDB.iud("update PackCustomer set Credit='"+d+"' where idCustomer='"+customerTxt.getText()+"'");
            
            
        } catch (Exception e) {
            System.out.println("save invoice");
            e.printStackTrace();
        }
    }

    private void saveInvoiceItem() {
        try {

            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            int i = tb.getRowCount();

            for (int j = 0; j < i; j++) {
                String itemid = jTable1.getValueAt(j, 0).toString();
                String name = jTable1.getValueAt(j, 1).toString();
                String up = jTable1.getValueAt(j, 2).toString();
                // String qty = jTable1.getValueAt(j, 3).toString();
                //String tot = jTable1.getValueAt(j, 4).toString();
                String idinvoice = barcodeTxt.getText();
                // int id = j + 1;
                //  String idd = Integer.toString(id);
                MyDB.iud("INSERT INTO invoiceItemP (InvoiceP_InvoiceP,Pack_idPack,name,unitPrice) VALUES ('" + InvoTxt.getText().substring(5) + "','" + itemid + "','" + name + "','" + up + "') ");

                JOptionPane.showMessageDialog(rootPane, "invoice save success");

                MyDB.iud("update pack set quantity='0' where idpack='" + itemid + "'");

            }
        } catch (Exception e) {
            System.out.println("from cart to invoiceItem table");
            e.printStackTrace();
        }
    }

    private void clear() {
        SubTotalTxt.setText("0");
        discountTxt.setText("0");
        NetTotalTxt.setText("0");
        cashTxt.setText("0");
        exchangeTxt.setText("0");
        cardTxt.setText("0");
        chequeTxt.setText("0");
        BalanceTxt.setText("0");
    }

    private void setLimitForCard() {

        double d = Double.parseDouble(NetTotalTxt.getText());
        double cash = Double.parseDouble(cashTxt.getText());
        double cheque = Double.parseDouble(chequeTxt.getText());
        double exchangej = Double.parseDouble(exchangeTxt.getText());
        double card = Double.parseDouble(cardTxt.getText());

        if (cash >= d) {
            cardTxt.setBackground(Color.red);
            JOptionPane.showMessageDialog(rootPane, "you exceed the limit");
            cardTxt.setText("0");
            cardTxt.setBackground(Color.white);
        } else {
            double limit = d - (cheque + exchangej + cash);
            if (!NetTotalTxt.getText().equals("")) {
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

    private void setLimitForExchange() {
        double d = Double.parseDouble(NetTotalTxt.getText());
        double cashj = Double.parseDouble(cashTxt.getText());
        double cheque = Double.parseDouble(chequeTxt.getText());
        double exchangej = Double.parseDouble(exchangeTxt.getText());
        double card = Double.parseDouble(cardTxt.getText());
        double available = Double.parseDouble(availabaleExchangeTxt.getText());

        double limit = d - (cheque + cashj + card);
        if (!NetTotalTxt.getText().equals("")) {
            if (exchangej > available) {
                exchangeTxt.setBackground(Color.red);
                JOptionPane.showMessageDialog(rootPane, "No money");

                exchangeTxt.setText("0");
                exchangeTxt.setBackground(Color.white);

            } else if (exchangej > limit) {
                exchangeTxt.setBackground(Color.red);
                JOptionPane.showMessageDialog(rootPane, "you exceed the limit");
                exchangeTxt.setText("0");
                exchangeTxt.setBackground(Color.white);
            } else if (exchangej <= limit) {
                exchangeTxt.setBackground(Color.white);
            }
        }
    }

    private void setBalance() {
        try {
            double all = Double.parseDouble(cardTxt.getText()) + Double.parseDouble(exchangeTxt.getText()) + Double.parseDouble(chequeTxt.getText());
            double canbe = Double.parseDouble(NetTotalTxt.getText()) - all;

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
        double d = Double.parseDouble(NetTotalTxt.getText());
        double cashj = Double.parseDouble(cashTxt.getText());
        double cheque = Double.parseDouble(chequeTxt.getText());
        double exchangej = Double.parseDouble(exchangeTxt.getText());
        double card = Double.parseDouble(cardTxt.getText());

        double limit = d - (exchangej + cashj + card);

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

    private void checkCustomer() {
        try {
            ResultSet rs = MyDB.search("select idCustomer from PackCustomer where idCustomer='" + customerTxt.getText() + "'");
            if (!rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "Invalid Customer");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setDataTxt(String cash, String cid) {
        availabaleExchangeTxt.setText(cash);
        customerTxt.setText(cid);

    }

    public static void saveButtonStatus() {
        double d = Double.parseDouble(cashTxt.getText()) + Double.parseDouble(chequeTxt.getText()) + Double.parseDouble(exchangeTxt.getText()) + Double.parseDouble(cardTxt.getText());
        if (NetTotalTxt.getText().equals("")) {
            payBtn.setEnabled(false);
            //printButton.setEnabled(false);
        } else if (NetTotalTxt.getText().equals("0")) {
            payBtn.setEnabled(false);
            // printButton.setEnabled(false);
        } else if (customerTxt.getText().equals("")) {
            payBtn.setEnabled(false);
            //  printButton.setEnabled(false);
        } else if (Double.parseDouble(NetTotalTxt.getText()) != d) {
            payBtn.setEnabled(false);
            //printButton.setEnabled(false);
        } else {
            payBtn.setEnabled(true);
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

    private void onPayment() {
        cashTxt.setEnabled(true);
        cardTxt.setEnabled(true);
        chequeTxt.setEnabled(true);
        exchangeTxt.setEnabled(true);
        jButton7.setEnabled(true);
        jButton10.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        discountTxt.setEnabled(false);
        barcodeTxt.setEnabled(false);
    }

    private void lockPayment() {
        cashTxt.setEnabled(false);
        cardTxt.setEnabled(false);
        chequeTxt.setEnabled(false);
        exchangeTxt.setEnabled(false);
        jButton7.setEnabled(false);
        jButton10.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);

    }

    private void printGRN() {
        try {

            InputStream stream = this.getClass().getResourceAsStream("/Report/InvoiceTest.jrxml");

            JasperReport jr = JasperCompileManager.compileReport(JRXmlLoader.load(stream));

            //JasperReport jr = JasperCompileManager.compileReport("H:\\FinalProject\\TestJasper\\InvoiceTest.jrxml");
            Map<String, Object> para = new HashMap<String, Object>();

            para.put("Invoice_No", Integer.parseInt(InvoTxt.getText().substring(5)));
            para.put("Cheque", chequeTxt.getText());
            para.put("parameter1", DateLabel.getText());
            para.put("parameter2", TimeLabel.getText());

            JasperPrint jp = JasperFillManager.fillReport(jr, para, MyDB.getMyCon());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
