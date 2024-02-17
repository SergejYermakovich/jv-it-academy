package lesson15.lessonExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream = new FileInputStream("message.txt")) {
            int charSymbol = inputStream.read();
            while (charSymbol != -1) {
                System.out.print((char) charSymbol);
                charSymbol = inputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found.....");
        }

//
//
//        FileReader fileReader = new FileReader("message.txt");
//
//        int symbol = fileReader.read();
//        while (symbol != -1) {
//            System.out.print((char) symbol);
//            symbol = fileReader.read();
//        }

    }
}
