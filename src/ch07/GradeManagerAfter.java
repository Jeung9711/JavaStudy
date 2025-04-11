package ch07;

import java.util.Scanner;

public class GradeManagerAfter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=== 첫 번째 학생 ===");
    processStudent(sc);

    System.out.println("\n=== 두 번째 학생 ===");
    processStudent(sc);
  }

  // 학생관련 업무 총괄 메소드
  static void processStudent(Scanner sc) {
    int kor = inputScore(sc, "국어");
    int eng = inputScore(sc, "영어");
    int math = inputScore(sc, "수학");

    int total = getTotal(kor, eng, math);
    double avg = getAverage(total, 3);
    String grade = getGrade(avg);

    printResult(total, avg, grade);
  }

  // 점수 입력 메소드
  static int inputScore(Scanner sc, String subject) {
    System.out.print(subject + " 점수 입력: ");
    return sc.nextInt();
  }

  // 총점 계산 메소드
  static int getTotal(int a, int b, int c) {
    return a + b + c;
  }

  // 평균 계산 메소드
  static double getAverage(int total, int count) {
    return (double) total / count;
  }

  // 학점 계산 메소드
  static String getGrade(double avg) {
    if (avg >= 90) return "A";
    else if (avg >= 80) return "B";
    else if (avg >= 70) return "C";
    else return "F";
  }

  // 계산 결과 출력 메소드
  static void printResult(int total, double avg, String grade) {
    System.out.println("총점: " + total);
    System.out.println("평균: " + avg);
    System.out.println("학점: " + grade);
  }
}
