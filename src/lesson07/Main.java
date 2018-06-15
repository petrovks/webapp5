package lesson07;

import java.util.Date;

/**
 * GKislin
 * 30.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(Long.MAX_VALUE));
    }
}
