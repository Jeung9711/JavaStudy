package ch17;

import java.util.ArrayList;
import java.util.Vector;

public class CounterTestSync {
    static int count = 0; // 공유 자원

    // count 증가를 synchronized로 감싸기
    // increment에 대해서만 각 스레드가 순서대로 작용
    // 동기화는 무조건 메소드에 걸어야 함
    // 메소드가 접근하는 것만 동기화 시키기 남발x
    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("최종 count 값: " + count);
    }
}
