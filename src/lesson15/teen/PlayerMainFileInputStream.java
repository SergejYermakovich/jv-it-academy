package lesson15.teen;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PlayerMainFileInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("player.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Player player = (Player) objectInputStream.readObject();

        System.out.println("id: " + player.getId());
        System.out.println("nickname: " + player.getNickname());
        System.out.println("server location: " + player.getServerLocation());
        System.out.println("points: " + player.getPoints());
    }
}
