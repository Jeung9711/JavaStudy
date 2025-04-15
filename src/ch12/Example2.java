package ch12;
import java.util.*;
import java.util.function.Function;

public class Example2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");

        Function<String, Integer> lengthFunc = s -> s.length();

        //
        words.stream()
                // .map((v) -> {return v.toUpperCase() )} 같은 람다식 사용
                .map(lengthFunc)
                .forEach(len -> System.out.println("길이: " + len));
    }

}
