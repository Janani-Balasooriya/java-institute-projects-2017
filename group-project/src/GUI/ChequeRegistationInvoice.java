package GUI;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class ChequeRegistationInvoice extends javax.swing.JFrame {

    public ChequeRegistationInvoice() {
        initComponents();
        //    setLocationRelativeTo(null);
        currentdate();
        refreshTable();
        currenttime();
        // cleartf();
        decideSaveStatus();
        decidechequetype();
        lod();
    }
    static String cno;
    static String branchname;
    static String AccountNo;
    static String cdate;
    static String cvalue;
    static String owner;
    static String status;

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        chequevalue = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Cheque Registation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 410, -1));

        jLabel2.setText("Cheque number :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setText("Branch name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 168, -1, -1));

        jLabel4.setText("Account number :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 213, -1, -1));

        jLabel5.setText("Cheque date :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel6.setText("cheque value :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel7.setText("Owner :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel8.setText("status :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 200, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 168, 200, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 210, 200, -1));

        chequevalue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                chequevalueKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chequevalueKeyTyped(evt);
            }
        });
        jPanel1.add(chequevalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 200, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 200, -1));

        jLabel19.setText("Pending");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 60, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 200, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Cash cheque");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Date cheque");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 120, 50));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 130, 50));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cheque number", "Branch name", "Account no", "Cheque date", "Cheque value", "Owner", "Cheque type", "Status"
            }
        ));
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTable1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Cheque number");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Branch name");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Account no");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Cheque date");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Cheque value");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Owner");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Cheque type");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Status");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 790, 600));

        date.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 190, 40));

        time.setBorder(javax.swing.BorderFactory.createTitledBorder("Time"));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 180, 40));

        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 290, 90));

        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 74, 410, 440));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 120, 50));

        jLabel11.setText("Cheque Type :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1289, 691));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static boolean b;
    static String type;


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cno = jTextField1.getText();
        branchname = jTextField2.getText();
        AccountNo = jTextField3.getText();
        //cdate = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
        //cdate = "0000-00-00";
        if (jRadioButton1.isSelected() == true) {
            cdate = date.getText();
        } else if (jRadioButton2.isSelected() == true) {
            cdate = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
        }
        cvalue = chequevalue.getText();
        owner = jTextField6.getText();
        status = jLabel19.getText();
        b = true;
        saveChequeDetails();
        cleartf();
        refreshTable();

        // oniiiiiiiiiiiiiiiiimaiiiiiiiiiiiiii akkkiiiiiiiiiiiiiiiiiiiiiiiiiii
        InvoicePack.setChequePayment();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        chequevalue.setText("");
        jTextField6.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chequevalueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chequevalueKeyTyped
        if ((Character.isDigit(evt.getKeyChar())) | (evt.getKeyChar() == evt.VK_PERIOD)) {
            String sj = chequevalue.getText();
            String ssj[] = sj.replace('.', '-').split("-");
            if (sj.equals("")) {
                if (evt.getKeyChar() == evt.VK_PERIOD) {
                    evt.consume();
                }
            }
            if (ssj.length >= 2) {
                if (evt.getKeyChar() == evt.VK_PERIOD) {
                    evt.consume();
                }
                if (ssj[1].toString().length() > 1) {
                    evt.consume();
                }
            }

            if (sj.endsWith(".")) {
                if (evt.getKeyChar() == evt.VK_PERIOD) {
                    evt.consume();
                }
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_chequevalueKeyTyped

    private void chequevalueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chequevalueKeyReleased
// oniiiiiiiiiiiiiiiiimaiiiiiiiiiiiiii akkkiiiiiiiiiiiiiiiiiiiiiiiiiii
        double d = 0;
        try {
            ResultSet rs = MyDB.search("select sum(ChequeValue) from Cheque where InvoiceP_InvoiceP is null");
            while (rs.next()) {
                d=InvoicePack.setLimitForCheque()-rs.getDouble(1);
            }
            double chequej = Double.parseDouble(chequevalue.getText());
            if (chequej > d) {
                chequevalue.setBackground(Color.red);
                JOptionPane.showMessageDialog(rootPane, "you exceed the limit");
                chequevalue.setText("");
            } else if (chequej <= d) {
                chequevalue.setBackground(Color.white);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_chequevalueKeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            jTextField1.setBackground(Color.red);
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else {
            jTextField1.setBackground(Color.white);

        }


    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            jTextField3.setBackground(Color.red);
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else {
            jTextField3.setBackground(Color.white);

        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {
            ResultSet rs = MyDB.search("select ChequeNo from Cheque where ChequeNo='" + jTextField1.getText() + "' ");
            if (rs.next()) {
                String ch = rs.getString("ChequeNo");
                System.out.println(ch);
                String s = jTextField1.getText();

                if (ch == s) {
                    JOptionPane.showMessageDialog(this, "");
                } else {
                    JOptionPane.showMessageDialog(this, "this cheque number was used");
                    char c = evt.getKeyChar();
                    if (!(Character.isLetter(c))) {
                        jTextField1.setBackground(Color.red);
                        evt.consume();
                        Toolkit.getDefaultToolkit().beep();
                    } else {
                        jTextField1.setBackground(Color.white);

                    }

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        decideSaveStatus();
    }//GEN-LAST:event_jButton1MouseEntered

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        decidechequetype();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        decidechequetype();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTable1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1CaretPositionChanged

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ChequeRegistationInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChequeRegistationInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChequeRegistationInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChequeRegistationInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChequeRegistationInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField chequevalue;
    private javax.swing.JLabel date;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    public static void saveChequeDetails() {

        if (jRadioButton1.isSelected()) {
            type = "CashCheque";
        } else {
            type = "DateCheque";
        }

        if (jRadioButton2.isSelected()) {
            type = "DateCheque";
        } else {
            type = "CashCheque";

        }
        try {

            MyDB.iud("insert into Cheque (ChequeNo,BranchName,AccountNo,ChequeDate,ChequeValue,Owner,status,ChequeType) "
                    + "values ('" + cno + "','" + branchname + "','" + AccountNo + "','" + cdate + "','" + cvalue + "',"
                    + "'" + owner + "','" + status + "','" + type + "') ");
            // refreshTable();

            JOptionPane.showMessageDialog(null, "Cheque saved");

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sorry we cant save this cheque ");
        }
    }
//         public static boolean checkValidity() {
//       // System.out.println("checkvalidity   " + b);
//        return b;
//    }
//...................................................................................................

    public void decideSaveStatus() {

        if (jTextField1.getText().equals("")) {
            jButton1.setEnabled(false);
        } else if (jTextField2.getText().equals("")) {
            jButton1.setEnabled(false);
        } else if (jTextField3.getText().equals("")) {
            jButton1.setEnabled(false);

        } else if (chequevalue.getText().equals("")) {
            jButton1.setEnabled(false);
        } else if (jTextField6.getText().equals("")) {
            jButton1.setEnabled(false);
        } else if ((!jRadioButton1.isSelected()) && (!jRadioButton2.isSelected())) {
            jButton1.setEnabled(false);
        } else if (chequevalue.getText().equals("0")) {
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(true);
        }
    }
//..................................................................................................................................

    public static void refreshTable() {
        try {

            ResultSet rs = MyDB.search("select ChequeNo,BranchName,AccountNo,ChequeDate,ChequeValue,Owner,ChequeType,status from Cheque where InvoiceP_InvoiceP is null");
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("ChequeNo"));
                v.add(rs.getString("BranchName"));
                v.add(rs.getString("AccountNo"));
                v.add(rs.getString("ChequeDate"));
                v.add(rs.getString("ChequeValue"));
                v.add(rs.getString("Owner"));
                v.add(rs.getString("ChequeType"));
                v.add(rs.getString("status"));
                //v.add(rs.getString(9));
                tb.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//......................................................................................................................

    private void currentdate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        date.setText(s.format(d));
    }

    private void currenttime() {
        new Timer(0, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }
        }).start();
    }

    //..........................................................................................................
    private void cleartf() {
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField6.setText(null);
        chequevalue.setText(null);
        jDateChooser1.setDate(null);
        jTextField1.grabFocus();
    }

    private void decidechequetype() {
//       if (jRadioButton1.isSelected()==true) {
//            jDateChooser1.setVisible(false);
//        }else if (jRadioButton2.isSelected()==true) {
//            jDateChooser1.setVisible(true);
//        
//        }else {
//            jDateChooser1.setVisible(false);
//        }

        if (jRadioButton1.isSelected() == true) {
            jDateChooser1.setEnabled(false);
        } else if (jRadioButton2.isSelected() == false) {
            jDateChooser1.setEnabled(false);

        } else if (jRadioButton2.isSelected() == true) {
            jDateChooser1.setEnabled(true);

        } else if (jRadioButton1.isSelected() == false) {
            jDateChooser1.setEnabled(true);
        } else {
            jDateChooser1.setEnabled(true);
        }

    }

    //....................................................................................................................  
    void lod() {

//    try {
//            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
//            tb.setRowCount(0);
//            ResultSet rs = MyDB.search("SELECT * FROM cheque");
//    
//            while (rs.next()) {
//                Vector v = new Vector();
//               // v.add(rs.getString("idCheque"));
//                v.add(rs.getString("ChequeNo"));
//                v.add(rs.getString("BranchName"));
//                v.add(rs.getString("AccountNo"));
//                v.add(rs.getString("ChequeDate"));
//                v.add(rs.getString("ChequeValue"));
//                v.add(rs.getString("Owner"));
//                v.add(rs.getString("ChequeType"));
//                v.add(rs.getString("status"));
//                
//                tb.addRow(v);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
