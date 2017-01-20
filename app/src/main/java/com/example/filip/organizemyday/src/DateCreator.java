package com.example.filip.organizemyday.src;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Filip on 2017-01-19.
 */

public class DateCreator {
    private static Calendar now = Calendar.getInstance();
    private static String dayName;

    private static void setDayName() {
        now.setFirstDayOfWeek(now.MONDAY);
        now.setTime(new Date());

        switch(now.get(Calendar.DAY_OF_WEEK)){
            case Calendar.MONDAY:
                dayName = "Poniedziałek";
                break;
            case Calendar.TUESDAY:
                dayName = "Wtorek";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Środa";
                break;
            case Calendar.THURSDAY:
                dayName = "Czwartek";
                break;
            case Calendar.FRIDAY:
                dayName = "Piątek";
                break;
            case Calendar.SATURDAY:
                dayName = "Sobota";
                break;
            case Calendar.SUNDAY:
                dayName = "Niedziela";
                break;
        }
    }

    public static String getDayName() {
        setDayName();
        return dayName;
    }

    public static String getDate() {
        int year = now.get(Calendar.YEAR);
        int m = now.get(Calendar.MONTH) + 1;
        int d = now.get(Calendar.DAY_OF_MONTH);

        String month = Integer.toString(m);
        String day = Integer.toString(d);

        if(m < 10) month = "0" + m;
        if(d < 10) day = "0" + d;

        return year + "-" + month + "-" + day;
    }
}
