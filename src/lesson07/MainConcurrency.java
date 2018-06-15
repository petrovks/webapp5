package lesson07;

/**
 * GKislin
 * 30.01.2015.
 */
public class MainConcurrency {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("out");
                }
            }).start();
/*
            new Thread() {
                @Override
                public void run() {
                    System.out.println(this.getName());
                }
            }.start();
*/
        }
    }
}
