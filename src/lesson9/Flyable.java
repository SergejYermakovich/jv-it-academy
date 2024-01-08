package lesson9;

public interface Flyable {

     void fly();

    default void sound() {
        System.out.println("Graaaaaaaaaah");
    }
}
