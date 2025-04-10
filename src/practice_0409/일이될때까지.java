package practice_0409;

public class 일이될때까지 {
    public static void main(String[] args) {
        int N = 15632, K = 13;
        int count = 0;

        while(N > 1) {
            count++;
            if(N % K == 0) {
                N /= K;
            } else {
                int minus = N % K;
                N -= minus;
//                N -= 1;
            }
        }
        System.out.printf("동작횟수: %s", count);

    }
}
