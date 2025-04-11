package ch07;

import java.util.Scanner;

public class GradeManagerBefore {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("국어 점수 입력: ");
    int kor = sc.nextInt();
    System.out.print("영어 점수 입력: ");
    int eng = sc.nextInt();
    System.out.print("수학 점수 입력: ");
    int math = sc.nextInt();

    int total = kor + eng + math;
    double avg = (double) total / 3;

    String grade;
    if (avg >= 90) grade = "A";
    else if (avg >= 80) grade = "B";
    else if (avg >= 70) grade = "C";
    else grade = "F";

    System.out.println("총점: " + total);
    System.out.println("평균: " + avg);
    System.out.println("학점: " + grade);
  }
}