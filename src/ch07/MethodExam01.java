package ch07;

import org.w3c.dom.ls.LSOutput;

public class MethodExam01 {
    public static void main(String[] args) {
        String result = printStar(8, '*');
        System.out.println(result);

        // 연습문제03의 구구단 호출하기
        // 클래스를 호출해야 하니까 클래스 이름 연습문제03을 선언
        연습문제03 a = new 연습문제03();
        String res = a.gugudan();
        System.out.println(res);
    }

    // 메소드 생성, void가 아닌 리턴값 반환 필요
    // 반환값은 메소드 타입과 일치해야 함
    public static String printStar(int count, char ch) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                result += ch;
            }
            result += "\n";
        }
        return result;
    }
}
