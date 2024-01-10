package lesson13.lessonCode;

public class ErrorExample {
    public static void main(String[] args) {

        generateMessage("hi !!!");
    }

    static String generateMessage(String message) {
        System.out.println(message);
        return generateMessage(message);
    }
}
