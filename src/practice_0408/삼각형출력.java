package practice_0408;

public class 삼각형출력 {
    public static void main(String[] args) {
        for (int i=0; i<11; i++) {
            for (int j=0; j<11; j++) {
                // *의 영역 지정
                int star = 0;
                if(i>5) {
                    star = 10 - i;
                }else {
                    star = i;
                }
                
                // j에 따라 출력값 변경
                if(j < 5-star) {
                    System.out.print(" ");
                }else if(j >= (5-star) && j <= (5+star)) {
                    System.out.print("*");
                }else if (j > 5 + star) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 강사님 코드
        int count =5;
        int center =count/2+1;
        int left =center-1;
        int right =center +1;
        for(int row=1; row<=count; row++) {
            for(int col=1; col<=count; col++) {
                if(left < col && right>col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if(row<center){
                left--;
                right++;
            } else {
                left++;
                right--;
            }
            System.out.println();
        }
    }
}
