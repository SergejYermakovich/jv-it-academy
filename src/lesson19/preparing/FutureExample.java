package lesson19.preparing;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callableTask = () -> {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                sum += i;
            }
            return sum;
        };

        // invokeAll


        Future<Integer> future = executorService.submit(callableTask);

        System.out.println("Задание выполнено? - " + future.isDone());

        for (;;) {
          if (future.isDone()) {
              System.out.println("Завершено. Результат: " + future.get());
              break;
          } else {
              System.out.println("еще выполняется.....");
          }

        }

    }
}
