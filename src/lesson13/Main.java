package lesson13;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            System.out.println("catched.....");
            b++;

        }


        System.out.println("other logic....");
        System.out.println(a / b);
    }
}
