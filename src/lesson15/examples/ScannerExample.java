package lesson15.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(System.in);//

        File file = new File("test.txt");
        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());

        while (scanner.hasNextLine()) {
            System.out.print(scanner.nextLine());
        }

    }
}
