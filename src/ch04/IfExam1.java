package ch04;

public class IfExam1 {
    public static void main(String[] args) {
        int num = 0;

        // 개발자 역량에 따라 달라짐
        if (num>0) {
            if(num>10){
                System.out.println("10보다 큽니다");
            }else if (num>5){
                System.out.println("5보다 큽니다");
            }
        }else if(num==0) {
            System.out.println("0입니다");
        }else {
            System.out.println("음수입니다");
        }
    }
}
