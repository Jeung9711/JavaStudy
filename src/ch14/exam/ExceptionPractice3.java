package ch14.exam;

import java.io.IOException;

/* 예외 떠넘기기 */
public class ExceptionPractice3 {

  public static void readFile() throws IOException {
    throw new java.io.IOException("파일을 읽을 수 없습니다.");
  }

  public static void main(String[] args) {
    try {
      readFile();
    } catch (java.io.IOException e) {
      System.out.println("파일 예외 처리: " + e.getMessage());
    }
  }
}
