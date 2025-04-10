package ch05;

public class 연습문제01 {
    public static void main(String[] args) {
        String text = "spwwz";
        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); // 문자 1개 추출
            char decrypt = (char) (c-11); // 아스키코드 11 감소
            System.out.print(decrypt);
        }
    }
}
