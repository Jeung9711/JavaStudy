package ch09;

public class Calculator {
    // 생성된 계산기의 개수를 세는 변수
    static int count = 0;
    String owner;

    // Calculator 생성 시 소유자 이름 저장 + count 증가
    public Calculator(String owner) {  // (1)
        this.owner = owner;           // (2)
        count++;                    // (3)
    }

    // 현재까지 생성된 계산기 개수 출력
    public static void printCount() {
        System.out.println("총 " + count + "개의 계산기가 생성됨.");  // (4)
    }

    public int add(int a, int b) {
        return a+b;  // (5)
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator("철수");
        Calculator c2 = new Calculator("영희");

        c1.add(3, 5);
        System.out.println(c2.multiply(2, 4));

        // static 변수이기에 클래스명을 그대로 사용
        Calculator.printCount();  // 생성된 계산기 개수 확인
    }
}


