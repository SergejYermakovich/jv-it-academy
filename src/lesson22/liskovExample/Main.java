package lesson22.liskovExample;

public class Main {
    public static void main(String[] args) {
        sayAnimalWord(new Cat());
    }


    public static void sayAnimalWord(Animal animal) {
        animal.say();
    }
}
