/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author My
 */
public class OurDateTime {

    Date d;

    public static String getOurDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date m = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(m);
        m = calendar.getTime();
        String s = sdf.format(m);
          System.out.println(s);

        return s;
    }

    public static String getOurTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date m = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(m);
        m = calendar.getTime();
        sdf = new SimpleDateFormat("hh:mm:ss");
        String s = sdf.format(m);
        System.out.println(s);
        return s;
    }
}
