package lesson13.lessonCode;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExExample {

    public static void main(String[] args) {


            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(i);
                } catch (ArithmeticException ex) {
                    System.out.println("error !!!! ");
                } finally {
                    i++;
                }
            }



    }
}
