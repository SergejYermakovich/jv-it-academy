package lesson21.lesson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
*  Пользователь вводит две даты. Определить, равны ли они.
* */
public class DateEqualityTask {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую дату:");
        String firstInputDate = scanner.nextLine();

        System.out.println("Введите втрую дату:");
        String secondInputDate = scanner.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy:MM:dd");
        Date firstDate = simpleDateFormat.parse(firstInputDate);
        Date secondDate = simpleDateFormat.parse(secondInputDate);

        System.out.println("Равны? ->" + firstDate.equals(secondDate));
    }
}
