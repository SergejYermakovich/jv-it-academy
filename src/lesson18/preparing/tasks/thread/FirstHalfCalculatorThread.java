package lesson18.preparing.tasks.thread;

public class FirstHalfCalculatorThread extends Thread {
    private final int[] array;

    public FirstHalfCalculatorThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum += array[i];

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("first half = " + sum);
    }
}
