package ch04;

import java.util.Calendar;

public class 연습문제01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.printf("현재 연도는 %s년\n", year);

        year = 500;
        System.out.printf("%s", year);
        String res = "";
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    res = "윤년";
                } else {
                    res = "평년";
                }
            } else {
                res = "평년";
            }
            res = "평년";
        }

        System.out.printf("%s", res);
    }
}
