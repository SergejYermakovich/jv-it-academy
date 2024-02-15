package lesson21.lesson;

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println("Миллисекунды: " + date.getTime());

        long dateInMillis =  date.getTime();

        Date dateFromMillis = new Date(dateInMillis);
        System.out.println(dateFromMillis);

        System.out.println(date.before(dateFromMillis));
        System.out.println(date.compareTo(dateFromMillis));

        System.out.println(date.equals(dateFromMillis));
    }
}
