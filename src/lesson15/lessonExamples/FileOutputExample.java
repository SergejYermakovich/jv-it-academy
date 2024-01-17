package lesson15.lessonExamples;



import java.io.FileWriter;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {

        String message = "     second message.....";
//        FileOutputStream fileOutputStream = new FileOutputStream("message.txt");
//
//        byte[] bytes = message.getBytes();
//        fileOutputStream.write(bytes);
//
//        fileOutputStream.close();

        FileWriter writer = new FileWriter("message.txt", true);
        writer.write(message);
        writer.close();


    }
}
