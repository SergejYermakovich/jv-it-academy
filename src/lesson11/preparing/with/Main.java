package lesson11.preparing.with;

public class Main {
    public static void main(String[] args) {
        var box = new Box<>(12);
        System.out.println(box.getItem());
        System.out.println(Box.doSmth(12, "12"));
    }
}
