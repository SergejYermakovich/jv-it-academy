package lesson15.lessonExamples.serializableExample;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class SerializationMain {
    public static void main(String[] args) throws IOException {
        File file = new File("sweet.txt");

        if (!file.exists()) {
            Files.createFile(file.toPath());
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {

            List<Sweet> sweetList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                sweetList.add(new Sweet(i, "Alenka" + i)) ;

            }
            objectOutputStream.writeObject(sweetList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
