package lesson15.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
        int res = reader.read();
        while (res != -1) {
            System.out.print((char) res);
            res = reader.read();
        }
    }
}

