package lesson18.preparing.tasks.thread;

public class SecondHalfCalculatorThread extends Thread {

    private final int[] array;

    public SecondHalfCalculatorThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = array.length / 2; i < array.length; i++) {
            sum += array[i];
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Second half = " + sum);
    }
}
