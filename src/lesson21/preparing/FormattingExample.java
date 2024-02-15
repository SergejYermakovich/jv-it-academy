package lesson21.preparing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormattingExample {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMM");

        System.out.println(dateFormat.format(date));
    }
}
