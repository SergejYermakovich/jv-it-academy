package lesson11.preparing.generics;

public class Main {
    public static void main(String[] args) {
        GenericTest<String> stringGeneric = new StringOperation();
        stringGeneric.operation("12");

        GenericTest<Integer> integerGeneric = new IntegerOperation();
        integerGeneric.operation(12);
    }
}
