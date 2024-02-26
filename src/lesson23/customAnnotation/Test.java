package lesson23.customAnnotation;


public class Test {

    public void method1() {
        System.out.println("method1");
    }

    @Executable(value = "message")
    public void method2() {
        System.out.println("method2");
    }
}
