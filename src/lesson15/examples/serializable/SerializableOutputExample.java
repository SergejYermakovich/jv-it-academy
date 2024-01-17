package lesson15.examples.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableOutputExample {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
