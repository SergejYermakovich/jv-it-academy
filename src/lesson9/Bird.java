package lesson9;

public class Bird  extends Animal implements Flyable, Driverable {

    String type;

    String color;

    public void changeType(String typs) {
        System.out.println("random");
    }

    @Override
    public void fly() {
        System.out.println("fly....");
    }


    @Override
    public void drive() {

    }


}
