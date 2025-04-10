package ch06;

public class 최소값 {
    public static void main(String[] args) {
        int[] numbers = {3,2,1,7,4};

        // 0이 모든 배열의 최소값일 수 있어서 변경
        int min = numbers[0];
        for (int i=0; i<numbers.length; i++) {
            int now = numbers[i];
            if(now < min) {
                min = now;
            }
        }
    }
}
