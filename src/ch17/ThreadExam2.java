package ch17;

public class ThreadExam2 implements Runnable {
    String name;
    ThreadExam2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " : " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExam1 t1 = new ThreadExam1("A");
        ThreadExam1 t2 = new ThreadExam1("B");
//        new Thread(() -> {}); // 인터페이스 사용시 람다식으로 사용 가능

        // thread 동작, 각 동작의 순서는 무작위
//        t1.start();
//        t2.start();

        ThreadExam1 tt1 = new ThreadExam1("C");
        tt1.start();
        tt1.join(); // 현재 동작중인 스레드 끝날때까지 대기

        ThreadExam1 tt2 = new ThreadExam1("D");
        tt2.start();
        tt2.join();
    }

}
