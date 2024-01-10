package lesson13.lessonCode;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExample {
    public static void main(String[] args)  {

        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("///");
        }

    }

    static void test1() throws FileNotFoundException {
        System.out.println("it s test 1");

            test2();

    }

    static void test2() throws FileNotFoundException {
        System.out.println("it s test 2");
        test3();
    }

    static void test3()  {
        System.out.println("it s test 3");

        try {
            FileReader fileReader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new FileHasNotValidNameException("File has not valid name file.txt", e);
        }
    }

}
