package ch14.exam;

/* 0으로 나눴을 때 예외가 발생해도 프로그램이 중단되지 않도록 코드 작성 */
public class ExceptionPractice1 {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;

    try {
      int result = a / b;
      System.out.println("결과: " + result);
    }
    catch (ArithmeticException e) {
      System.out.println("예외 발생: 0으로 나눌 수 없습니다.");
    }

    System.out.println("프로그램 정상 종료");
  }
}
