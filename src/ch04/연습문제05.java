package ch04;

public class 연습문제05 {
    public static void main(String[] args) {
        for(int row=0; row<5; row++) {
            for(int col=0; col<=row; col++){
                int space = 4 - row;
                if(space > col) {
                    System.out.print("");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
