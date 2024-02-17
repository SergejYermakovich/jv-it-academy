package lesson15.lessonExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {
        String message = "test message.....";
        FileOutputStream fileOutputStream = new FileOutputStream("message.txt", true);
        fileOutputStream.write(message.getBytes());
        fileOutputStream.close();
    }
}
