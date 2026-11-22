/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;

/**
 *
 * @author Sandeep Dilshan
 */
public class CalculateTime {

    public int getArreasdaysCount(String date) {
        String Date = date;
        try {
            String Today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            Date fromDay = new SimpleDateFormat("yyyy-MM-dd").parse(Date);
            Date today = new SimpleDateFormat("yyyy-MM-dd").parse(Today);

            LocalDate from = LocalDate.fromDateFields(fromDay);
            LocalDate to = LocalDate.fromDateFields(today);

//            LocalDate date1 = to.plusWeeks(1);
            Days days = Days.daysBetween(from, to);
            Weeks weeks = Weeks.weeksBetween(from, to);

            int daysCount = days.getDays();
            int weeksCount = weeks.getWeeks();
//            System.out.println(daysCount);
//            System.out.println(weeksCount);

            return daysCount;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
