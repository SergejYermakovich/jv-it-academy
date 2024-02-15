package lesson21.preparing;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendarExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTime());
    }
}
