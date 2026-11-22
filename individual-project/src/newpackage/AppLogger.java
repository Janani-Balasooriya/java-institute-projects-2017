/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
/**
 *
 * @author My
 */
public class AppLogger {
    public static void initLogger(){
        try {
            String path="H:\\FinalProject\\MyLogger\\TextileShop.txt";
            PatternLayout p1=new PatternLayout("%p %d %m %1 %n");
            //priority,date,message,line number,next line
            RollingFileAppender rfa=new RollingFileAppender(p1, path);
            //append errors according to this pattern and t0 that path
            rfa.setName("Log File");
            rfa.setMaxFileSize("1MB");
            //by default we'll give 1MB
            rfa.activateOptions();
            Logger.getRootLogger().addAppender(rfa);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
