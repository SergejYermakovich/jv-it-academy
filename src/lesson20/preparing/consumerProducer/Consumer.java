package lesson20.preparing.consumerProducer;

import lesson20.preparing.consumerProducer.Buffer;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; ; i++) {
            buffer.get();
            System.out.println(Thread.currentThread().getName() + " gets " + i);
        }

    }
}
