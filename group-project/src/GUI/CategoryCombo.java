/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author My
 */
public class CategoryCombo {
    public  static  DefaultComboBoxModel getList( String s){
        
        DefaultComboBoxModel modelo= new   DefaultComboBoxModel();
        try {
            ResultSet rs=MyDB.search("select name from Category where name like '"+s+"%'");
            while (rs.next()) {                
                modelo.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  modelo;
    }
}
