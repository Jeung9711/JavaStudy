package ch05;

public class 연습문제02 {
    public static void main(String[] args) {
        String text = "동해물과 백두산이 ... 우리나라 만세";
        String[] texts = text.split(" ");
        String temp = "";
        String sep = ""; // 띄어쓰기 담당
        for(String t : texts) {
            temp += sep + t;
            sep = " ";
            System.out.println(temp);
        }
    }
}
