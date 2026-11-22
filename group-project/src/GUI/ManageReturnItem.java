package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class ManageReturnItem extends javax.swing.JFrame {
    
    public ManageReturnItem() {
        initComponents();
        refreshTable();
        currentdate();
        currenttime();
//        Settotal();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Magage Return Item");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 24, 123, 24));

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 77, 199, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode No", "Invoice no", "Itemname", "Quntity", "Sub total", "Invoice Item Id", "Invoice Return Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 880, 270));

        jLabel2.setText("Enter barcode :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 80, 92, -1));

        jButton1.setText("Add to Stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 513, 110, 40));

        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 370, 40));

        date.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 150, 60));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        time.setBorder(javax.swing.BorderFactory.createTitledBorder("Time"));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 120, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 230, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 390, 60));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 940, 620));

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

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed

    }//GEN-LAST:event_tf1ActionPerformed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped

    }//GEN-LAST:event_tf1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are you sure add this item to stock ?");
        if (i == 0) {
            try {
        ResultSet r = MyDB.search("select availableqty from transfer where newbarcode ='"+tf1.getText()+"'  ");  
                if (r.next()) {
                    int qty2 = Integer.parseInt(r.getString("availableqty"));
                    System.out.println(qty2);
                    int qty =Integer.parseInt(jLabel3.getText());
                    System.out.println(qty);
                    int qty3=qty+qty2;
                    System.out.println(qty3);
                    int status=0;
                MyDB.iud("update transfer set availableqty = '"+qty3+"' where newbarcode='"+tf1.getText()+"' ");
              //  MyDB.iud("update invoiceitemreturni set status='"+status+"' where newbarcode='"+tf1.getText()+"'  ");
                
                MyDB.iud("update invoiceitemreturni inner join invoiceitemi on invoiceItemI_idinvoiceItemI = idinvoiceItemI set "
                        + "status = '"+status+"' where invoiceitemi.Transfer_newBarcode = '" + tf1.getText() + "' ");
                
                }
    
            } catch (Exception e) {
              e.printStackTrace();
            }
            refreshTable();
        } else if (i == 1) {
            Reson r = new Reson();
            r.setVisible(true);
            refreshTable();
            
        } else if (i == 2) {
           // this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyReleased
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel();
        tb.setRowCount(0);
        t.setRowCount(0);

        try {
            ResultSet rs = MyDB.search("select idinvoiceitemreturni,qty,subtotal,invoiceitemi_idinvoiceitemi,"
                    + "invoicereturni_idinvoicereturni,invoiceitemi.transfer_newbarcode,name From invoiceitemreturni join invoiceitemi on "
                    + "invoiceitemreturni.invoiceItemI_idinvoiceItemI=invoiceitemi.idinvoiceItemI where Transfer_newBarcode = '" + tf1.getText() + "' and status='1' ");
            int qtyyy = 0;     
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Transfer_newBarcode"));
                v.add(rs.getString("idInvoiceItemReturnI"));
                v.add(rs.getString("name"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("subtotal"));
                v.add(rs.getString("invoiceItemI_idinvoiceItemI"));
                v.add(rs.getString("InvoiceReturnI_idInvoiceReturnI"));
             
                
                tb.addRow(v);
                
                qtyyy += Integer.parseInt(rs.getString("qty"));
                
              //  System.out.println("qtyyy:" + qtyyy);
                
            }
            jLabel3.setText(""+qtyyy);
            jLabel5.setText("This Barcode Have Returns Items =");
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "cannot search this.");
        }
    }//GEN-LAST:event_tf1KeyReleased
    
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
            java.util.logging.Logger.getLogger(ManageReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReturnItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new ManageReturnItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField tf1;
    public static javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    public void refreshTable() {
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            ResultSet rs = MyDB.search("select idinvoiceitemreturni,qty,subtotal,invoiceitemi_idinvoiceitemi,"
                    + "invoicereturni_idinvoicereturni,invoiceitemi.transfer_newbarcode,name From invoiceitemreturni join invoiceitemi on "
                    + "invoiceitemreturni.invoiceItemI_idinvoiceItemI=invoiceitemi.idinvoiceItemI where status = '1'");
            
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("Transfer_newBarcode"));
                v.add(rs.getString("idInvoiceItemReturnI"));
                v.add(rs.getString("name"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("subtotal"));
                v.add(rs.getString("invoiceItemI_idinvoiceItemI"));
                v.add(rs.getString("InvoiceReturnI_idInvoiceReturnI"));
                
                tb.addRow(v);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void currentdate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        date.setText(s.format(d));
    }
    
    private void currenttime() {
        new Timer(0, new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                time.setText(s.format(d));
            }
        }).start();
    }

     public void settotal() {
        try {
            
        } catch (Exception e) {
        }
        
    }
}
