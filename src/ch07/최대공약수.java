package ch07;


public class 최대공약수 {
    static int func(int A, int B) {
        System.out.printf("%s, %s\n",A,B);
        if(B == 0) return A;
        return func(B, A%B);
    }

    public static void main(String[] args) {
        int a = 12, b = 6;
        int min = Math.min(a, b);

        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("최대공약수는 " + min + "입니다.");
                break;
            }
        }

        int res = func(254,116);
        System.out.println(res);
    }
}
