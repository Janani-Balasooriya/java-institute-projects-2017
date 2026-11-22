
package GUI;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Garbage extends javax.swing.JFrame {

    public Garbage() {
        initComponents();
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("View Garbage");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Barcode", "Id Reson", "Reason"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Date", "Time", "Reason", "Barcode No" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
         try {
            if (jComboBox1.getSelectedItem().equals("select")) {
                refreshTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            if (jComboBox1.getSelectedItem().equals("Date")) {
                ResultSet rs = MyDB.search(" select garbage.date,garbage.time,garbage.Transfer_newBarcode,garbage.reason_id,reason.reason from garbage inner join reason on garbage.reason_id=reason.id where date like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("date"));
                    v.add(rs.getString("time"));
                    v.add(rs.getString("Transfer_newBarcode"));
                    v.add(rs.getString("reason_id"));
                    v.add(rs.getString("reason"));
                   
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Time")) {
                ResultSet rs = MyDB.search(" select garbage.date,garbage.time,garbage.Transfer_newBarcode,garbage.reason_id,reason.reason from garbage inner join reason on garbage.reason_id=reason.id where time like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("date"));
                    v.add(rs.getString("time"));
                    v.add(rs.getString("Transfer_newBarcode"));
                    v.add(rs.getString("reason_id"));
                    v.add(rs.getString("reason"));
                   
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Reason")) {
                ResultSet rs = MyDB.search(" select garbage.date,garbage.time,garbage.Transfer_newBarcode,garbage.reason_id,reason.reason from garbage inner join reason on garbage.reason_id=reason.id where reason like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("date"));
                    v.add(rs.getString("time"));
                    v.add(rs.getString("Transfer_newBarcode"));
                    v.add(rs.getString("reason_id"));
                    v.add(rs.getString("reason"));
                   
                    tb.addRow(v);
                }
            }
            if (jComboBox1.getSelectedItem().equals("Barcode No")) {
                ResultSet rs = MyDB.search(" select garbage.date,garbage.time,garbage.Transfer_newBarcode,garbage.reason_id,reason.reason from garbage inner join reason on garbage.reason_id=reason.id where Transfer_newBarcode like '%" + jTextField1.getText() + "%'");
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("date"));
                    v.add(rs.getString("time"));
                    v.add(rs.getString("Transfer_newBarcode"));
                    v.add(rs.getString("reason_id"));
                    v.add(rs.getString("reason"));
                   
                    tb.addRow(v);
                }
            }
           
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTextField1KeyReleased

  
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
            java.util.logging.Logger.getLogger(Garbage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Garbage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Garbage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Garbage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Garbage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
public void refreshTable() {
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
         
            ResultSet rs = MyDB.search("select garbage.date,garbage.time,garbage.Transfer_newBarcode,garbage.reason_id,reason.reason from garbage inner join reason on garbage.reason_id=reason.id");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Date"));
                v.add(rs.getString("time"));
                v.add(rs.getString("Transfer_newBarcode"));
                v.add(rs.getString("Reason_id"));
                v.add(rs.getString("reason"));
              
             
                tb.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
