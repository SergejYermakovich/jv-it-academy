package lesson15.lessonExamples.serializableExample;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class DeserializationMain {
    public static void main(String[] args) throws IOException {
        File file = new File("sweet.txt");

        if (!file.exists()) {
            throw new FileNotFoundException(file.getName() + " does not exist.");
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            List<Sweet> sweets = (ArrayList<Sweet>) objectInputStream.readObject();

            for (Sweet sweet: sweets) {
                System.out.println(sweet.getName());
            }


        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
