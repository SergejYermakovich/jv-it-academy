package lesson16.study.synch;

public class Counter {
    private volatile int count = 0;

    void increment() {
        count++;
   }

    public int getCount() {
        return count;
    }
}
