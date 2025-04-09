package practice_0408;

import java.util.Scanner;

public class 알람 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("시간을 입력하세요(띄어쓰기로 구분)");
        int h = scan.nextInt();
        int m = scan.nextInt();
        int resH = 0;
        int resM = 0;

        // 45분 당긴 시와 분 계산
        if(m > 45) {
            resH = h;
            resM = m - 45;
        }else {
            if(h == 0) {
                resH = 23;
            }else {
                resH = h - 1;
            }
            resM = m + 15;
        }

        System.out.printf("%s : %s -> %s : %s\n", h,m,resH,resM);

        // 강사님 코드
        int minute = h*60 + m;
        minute -= 45;
        if(minute <0) {
            minute += (24*60);
        }
        m = minute%60;
        h = minute/60;

        System.out.printf("%s : %s", h,m);
    }
}
