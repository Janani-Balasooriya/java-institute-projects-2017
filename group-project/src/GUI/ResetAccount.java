/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author My
 */
public class ResetAccount extends javax.swing.JFrame {

    /**
     * Creates new form ResetAccount
     */
    public ResetAccount() {
        initComponents();
        jComboBox1.addItem("");
        //jButton1.setEnabled(false);
        jComboBox1.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                String Category = jComboBox1.getEditor().getItem().toString();
                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8) {
                    jComboBox1.setModel(ResetAccountCombo.getList(Category));

                    if (jComboBox1.getItemCount() > 0) {
                        jComboBox1.showPopup();
                        if (evt.getKeyCode() != 8) {
                            ((JTextComponent) jComboBox1.getEditor().getEditorComponent()).select(Category.length(),jComboBox1.getEditor().getItem().toString().length());
                        } else {
                            jComboBox1.getEditor().setItem(Category);
                        }
                    } else {
                        jComboBox1.addItem(Category);

                    }
                }
                if (evt.getKeyChar() == evt.VK_ENTER) {
                    // loadToTable();

                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reset Account");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Reset Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 180, 70));

        jLabel2.setText("Enter User Name to reset account");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 350, 60));

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 310, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if (jComboBox1.getEditor().getItem().toString().equals("Admin")) {
                JOptionPane.showMessageDialog(rootPane, "This is admin account!");
            } else {
                ResultSet rs = MyDB.search("select username from login");
                label1:
                while (rs.next()) {
                    if (jComboBox1.getEditor().getItem().toString().equals(rs.getString(1))) {
                        int i = JOptionPane.showConfirmDialog(rootPane, "Do you still need to reset account with username : " + jComboBox1.getEditor().getItem().toString(), "Confirm", JOptionPane.OK_CANCEL_OPTION);
                        // int i1 = JOptionPane.showConfirmDialog(rootPane, "Create User Account");
                        if (i == 0) {
                            MyDB.iud("update Login set password='1234' where username='" + jComboBox1.getEditor().getItem().toString() + "'");
                            MyDB.iud("update Login set status='1', count='0' where username='" + jComboBox1.getEditor().getItem().toString() + "'");
                            JOptionPane.showMessageDialog(rootPane, "Account Reset success!!");
                        } else if (i == 1) {
                            System.out.println(i);
                        }
                        throw new Exception();
                    }

                }
                JOptionPane.showMessageDialog(rootPane, "Invalid username!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ResetAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetAccount.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
