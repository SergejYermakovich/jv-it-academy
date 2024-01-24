package lesson17.lambda;

public class LambdaMain {
    public static void main(String[] args) {

        Sum sum = (a, b) -> {
            return a + b;
        };


        System.out.println(sum.getSum(1,2));
        System.out.println(sum.getSum(33,222));
    }



    interface Sum {
        int getSum(int a, int b);
    }

}
