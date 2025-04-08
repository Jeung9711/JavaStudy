package ch03;

public class 연습문제02 {
    public static void main(String[] args) {
        int number = 77;
        int ten = number / 10;
        int one = number % 10;
        boolean isMatch = ten == one;
        System.out.printf("십의 자리와 일의 자리 숫자가 같다 : %s", isMatch);
    }
}
