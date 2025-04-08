package ch03;

public class 연습문제05 {
    public static void main(String[] args) {
        // 대문자도 소문자도 아닌 문자 입력시?
        char ch = 'T';
        char lowerCase = ch < 97 ? (char) (ch +32)  : ch;
        System.out.println("입력된 문자 : " + ch);
        System.out.println("소문자로 변경된 문자 : " + lowerCase);
    }
}
