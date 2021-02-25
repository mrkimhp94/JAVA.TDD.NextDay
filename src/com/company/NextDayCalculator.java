package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class NextDayCalculator {
    public static String add(int day, int month, int year) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        cal.add(Calendar.DAY_OF_MONTH,1);
        Date date = cal.getTime();
        return df.format(date);

}
}
