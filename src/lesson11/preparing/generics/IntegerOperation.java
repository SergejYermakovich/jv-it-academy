package lesson11.preparing.generics;

public class IntegerOperation implements GenericTest<Integer> {
    @Override
    public void operation(Integer value) {
        System.out.println("Integer is " + value);
    }
}
