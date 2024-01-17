package lesson15.lessonExamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample {
    public static void main(String[] args) throws IOException {

        String filePath = "D:\\rebase\\message.txt";
        File file = new File(filePath);

        if (!file.exists())  {
            Files.createFile(Path.of(filePath));
        }

        try( FileWriter writer = new FileWriter(file, true)) {
            writer.write("12333355335");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
