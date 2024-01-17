package lesson14;

public class TernaryOperatorExample {
    public static void main(String[] args) {
         String answer = false ? test1() : test2();
    }

    static String test1() {
        return "test1";
    }

    static String test2() {
        return "test2";
    }
}
