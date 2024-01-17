package lesson15.examples;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("");

        Path path = Paths.get("test-path.txt");

        if (!Files.exists(path)) {
            Files.createFile(path);
        }

//        path.
    }

    public static InputStream initStream() throws IOException {
        InputStream stream;

        stream = new FileInputStream("");
        stream = new URL("https://google.com/").openStream();
        stream = new ByteArrayInputStream(new byte[]{32, 89});

        return stream;
    }
}
