package lesson21.lesson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormattingExample {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

        System.out.println(date);
        String formattedDate = simpleDateFormat.format(date);
        System.out.println(formattedDate);

        Date dateFromString = simpleDateFormat.parse(formattedDate);
        System.out.println(dateFromString);
    }
}
