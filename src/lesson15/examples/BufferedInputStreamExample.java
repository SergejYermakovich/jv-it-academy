package lesson15.examples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws FileNotFoundException {


        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"));



    }
}
