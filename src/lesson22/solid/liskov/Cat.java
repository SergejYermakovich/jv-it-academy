package lesson22.solid.liskov;

public class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meoooooow");
    }
}
