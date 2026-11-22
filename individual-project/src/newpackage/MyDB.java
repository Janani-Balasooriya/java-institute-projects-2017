/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author My
 */
public class MyDB {
    private static Connection c;
    
    private static void setMyCon()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/FinalProject","root","123");
    }
    
    public static void iud(String sql)throws Exception{
        if(c==null){
            setMyCon();
        }
        c.createStatement().executeUpdate(sql);
    }
    
    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            setMyCon();
        }
        return c.createStatement().executeQuery(sql);
    }
    
    public static Connection getMyCon() throws Exception {
        if (c == null) {
            setMyCon();
        }
        return c;
    }
}
