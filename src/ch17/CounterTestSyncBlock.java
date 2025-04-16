package ch17;

public class CounterTestSyncBlock {
    static int count = 0; // 공유 자원
    // 잠금용 객체로 아무 의미 없음 의례적으로 객체로 생성
    static final Object lock = new Object(); // 잠금용 객체

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                // 동기화 블럭으로 동기화
                synchronized (lock) {
                    count++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    count++;
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("최종 count 값: " + count);
    }
}
