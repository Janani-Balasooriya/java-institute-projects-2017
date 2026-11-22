package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Viranga Gamage
 */
public class GRN extends javax.swing.JFrame {

    //private Object JasperCompileManager;
    public GRN() {
        initComponents();
        GenerateGRNId();
        //  setDate();
        setDateAndTime();
        jComboBox1.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                
                String Category = jComboBox1.getEditor().getItem().toString();
                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8) {
                    jComboBox1.setModel(CategoryCombo.getList(Category));
                    
                    if (jComboBox1.getItemCount() > 0) {
                        jComboBox1.showPopup();
                        if (evt.getKeyCode() != 8) {
                            ((JTextComponent) jComboBox1.getEditor().getEditorComponent()).select(Category.length(), jComboBox1.getEditor().getItem().toString().length());
                        } else {
                            jComboBox1.getEditor().setItem(Category);
                        }
                    } else {
                        jComboBox1.addItem(Category);
                    }
                }
                if (evt.getKeyChar() == evt.VK_ENTER) {
                    
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        suppliername = new javax.swing.JTextField();
        jLabelgrn = new javax.swing.JLabel();
        GRNno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        supplierid = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        NetTotTxt = new javax.swing.JTextField();
        DateLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        UnitPriceTxt = new javax.swing.JTextField();
        BarcodeTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Goods Received Note");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Date:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 60, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Time:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 60, 30));

        timeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        timeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 110, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Supplier Name      :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 130, 30));

        suppliername.setEditable(false);
        suppliername.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        suppliername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliernameActionPerformed(evt);
            }
        });
        getContentPane().add(suppliername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 230, 30));

        jLabelgrn.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabelgrn.setText("GRN No      :");
        getContentPane().add(jLabelgrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 30));

        GRNno.setEditable(false);
        GRNno.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        GRNno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRNnoActionPerformed(evt);
            }
        });
        getContentPane().add(GRNno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Supplier ID           :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 130, 30));

        supplierid.setEditable(false);
        supplierid.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        supplierid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplieridActionPerformed(evt);
            }
        });
        supplierid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supplieridKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supplieridKeyTyped(evt);
            }
        });
        getContentPane().add(supplierid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 140, 30));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Search.png"))); // NOI18N
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 40, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Add.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 50, 80));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Net Total           :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 110, 40));

        NetTotTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetTotTxtActionPerformed(evt);
            }
        });
        getContentPane().add(NetTotTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 580, 190, 40));

        DateLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 110, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 170, 40));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Buying Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 1020, 330));

        UnitPriceTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UnitPriceTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Unit Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        UnitPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitPriceTxtActionPerformed(evt);
            }
        });
        UnitPriceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UnitPriceTxtKeyReleased(evt);
            }
        });
        getContentPane().add(UnitPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 200, 60));

        BarcodeTxt.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BarcodeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Barcode Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 16))); // NOI18N
        BarcodeTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BarcodeTxtFocusLost(evt);
            }
        });
        BarcodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarcodeTxtActionPerformed(evt);
            }
        });
        BarcodeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BarcodeTxtKeyReleased(evt);
            }
        });
        getContentPane().add(BarcodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 60));

        jButton1.setText("NEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 170, 40));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Add.png"))); // NOI18N
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 40, 30));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Add.png"))); // NOI18N
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 40, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Cancel.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 50, 80));

        jComboBox1.setEditable(true);
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBox1KeyTyped(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 190, 60));

        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 720, 80));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Remove Red.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 230, 40, 40));

        jLabel31.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel31MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GRNnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRNnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GRNnoActionPerformed

    private void suppliernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppliernameActionPerformed

    private void supplieridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplieridActionPerformed

    }//GEN-LAST:event_supplieridActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
       new  SupplierView().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        if (supplierid.getText().equals("")) {
//            JOptionPane.showMessageDialog(rootPane, "Please enter supplier details.", "Empty Field", JOptionPane.ERROR_MESSAGE);
//        } else {
//
//        }
        saveGRN();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String a, b, c = "";
            a = BarcodeTxt.getText();
            b = jComboBox1.getSelectedItem().toString();
            c = UnitPriceTxt.getText();
            
            ResultSet rs = MyDB.search("select name from Category where name like '" + b + "%'");
            if (rs.next()) {
                jComboBox1.setBackground(Color.white);
            } else {
                b = "";
                jComboBox1.setBackground(Color.red);
            }
            
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            if (!((a.equals("") || (b.equals("")) || (c.equals(""))))) {
                Vector v = new Vector();
                v.add(a);
                v.add(b);
                v.add(c);
                
                boolean bb = false;
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    if (jTable1.getValueAt(i, 0).toString().equals(a)) {
                        bb = false;
                        JOptionPane.showMessageDialog(rootPane, "Already entered!", "Duplicate Entry", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    } else {
                        bb = true;
                    }
                }
                if (jTable1.getRowCount() == 0) {
                    bb = true;
                }
                if (bb) {
                    tb.addRow(v);
                }
                calculateTotal();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please complete all fields correctly", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Please fill Category Name correctly", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void NetTotTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetTotTxtActionPerformed
        

    }//GEN-LAST:event_NetTotTxtActionPerformed

    private void BarcodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarcodeTxtActionPerformed
        jComboBox1.grabFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_BarcodeTxtActionPerformed

    private void UnitPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitPriceTxtActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_UnitPriceTxtActionPerformed

    private void UnitPriceTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UnitPriceTxtKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            try {
                String a, b, c = "";
                a = BarcodeTxt.getText();
                b = jComboBox1.getSelectedItem().toString();
                c = UnitPriceTxt.getText();
                
                ResultSet rs = MyDB.search("select name from Category where name like '" + b + "%'");
                if (rs.next()) {
                    
                } else {
                    b = "";
                    jComboBox1.setBackground(Color.red);
                }
                
                DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
                if (!((a.equals("") || (b.equals("")) || (c.equals(""))))) {
                    Vector v = new Vector();
                    v.add(a);
                    v.add(b);
                    v.add(c);
                    
                    boolean bb = false;
                    for (int i = 0; i < jTable1.getRowCount(); i++) {
                        if (jTable1.getValueAt(i, 0).toString().equals(a)) {
                            bb = false;
                            JOptionPane.showMessageDialog(rootPane, "Already entered!", "Duplicate Entry", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        } else {
                            bb = true;
                        }
                    }
                    if (jTable1.getRowCount() == 0) {
                        bb = true;
                    }
                    if (bb) {
                        tb.addRow(v);
                    }
                    calculateTotal();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please complete all fields correctly", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Please fill Category Name correctly", "Empty Fields", JOptionPane.WARNING_MESSAGE);
                
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_UnitPriceTxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void supplieridKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplieridKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            
            supplier();
            
        }
    }//GEN-LAST:event_supplieridKeyTyped

    private void supplieridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplieridKeyReleased
        try {
            ResultSet rs = MyDB.search("select Name from Supplier where idSupplier='" + supplierid.getText() + "'");        // TODO add your handling code here:
            if (rs.next()) {
                suppliername.setText(rs.getString(1));
            } else {
                suppliername.setText("");
            }
        } catch (Exception e) {
            suppliername.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_supplieridKeyReleased

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        new supplier_registration().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        new AddCategory().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BarcodeTxt.setText("");
        jComboBox1.setSelectedItem("");
        UnitPriceTxt.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyTyped
        jComboBox1.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.removeRow(jTable1.getSelectedRow());
            calculateTotal();
            if (jTable1.getRowCount() == 0) {
                NetTotTxt.setText("0.0");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void BarcodeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BarcodeTxtKeyReleased
        try {
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                ResultSet rs = MyDB.search("select * from pack where idPack='" + BarcodeTxt.getText() + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "This barcode already exists!", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
                    BarcodeTxt.setText("");
                }
            }
        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BarcodeTxtKeyReleased

    private void BarcodeTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BarcodeTxtFocusLost
        try {
            
            ResultSet rs = MyDB.search("select * from pack where idPack='" + BarcodeTxt.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "This barcode already exists!", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
                BarcodeTxt.setText("");
            }
            
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BarcodeTxtFocusLost

    private void jLabel31MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseMoved
        saveBtnStatus();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GRN().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BarcodeTxt;
    private javax.swing.JLabel DateLabel;
    private static javax.swing.JTextField GRNno;
    private static javax.swing.JTextField NetTotTxt;
    private javax.swing.JTextField UnitPriceTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelgrn;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTextField supplierid;
    private static javax.swing.JTextField suppliername;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables

    private void GenerateGRNId() {
        try {
            ResultSet r = MyDB.search("select max(idGRN) from GRN");
            //System.out.println("before if");
            if (r.first()) {
                GRNno.setText("GRN-" + (r.getInt(1) + 1) + "");
                //System.out.println("true");
            } else if (!r.first()) {
                System.out.println("false");
                //InvoTxt.setText("1");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void saveGRN() {
        try {
            String idgrn = GRNno.getText().split("-")[1];
            String sid = supplierid.getText();
            
            int rowCount = jTable1.getRowCount();
            String ntt = NetTotTxt.getText();
            MyDB.iud("Insert into GRN (idgrn,Supplier_idSupplier,nettotal,User_idUser,date,time) values ('" + idgrn + "','" + sid + "','" + ntt + "','" + Login.getUserIdRecord() + "','" + DateLabel.getText() + "','" + timeLabel.getText() + "')");
            
            for (int j = 0; j < jTable1.getRowCount(); j++) {
                String b = jTable1.getValueAt(j, 0).toString();
                String n = jTable1.getValueAt(j, 1).toString();
                String v = jTable1.getValueAt(j, 2).toString();
                
                MyDB.iud("Insert into pack (idpack,Category_name,UnitPrice,Quantity,GRN_idGRN,sellingPrice,description) values ('" + b + "','" + n + "','" + v + "','1','" + GRNno.getText().split("-")[1] + "','0','" + "" + "')");
                
            }
            JOptionPane.showMessageDialog(rootPane, "GRN save success!!");
//            for (int i = 0; i < rowCount; i++) {
//                System.out.println("id grn   " + idgrn);
//                System.out.println("loop eka athule!!");
//                if (jTable1.getValueAt(i, 0).toString().equals("")) {
//                    break;
//                }
//                System.out.println("loop ekat goda!!");
//
//                String barcode = jTable1.getValueAt(i, 0).toString();
//                System.out.println("barcode eka kiyewwa");
//
//                String name = jTable1.getValueAt(i, 1).toString();
//                System.out.println("up kiyewwa");
//                String up = jTable1.getValueAt(i, 2).toString();
//
//                System.out.println("Table eke okkoma kiyewwa");
//
//                JOptionPane.showMessageDialog(rootPane, "save1");
//               
//
//            }
            printGRN();
            clearAll();
        } catch (Exception e) {
            System.out.println("Exception ekak panna");
            e.printStackTrace();
        }
        
    }
    
    private void calculate_grn() {
        try {
            int i = jTable1.getRowCount();
            if (i != 0) {
                double tot = 0;
                for (int j = 0; j < i; j++) {
                    tot = tot + Double.parseDouble(jTable1.getValueAt(j, 2).toString());
                }
                NetTotTxt.setText(tot + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void supplier() {
        
        try {
            String suplierid = supplierid.getText();
            ResultSet rs = MyDB.search("Select Name from supplier where idSupplier='" + suplierid + "' ");
            while (rs.next()) {
                suppliername.setText(rs.getString(1));
                
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
                timeLabel.setText(sdf.format(date));
            }
        });
        t.start();
        
    }
    
    private static void calculateTotal() {
        double d = 0;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            
            d += Double.parseDouble(jTable1.getValueAt(i, 2).toString());
            NetTotTxt.setText(d + "");
        }
    }
    
    private void clearAll() {
        try {
            GenerateGRNId();
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            tb.setRowCount(0);
            supplierid.setText("");
            suppliername.setText("");
            BarcodeTxt.setText("");
            jComboBox1.setSelectedItem("");
            UnitPriceTxt.setText("");
            NetTotTxt.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void printGRN() {
        try {
//            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Knob Add.png"))); // NOI18N
            //JasperReport jr = JasperCompileManager.compileReport("H:\\FinalProject\\TestJasper\\GRNTest.jrxml");
            //JasperReport jr = JasperCompileManager.compileReport(getClass().getResource("//Report//GRNTest.jrxml").toString());

            InputStream stream = this.getClass().getResourceAsStream("/Report/GRNTest.jrxml");
            
            JasperReport jr = JasperCompileManager.compileReport(JRXmlLoader.load(stream));
            
            Map<String, Object> para = new HashMap<String, Object>();
            
            para.put("idGrn", Integer.parseInt(GRNno.getText().split("-")[1]));
            
            JasperPrint jp = JasperFillManager.fillReport(jr, para, MyDB.getMyCon());
            JasperViewer.viewReport(jp, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void saveBtnStatus() {
        if ((supplierid.getText().equals("") || (NetTotTxt.getText().equals("")))) {
            jButton4.setEnabled(false);
        } else {
            jButton4.setEnabled(true);
        }
    }
   public static void setIdName(String id, String name) {
        supplierid.setText(id);
        suppliername.setText(name);
    } 
}
