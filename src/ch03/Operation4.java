package ch03;

import java.util.Scanner;

public class Operation4 {
    public static void main(String[] args) {
        // 250408 03.연산자
        // import -> Ctrl + Space/ Alt+ Enter
        // 도구 사용법 익히기 -> 각 함수마다 달라서 외우기
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자만 입력해주세요");
        int score = scan.nextInt();
        System.out.printf("당신이 입력한 값은 %s입니다", score);
    }
}
