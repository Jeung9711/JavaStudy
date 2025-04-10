package ch07;

public class 연습문제03 {
    public static void main(String[] args) {
        String result = gugudan();
        System.out.println(result);
    }

    // main에서 출력하기 위한 리턴값 설정
    static String gugudan() {
        String result = "";
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                result += i + " * " + j + " = " + (i * j) + "\n";
            }
        }

        return result;
    }
}
