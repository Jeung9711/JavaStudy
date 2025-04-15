package ch12;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("banana", "apple", "cherry");

        // 오름차순
//        names.sort((String before, String after) -> {
//            return before.length() - after.length();
//        });

        // 오름차순 함수를 람다식으로 표현
        names.sort((before, after) -> before.length() - after.length() );

        // 문자열 길이순으로 정렬 (람다)
        names.sort((a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println(names);  // 출력: [apple, banana, cherry]
    }

}
