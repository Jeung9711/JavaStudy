package ch17;

public class ThreadExam1 extends Thread {
    String name;
    ThreadExam1(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " : " + i);
        }
    }

    public static void main(String[] args) {
        ThreadExam1 t1 = new ThreadExam1("A");
        ThreadExam1 t2 = new ThreadExam1("B");
        ThreadExam1 t3 = new ThreadExam1("C");

        // thread 동작
        t1.start();
        t2.start();
        t3.start();
    }

}
