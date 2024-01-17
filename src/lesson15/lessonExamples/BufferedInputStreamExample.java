package lesson15.lessonExamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {

        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream("message.txt"))) {
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found.....");
        }
    }
}
