package lesson3;

public class Car {
    int wheels;
    String name;

    void ride() {
        System.out.println("я прогрваю машину...");
        System.out.println("чищу...");
        System.out.println("завожусь...");
        System.out.println("еду....");
    }

    public Car() {
        System.out.println("это конструктор по умолчанию....");
    }

    public Car(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
        System.out.println("это конструктор c параметрами....");
    }
}
