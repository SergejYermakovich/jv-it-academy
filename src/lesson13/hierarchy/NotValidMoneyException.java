package lesson13.hierarchy;

public class NotValidMoneyException extends Throwable {
    public NotValidMoneyException(String message, Throwable cause) {
        super(message, cause);
    }
}
