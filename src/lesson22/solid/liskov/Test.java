package lesson22.solid.liskov;

public class Test {
    public static void main(String[] args) {
     Cat cat = new Cat();
     printAnimalSound(cat);


    }

    private static void printAnimalSound(Animal animal) {
        animal.speak();
    }
}
