package lesson13.hierarchy;

public class CurrencyNotSupportedException extends Throwable {


    public CurrencyNotSupportedException(String message) {
        super(message);
    }

    public CurrencyNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}
