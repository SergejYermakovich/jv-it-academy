package lesson13.throwsEx;

public class Main {
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("перехвачено в main....");
        }


    }


    static public void method1() throws ArithmeticException {
        System.out.println("method1");

        method2();
    }

    static public void method2() throws ArithmeticException {
        System.out.println("method2");

        method3();
    }

    static public void method3() throws ArithmeticException {
        System.out.println("method3");


    }
}
