package newpackage;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class catagary extends javax.swing.JFrame {

    public catagary() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JToggleButton();
        search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf2 = new javax.swing.JTextArea();
        se = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("catagary");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 41, -1, -1));

        jLabel2.setText("Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 260, -1));

        jLabel3.setText("Description :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 350, 700, 250));

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 64, 70, 60));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 70, 60));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 70, 60));

        search.setText("Search all");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 180, 50));

        tf2.setColumns(20);
        tf2.setRows(5);
        jScrollPane2.setViewportView(tf2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 260, 100));

        se.setText("search");
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });
        jPanel1.add(se, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, 60));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 180, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 460, 230));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 200, 320));

        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 720, 270));

        jButton1.setText("clear table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 180, 40));

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
        DefaultTableModel d = (DefaultTableModel) jTable1.getModel();

        try {

            ResultSet r = MyDB.search("select * from category where name like'%" + tf1.getText() + "%'");

            if (r.next()) {
                Vector v = new Vector();
                v.add(r.getString(1));
                v.add(r.getString(2));

                d.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tf1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are you sure ?");
        if (i == 0) {
            try {

                MyDB.iud("insert into category values('" + tf1.getText() + "','" + tf2.getText() + "') ");
                cleartf();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "1@566789904875 error in this.n/ please contact operator");
            }
        } else if (i == 1) {
            cleartf();
        } else if (i == 2) {
            this.dispose();

        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Are you sure ?");
        if (i == 0) {
            try {
                MyDB.iud("update category set description='" + tf2.getText() + "' where name='" + tf1.getText() + "' ");
                cleartf();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "1@566789904875 error in this.n/ please contact operator");
            }
        } else if (i == 1) {
            cleartf();
        } else if (i == 2) {
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "Are you sure ?");
        if (i == 0) {
            try {
                MyDB.iud("delete  from category  where name='" + tf1.getText() + "' ");
                cleartf();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "1@566789904875 error in this.n/ please contact operator");
            }
        } else if (i == 1) {
            cleartf();
        } else if (i == 2) {
            this.dispose();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        DefaultTableModel d = (DefaultTableModel) jTable1.getModel();

        try {

            ResultSet r = MyDB.search("select * from category where name like'%" + tf1.getText() + "%'");

            while (r.next()) {
                Vector v = new Vector();
                v.add(r.getString(1));
                v.add(r.getString(2));

                d.addRow(v);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_searchActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
        try {
           
            ResultSet r = MyDB.search("select * from category where name='" + tf1.getText() + "'");
            while (r.next()) {
                tf2.setText(r.getString(2));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "cannot search this.");
        }
    }

    private void cl1ActionPerformed(java.awt.event.ActionEvent evt) {
        cleartf();
    }//GEN-LAST:event_seActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        cleartf();
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
        d.setRowCount(0);

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(catagary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(catagary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(catagary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(catagary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catagary().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JToggleButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton save;
    private javax.swing.JButton se;
    private javax.swing.JButton search;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextArea tf2;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    void cleartf() {
        tf1.setText(null);
        tf2.setText(null);

        tf1.grabFocus();
    }
}
