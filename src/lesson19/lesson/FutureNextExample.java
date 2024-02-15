package lesson19.lesson;

import java.util.concurrent.*;

public class FutureNextExample {

    static int[] data = {1, 2, 3, 4, 5};

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable task = () -> System.out.println("hello from task.");
        executorService.execute(task);

        Callable<Integer> callableTask = () -> {
            int sum = 0;
            for (int element : data) {
                sum += element;
                Thread.sleep(1000);
            }

            return sum;
        };

        Future<Integer> result = executorService.submit(callableTask);

        //


        while (true) {
            System.out.println(result.get());
            if (result.isDone()) {
                System.out.println("result = " + result.get());
                break;
            }

            System.out.println("task is running....");
        }



        executorService.shutdown();
    }
}
