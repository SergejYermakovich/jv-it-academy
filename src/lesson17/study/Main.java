package lesson17.study;

public class Main {
    public static void main(String[] args) {


        int limit = 100;
        TestFunctionImpl testFunction = new TestFunctionImpl();
        testFunction.test(2);

        TestFunctional testFunctional = new TestFunctional() {

            @Override
            public void test(int a) {
                System.out.println("test a: " + a);
            }
        };
        testFunctional.test(2);

        TestFunctional testFunctionalLambda = (a) -> {
            if (limit > 10) {
                System.out.println("limit > 10");
            }

            System.out.println("test3");
        };

        testFunctionalLambda.test(2);

        System.out.println(testFunction.getClass());
        System.out.println(testFunctionalLambda.getClass());


    }


}
