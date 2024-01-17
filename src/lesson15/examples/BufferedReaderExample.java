package lesson15.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

        String res = bufferedReader.readLine();
        while(res != null){
            System.out.println(res);
            res = bufferedReader.readLine();
        }
    }
}
