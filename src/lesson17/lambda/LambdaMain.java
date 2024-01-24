package lesson17.lambda;

public class LambdaMain {
    public static void main(String[] args) {

        Action getFive = (int a, int b) -> {
            return a + b;
        };

        System.out.println(getFive.getSum(1,2));
        System.out.println(getFive.getSum(3,2));


        processAction((a ,b) -> {
            int sum = 0;
            for (int i = a; i < b; i++) {
                sum += i;
            }
            return sum;
        });
    }


    interface Action {
        int getSum(int a, int b);
    }

    private static void processAction(Action action) {
        System.out.println(action.getSum(1, 2));
    }

}
