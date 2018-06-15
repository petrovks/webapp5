package lesson07;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * GKislin
 * 30.01.2015.
 */
public class MailSum {
    static int syncSum;
    static volatile int sum;
    static final AtomicInteger ATOMIC_SUM = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            new Thread() {
                @Override
                public void run() {
                    sum++;
                    ATOMIC_SUM.incrementAndGet();
                    synchronized (this) {
                        syncSum++;
                    }
                }
            }.start();
        }
        Thread.sleep(500);
        System.out.println(sum);
        System.out.println(syncSum);
        System.out.println(ATOMIC_SUM.get());
    }
}
