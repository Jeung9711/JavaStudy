package ch03;

public class 연습문제03 {
    public static void main(String[] args) {
        // 표현 방법을 고민해서 최대한 간단히 만들기
        // 아래처럼 반복되는 코드로 표현된다면 반복문 적용 가능
        int num = 12345;
        int total = 0;
        while(num>0) {
            int 나머지 = num %10;
            num = num/10;
            total += 나머지;
        }

//        int total = num1 + num2 + num3 + num4 + num5;
        System.out.println("각 자리 숫자의 합 : " + total);
    }
}
