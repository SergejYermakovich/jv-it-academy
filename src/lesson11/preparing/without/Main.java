package lesson11.preparing.without;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem("16");

        Object item = box.getItem();

        if (item instanceof Integer) {
            Integer value = (Integer) item;
        }




    }
}
