package practice_0408;

public class 별연습01 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++){
                if(4-j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
