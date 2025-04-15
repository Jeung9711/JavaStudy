package ch14.exam;

/* 잘못된 나이가 입력되면 예외를 발생시키는 기능과 예외를 처리하는 코드 작성 */
public class ExceptionPractice2 {

  public static void checkAge(int age) {
    if (age < 0) {
      throw  new IllegalArgumentException("나이는 0보다 작을 수 없습니다.");
    } else {
      System.out.println("입력된 나이: " + age);
    }
  }

  public static void main(String[] args) {
    try {
      checkAge(-5);
    } catch (IllegalAccessError e) {
      System.out.println("예외 처리됨: " + e.getMessage());
    }
  }
}
