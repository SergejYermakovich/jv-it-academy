package lesson11.preparing.tasks;

import java.util.Arrays;
import java.util.List;

public class Generics1 {
    public static void main(String[] args) {

        List<?> list = Arrays.asList(1, "2", 3);


        list.forEach(System.out::println);
    }
}
