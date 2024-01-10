package lesson13.throwsEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileEx {
    public static void main(String[] args)   {


        try {
            method1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Check file name....", e);
        }

    }


    static public void method1() throws FileNotFoundException {
        System.out.println("method1");

        method2();
    }

    static public void method2() throws FileNotFoundException {
        System.out.println("method2");

        method3();
    }

    static public void method3() throws FileNotFoundException {
        System.out.println("method3");

        FileReader file = new FileReader("file.txt");
    }
}
