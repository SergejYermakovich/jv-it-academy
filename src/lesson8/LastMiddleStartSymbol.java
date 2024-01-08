package lesson8;

public class LastMiddleStartSymbol {
    public static void main(String[] args) {
        String message = "cat";

        System.out.println("First: " + message.charAt(0));
        System.out.println("Last: " + message.charAt(message.length() - 1));
        System.out.println("Middle: " + message.charAt(message.length() / 2));
    }
}
