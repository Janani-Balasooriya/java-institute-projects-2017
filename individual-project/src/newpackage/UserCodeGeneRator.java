/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Random;

/**
 *
 * @author My
 */
public class UserCodeGeneRator {
    public final String charset="!0123456789abcdefghijklmnopqrstuvwxyz@#%&";
    
    public String getCode(){
        Random rand=new Random(System.currentTimeMillis());
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int pos = rand.nextInt(charset.length());
            sb.append(charset.charAt(pos));
            
        }
        
        return sb.toString();
    
    }  
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new UserCodeGeneRator().getCode());
        }
        
       
    }
}
