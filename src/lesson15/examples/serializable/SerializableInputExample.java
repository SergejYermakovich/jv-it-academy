package lesson15.examples.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableInputExample {
    public static void main(String[] args) {
        try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("person.dat")))
        {
            Person person = (Person) oos.readObject();

            System.out.println(person);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
