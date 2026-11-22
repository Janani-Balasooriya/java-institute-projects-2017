/*0
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
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
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.joda.time.Days;
import org.joda.time.LocalDate;

public class ReturnPack extends javax.swing.JFrame {

    public ReturnPack() {
        initComponents();
        setDateAndTime();
        clearMe();
        setDateAndTime();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TimeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        barcodeTxt = new javax.swing.JTextField();
        InvoTxt = new javax.swing.JTextField();
        customerTxt = new javax.swing.JTextField();
        DateLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ReturnBtn = new javax.swing.JButton();
        SubTotalTxt1 = new javax.swing.JLabel();
        discountTxt1 = new javax.swing.JTextField();
        NetTotalTxt1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Return - Wholesale");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 630, 410));

        TimeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TimeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 110, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Customer Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 80, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Barcode Number:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        barcodeTxt.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        barcodeTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barcodeTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barcodeTxtMouseEntered(evt);
            }
        });
        barcodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeTxtActionPerformed(evt);
            }
        });
        barcodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barcodeTxtKeyReleased(evt);
            }
        });
        getContentPane().add(barcodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, 30));

        InvoTxt.setEditable(false);
        getContentPane().add(InvoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 190, 30));

        customerTxt.setEditable(false);
        customerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerTxtActionPerformed(evt);
            }
        });
        getContentPane().add(customerTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 190, 30));

        DateLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Invoice Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 70, 30));

        ReturnBtn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        ReturnBtn.setText("RETURN");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 120, 50));

        SubTotalTxt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SubTotalTxt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SubTotalTxt1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(SubTotalTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 162, 30));

        discountTxt1.setEditable(false);
        getContentPane().add(discountTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 162, 30));

        NetTotalTxt1.setEditable(false);
        getContentPane().add(NetTotalTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 162, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Total:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 90, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Discount:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 90, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Net Total");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 90, 19));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Remove Red.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 40, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, -1, -1));
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            returnPack();
            System.out.println("Return ............");
            
            System.out.println("Set credit ............");
            
            barcodeTxt.setText("");
            clearMe();
            tb.setRowCount(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnBtnActionPerformed

    private void barcodeTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodeTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtMouseEntered

    private void barcodeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcodeTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtMouseClicked
    String j;
    static boolean Cartvalidate = true;
    private void barcodeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barcodeTxtKeyReleased
        try {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                //  clearMe();
                j = barcodeTxt.getText();
                //*****************************
                ResultSet rs1 = MyDB.search("select Pack_idPack,name,unitPrice,InvoiceP_InvoiceP from invoiceItemP where Pack_idPack='" + barcodeTxt.getText() + "'");
                DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
                if (rs1.last()) {
                    Vector v = new Vector();
                    v.add(rs1.getString(1));
                    v.add(rs1.getString(2));
                    v.add(rs1.getString(3));

                    int j = jTable1.getRowCount();
                    System.out.println(j);
                    for (int i = 0; i < j; i++) {
                        if (jTable1.getValueAt(i, 0).toString().equals(barcodeTxt.getText())) {
                            throw new Exception();
                        }
                    }
                    if (InvoTxt.getText().equals("")) {
                        tb.setRowCount(0);
                        tb.addRow(v);
                        barcodeTxt.setText("");
                    } else {
                        if (InvoTxt.getText().equals(rs1.getString(4))) {
                            tb.addRow(v);
                            barcodeTxt.setText("");
                        } else {

                            int i = JOptionPane.showConfirmDialog(rootPane, "Do you still want to quit? ");
                            if (i == 0) {
                                barcodeTxt.setText("");
                                clearMe();
                                tb.setRowCount(0);
                                tb.addRow(v);
                                barcodeTxt.setText("");
                            } else if (i == 1) {
                                barcodeTxt.setText("");
                            }
                        }
                    }

                    InvoTxt.setText(rs1.getString(4));
                }
                getTotalReturn();
                loadCart(InvoTxt.getText());
                //*****************************

                if (!checkReturnStatus()) {
                    JOptionPane.showMessageDialog(rootPane, "Return unavailable");
                    clearMe();

                    ReturnBtn.setEnabled(false);
                } else if (checkReturnStatus()) {
                    ResultSet rs2 = MyDB.search("select Quantity from Pack where idPack='" + j + "'");
                    if (rs2.next()) {
                        if (rs2.getInt(1) == 0) {
                            ReturnBtn.setEnabled(true);
                        } else if (rs2.getInt(1) == 1) {
                            JOptionPane.showMessageDialog(rootPane, "This item wasn't purchased!!");
                            clearMe();
                            ReturnBtn.setEnabled(false);

                        }
                    }
//                    if (rs2.first()) {
//                        ReturnBtn.setEnabled(true);
//                    } else if (!rs2.first()) {
//                        JOptionPane.showMessageDialog(rootPane, "This item wasn't purchased!!");
//                        clearMe();
//                        ReturnBtn.setEnabled(false);
//
//                    }

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtKeyReleased

    private void customerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        try {
            tb.removeRow(jTable1.getSelectedRow());
            getTotalReturn();
            if (jTable1.getRowCount() == 0) {
                InvoTxt.setText("");
                customerTxt.setText("");

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void barcodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ReturnPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnPack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//                    WebLookAndFeel.install();
//                    WebLookAndFeel.initializeManagers();
//                    WebLookAndFeel.setAllowLinuxTransparency(true);
//                    WebLookAndFeel.setDecorateAllWindows(true);
//                    WebLookAndFeel.setDecorateFrames(true);
//                    WebLookAndFeel.isLeftToRight();

                    new ReturnPack().setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateLabel;
    private static javax.swing.JTextField InvoTxt;
    private static javax.swing.JTextField NetTotalTxt1;
    private javax.swing.JButton ReturnBtn;
    private javax.swing.JLabel SubTotalTxt1;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JTextField barcodeTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField customerTxt;
    private javax.swing.JTextField discountTxt1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

//    private void getTotal() {
//        try {
//            int rc = jTable1.getRowCount();
//            int tot = 0;
//            for (int i = 0; i < rc; i++) {
//                tot += Integer.parseInt(jTable1.getValueAt(i, 2).toString());
//            }
//            SubTotalTxt.setText(tot + "");
//
//            if (SubTotalTxt.getText().equals("0")) {
//                discountTxt.setText("0");
//                NetTotalTxt.setText(SubTotalTxt.getText());
//            } else if (discountTxt.getText().equals("0")) {
//                NetTotalTxt.setText(SubTotalTxt.getText());
//            }
//        } catch (Exception e) {
//            System.out.println("gettotal");
//            e.printStackTrace();
//        }
//    }
    private void getTotalReturn() {
        try {
            int rc = jTable1.getRowCount();
            int tot = 0;
            for (int i = 0; i < rc; i++) {
                tot += Integer.parseInt(jTable1.getValueAt(i, 2).toString());
            }
            SubTotalTxt1.setText(tot + "");

            if (SubTotalTxt1.getText().equals("0")) {
                discountTxt1.setText("0");
                NetTotalTxt1.setText(SubTotalTxt1.getText());
            } else if (discountTxt1.getText().equals("0")) {
                NetTotalTxt1.setText(SubTotalTxt1.getText());
            }
        } catch (Exception e) {
            System.out.println("gettotal");
            e.printStackTrace();
        }
    }

    private void loadCart(String s) {
        try {
//            DefaultTableModel tb = (DefaultTableModel) jTable2.getModel();
//            ResultSet rs = MyDB.search("select Pack_idPack,name,unitPrice from invoiceItemP where InvoiceP_InvoiceP='" + s + "'");
//            tb.setRowCount(0);
//            // tb.setRowCount(0);
//            while (rs.next()) {
//                Vector v = new Vector();
//                v.add(rs.getString(1));
//                v.add(rs.getString(2));
//                v.add(rs.getString(3));
//                tb.addRow(v);
//            }
            ResultSet rs1 = MyDB.search("select subTotal,discount,netTotal,PackCustomer_idCustomer from invoiceP where InvoiceP='" + s + "'");
//
            while (rs1.next()) {
//                SubTotalTxt.setText(rs1.getString(1));
//                discountTxt.setText(rs1.getString(2));
//                NetTotalTxt.setText(rs1.getString(3));
                customerTxt.setText(rs1.getString(4));
            }
//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearMe() {
        DefaultTableModel tb11 = (DefaultTableModel) jTable1.getModel();
//        DefaultTableModel tb12 = (DefaultTableModel) jTable2.getModel();
        tb11.setRowCount(0);
//        tb12.setRowCount(0);
        InvoTxt.setText("");
//        SubTotalTxt.setText("0");
        SubTotalTxt1.setText("0");
//        discountTxt.setText("0");
        discountTxt1.setText("0");
//        NetTotalTxt.setText("0");
        NetTotalTxt1.setText("0");
        customerTxt.setText("");
    }
    static int s;
    static int returnId;

    private void returnPack() {
        try {
            String dd = DateLabel.getText();
            String time = TimeLabel.getText();
            String fulltot = NetTotalTxt1.getText();
            String customer = customerTxt.getText();
            int invoId = Integer.parseInt(InvoTxt.getText());
            MyDB.iud("insert into InvoiceReturn (idInvoiceReturn,Date,Time,FullTotal,PackCustomer_idCustomer,User_idUser,Cash) values ('" + invoId + "','" + dd + "','" + time + "','" + fulltot + "','" + customer + "','" + Login.getUserIdRecord() + "','" + fulltot + "')");

            JOptionPane.showMessageDialog(rootPane, "invoice return success");
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            int i = tb.getRowCount();
            for (int j = 0; j < jTable1.getRowCount(); j++) {
                int barcode = Integer.parseInt(jTable1.getValueAt(j, 0).toString());
                double price = Double.parseDouble(jTable1.getValueAt(j, 2).toString());

                ResultSet rs = MyDB.search("select idinvoiceitemP from invoiceItemP where Pack_idPack='" + barcode + "' and InvoiceP_InvoiceP='" + invoId + "'");
                ResultSet r = MyDB.search("select max(idinvoiceReturn) from invoiceReturn");

                while (r.next()) {
                    returnId = r.getInt(1);
                }
                while (rs.next()) {
                    s = rs.getInt(1);
                    MyDB.iud("insert into invoiceItemReturn (qty,subtotal,idInvoiceReturn,idinvoiceItemP) values ('" + 1 + "','" + price + "','" + returnId + "','" + s + "')");
                    MyDB.iud("update Pack set Quantity='1' where idPack='" + barcode + "'");
                    MyDB.iud("update invoiceItemP set Qty='0' where idinvoiceitemP='" + s + "'");
                }
                JOptionPane.showMessageDialog(rootPane, "invoice item return success");
                // MyDB.iud("update Pack set Quantity='1'");
                setCredit();
                printReport();
            }

        } catch (MySQLIntegrityConstraintViolationException e1) {
            JOptionPane.showMessageDialog(rootPane,"You can't return items from this invoice!","Return not access",JOptionPane.WARNING_MESSAGE);
            clearMe();
        } catch (Exception e) {
            System.out.println("return");
            e.printStackTrace();
        }
    }
    static Date BillDate;
    static int ReturnDateCount = 7;

    public boolean checkReturnStatus() {
        boolean returnstatus = false;
        try {
            String inv = InvoTxt.getText();
            ResultSet rs = MyDB.search("select date from invoiceP where InvoiceP like '" + inv + "%'");

            while (rs.next()) {
                BillDate = rs.getDate(1);
            }
            LocalDate from = LocalDate.fromDateFields(BillDate);
            //System.out.println(from);

            String Today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            Date today = new SimpleDateFormat("yyyy-MM-dd").parse(Today);
            LocalDate to = LocalDate.fromDateFields(today);
            //System.out.println(to);

            Days days = Days.daysBetween(from, to);
            int daysCount = days.getDays();
            //  System.out.println(daysCount + "   " + (daysCount <= 7));

            if (daysCount <= 3) {
                returnstatus = true;
            }
            //find whether item is purchased or not

        } catch (Exception e) {
            e.printStackTrace();

        }

        return returnstatus;
    }
    Date d;
    SimpleDateFormat sdf;

    private void setDateAndTime() {
        Timer t = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                d = new Date();
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                DateLabel.setText(sdf.format(d));
                sdf = new SimpleDateFormat("HH:mm:ss");
                TimeLabel.setText(sdf.format(d));
            }
        });
        t.start();
    }
    static double d1;

    private void setCredit() {
        System.out.println("one");
        try {
            ResultSet rs = MyDB.search("select Credit from PackCustomer where idCustomer='" + customerTxt.getText() + "'");
            System.out.println("two");
            if (rs.first()) {
                System.out.println("three");
                d1 = rs.getDouble(1);
            }
            System.out.println("four");
            double d2 = Double.parseDouble(NetTotalTxt1.getText());
            System.out.println("five");
            double tot = d1 + d2;
            System.out.println("six");
            MyDB.iud("update PackCustomer set Credit='" + tot + "' where idCustomer='" + customerTxt.getText() + "'");
            System.out.println("seven");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printReport() {
        try {
            InputStream stream = this.getClass().getResourceAsStream("/Report/ReturnPack.jrxml");

            Map<String, Object> params = new HashMap<String, Object>();
            params.put("Invoice", InvoTxt.getText());
            params.put("Customer", Integer.parseInt(customerTxt.getText()));
            params.put("Date", DateLabel.getText());
            params.put("Time", TimeLabel.getText());
            params.put("Cash", SubTotalTxt1.getText());
            params.put("Card", discountTxt1.getText());
            params.put("Cheque", NetTotalTxt1.getText());

            JRTableModelDataSource jtb = new JRTableModelDataSource(jTable1.getModel());

            JasperReport jasperReport = JasperCompileManager.compileReport(JRXmlLoader.load(stream));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, jtb);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
