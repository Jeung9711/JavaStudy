package ch06;

public class 연습문제01 {
    public static void main(String[] args) {
        int[] arr = {21, 32, 13, 44, 25, 76, 97, 8, 89, 1};
        int sum = 0;
        float avg = 0f;
        // ① 합 구하기 코드 작성
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        avg = (float) (sum)/arr.length;
        System.out.println("합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
