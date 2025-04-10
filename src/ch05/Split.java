package ch05;

public class Split {
    public static void main(String[] args) {
        String str = "  Java Secure Coding  ";
        String[] strs = str.split(" ");
        System.out.println(strs.length);
        // 앞뒤에 공백을 넣으면 ""이라는 값이 분리됨

//        for (String s : strs) {
//            System.out.println(s);
//        }
    }
}
