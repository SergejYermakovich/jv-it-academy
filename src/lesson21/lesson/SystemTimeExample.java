package lesson21.lesson;


import java.util.Date;

public class SystemTimeExample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();

        long nanoTimeStart = System.nanoTime();
        Thread.sleep(3000);
        long nanoTimeEnd = System.nanoTime();

        System.out.println("System.currentTimeMillis() -> " + start);

        System.out.println((nanoTimeEnd - nanoTimeStart) / 1000000000);


    }
}
