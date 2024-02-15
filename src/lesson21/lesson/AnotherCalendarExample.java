package lesson21.lesson;

import java.util.Calendar;

public class AnotherCalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Минуты:" + calendar.get(Calendar.MINUTE));

        System.out.println("День недели:" + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Месяц:" + calendar.get(Calendar.MONTH));


    }
}
