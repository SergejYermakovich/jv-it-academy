package lesson15.teen;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PlayerMainFileOutputStream {
    public static void main(String[] args) {
        Player player = new Player("ogurec2007", 12361313, "Europe", 3790);

        try (FileOutputStream fileOutputStream = new FileOutputStream("player.data");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(player);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
