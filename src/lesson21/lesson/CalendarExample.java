package lesson21.lesson;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendarWithTimeZone = Calendar.getInstance(TimeZone.getTimeZone(ZoneId.systemDefault()));

        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, -1);
        System.out.println(calendar.getTime());

        System.out.println(calendar.equals(calendarWithTimeZone));

    }
}
