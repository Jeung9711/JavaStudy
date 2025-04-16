package ch17;

public class CounterTest {
 static int count = 0; // 공유 자원

 public static void main(String[] args) throws InterruptedException {
   Thread t1 = new Thread(() -> {
     for (int i = 0; i < 10000; i++) {
       count++; // 동기화 없이 접근
     }
   });

   Thread t2 = new Thread(() -> {
     for (int i = 0; i < 10000; i++) {
       count++; // 동기화 없이 접근
     }
   });

   t1.start();
   t2.start();
   t1.join();
   t2.join();

   System.out.println("최종 count 값: " + count);
 }
}
