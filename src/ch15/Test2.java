package ch15;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "bb", "ccc");

        list.stream()               // 스트림 생성
                .filter(s -> s.length() > 1)  // 중간 연산
                .map(String::toUpperCase)     // 중간 연산
                .forEach(System.out::println); // 최종 연산

        List<String> list3 = list.stream().map(String::toUpperCase).toList();

        List<Integer> list2 = list.stream().map(v -> v.length()).toList();
        System.out.println(list2);
    }
}
