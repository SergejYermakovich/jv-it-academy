package lesson2;

import java.util.Scanner;

public class OtherOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);
        char symbol2 = scanner.next().charAt(0);

        String message = symbol == symbol2 ? "Символы равны" : "Символы не равны";
        System.out.println(message);

    }
}
