package ch04;

public class 연습문제04 {
    public static void main(String[] args) {
        //5개마다 줄바꿈 실행
        for (int i=1; i<=20; i++) {
            System.out.print((i<10? "0"+1 : i) + " ");
//            if(i<10) {
//                System.out.print("0"+ i);
//            } else {
//                System.out.print(i);
//            }
//            System.out.print(" ");
            if(i%5 == 0) {
                System.out.println();
            }
        }
    }
}
