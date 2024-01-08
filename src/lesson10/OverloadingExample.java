package lesson10;

public class OverloadingExample {

    public static void main(String[] args) {

        sayHello();

        sayHello("Ivan");
    }


    public static void sayHello() {
        System.out.println("Hello!!!");
    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static String sayHello(String name, int age) {
        System.out.println("Hello, " + name);
        return "ckdckdc";
    }

    public static void sayHello(int age, String name) {
        System.out.println("Hello, " + name);
    }


}
