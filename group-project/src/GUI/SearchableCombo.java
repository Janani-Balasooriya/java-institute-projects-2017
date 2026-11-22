/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author My
 */
public class SearchableCombo {
    public  static  DefaultComboBoxModel getList( String s){
        
        DefaultComboBoxModel modelo= new   DefaultComboBoxModel();
        try {
         
            ResultSet rs = MyDB.search(s);
            while (rs.next()) {  
              
                    modelo.addElement(rs.getString(1));
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
        return  modelo;
    }
}
