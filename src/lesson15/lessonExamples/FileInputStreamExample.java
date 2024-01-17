package lesson15.lessonExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream = new FileInputStream("message.txt")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found.....");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileInputStream inputStream = new FileInputStream("message.txt")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("file does not exist....");
        }


        FileReader fileReader = new FileReader("message.txt");

        int symbol = fileReader.read();
        while (symbol != -1) {
            System.out.print((char) symbol);
            symbol = fileReader.read();
        }

    }
}
