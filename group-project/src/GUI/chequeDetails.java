package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class chequeDetails extends javax.swing.JFrame {

    public chequeDetails() {
        initComponents();
        currentdate();
        currenttime();
        refreshTable();
      //  searchChequeType();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cheque id", "Cheque no", "Branch name", "Account no", "Cheque date", "Cheque value", "Owner", "Cheqe Type", "Status", "Invoice no "
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 203, 930, 347));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Pending");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 90, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Accepted");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 113, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Return");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 139, -1, -1));

        date.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 11, 122, 41));

        time.setBorder(javax.swing.BorderFactory.createTitledBorder("Time"));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 11, 121, 41));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createTitledBorder("From"));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 137, -1, -1));

        jDateChooser2.setBorder(javax.swing.BorderFactory.createTitledBorder("To"));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 137, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Id Cheque", "Cheque No", "Branch Name", "Account No", "Cheque Date", "Cheque Type", "Owner", "Cheque Value", "Status", "Invoice No" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 134, 156, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 134, 188, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            if (jComboBox1.getSelectedItem().equals("Id Cheque")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where idcheque like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Cheque No")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where chequeno like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Branch Name")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where branchname like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Account No")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where accountno like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Cheque Date")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where chequedate like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Cheque Value")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where chequevalue like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Owner")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where owner like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Cheque Type")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where chequetype like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Status")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where status like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Invoice No")) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where invoicep_invoicep like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            if (jComboBox1.getSelectedItem().equals("select")) {
                refreshTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       searchPending();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        searchAccepted();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
      searchPending();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(chequeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chequeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chequeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chequeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chequeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

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

    public void refreshTable() {
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            ResultSet rs = MyDB.search("select idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,chequetype,"
                    + "status,invoicep_invoicep from cheque");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Idcheque"));
                v.add(rs.getString("chequeno"));
                v.add(rs.getString("branchname"));
                v.add(rs.getString("accountno"));
                v.add(rs.getString("chequedate"));
                v.add(rs.getString("chequevalue"));
                v.add(rs.getString("owner"));
                v.add(rs.getString("chequetype"));
                v.add(rs.getString("status"));
                v.add(rs.getString("invoicep_invoicep"));
                tb.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void searchPending(){
      DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
      tb.setRowCount(0);
    try {
             if (jRadioButton1.isSelected()) {
                ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where status = 'pending'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }else if(jRadioButton3.isSelected()){
            
                 ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where status = 'Return'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
             
    } catch (Exception e) {
        e.printStackTrace();
   
}
    
}
    public  void searchAccepted(){
      DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
      tb.setRowCount(0);
        try {
            if(jRadioButton2.isSelected()){
               ResultSet rs = MyDB.search("select Idcheque,chequeno,branchname,accountno,chequedate,chequevalue,owner,"
                        + "chequetype,status,invoicep_invoicep from cheque where status ='Accepted'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Idcheque"));
                    v.add(rs.getString("chequeno"));
                    v.add(rs.getString("branchname"));
                    v.add(rs.getString("accountno"));
                    v.add(rs.getString("chequedate"));
                    v.add(rs.getString("chequevalue"));
                    v.add(rs.getString("owner"));
                    v.add(rs.getString("chequetype"));
                    v.add(rs.getString("status"));
                    v.add(rs.getString("invoicep_invoicep"));
                    tb.addRow(v);
                }
            }
        } catch (Exception e) {
        }
    }
}
