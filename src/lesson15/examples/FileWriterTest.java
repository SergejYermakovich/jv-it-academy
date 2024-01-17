package lesson15.examples;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("test.txt");) {
            fileWriter.write("tetst string");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
