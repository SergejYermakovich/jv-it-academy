package lesson11.preparing.with;

public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public Box() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static <K extends Number> String doSmth(K value, String stringValue) {
        return value.intValue() + " " + stringValue;
    }
}
