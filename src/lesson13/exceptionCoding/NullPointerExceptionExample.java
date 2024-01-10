package lesson13.exceptionCoding;

import java.nio.file.FileAlreadyExistsException;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Person person = null;

        try {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }  catch (NullPointerException e) {
            System.out.println("NullPointerException......");
        } catch (Exception e) {
            System.out.println("Exception......");
        }


        System.out.println("code.....");
    }
}
