package lesson21.preparing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalExample {
    public static void main(String[] args) {

        String now = "====------>2016-11-09";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("====------>yyyy-MM-dd");

        LocalDate formatDateTime = LocalDate.parse(now, formatter);

        System.out.println(formatDateTime);

    }
}
