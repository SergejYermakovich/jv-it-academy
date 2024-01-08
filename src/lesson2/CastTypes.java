package lesson2;

public class CastTypes {
    public static void main(String[] args) {
        float floatValue = 15.12f;
        byte byteValue = (byte) floatValue;

        System.out.println(byteValue);

        byte byteNewValue = 122;
        float newFloatValue = byteNewValue;

        System.out.println(newFloatValue);
    }
}
