package lesson13;

public class ErrorTest {
    public static void main(String[] args) {

//        String message = getMessage("hi");
        String message2 = generateMessage("hi");

    }


    static String getMessage(String message) {
        return message + getMessage(message);
    }

    static String generateMessage(String message) {
        String result = "";
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            result += message;
        }
        return result;
    }
}
