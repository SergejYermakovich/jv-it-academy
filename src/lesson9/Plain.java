package lesson9;

public class Plain implements Flyable {
    String model;

    @Override
    public void fly() {
        System.out.println("fly with speed 300 km/h");
    }

    @Override
    public void sound() {
        System.out.println("Wooooooahhh");
    }
}
