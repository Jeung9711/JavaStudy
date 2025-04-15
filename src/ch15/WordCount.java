package ch15;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String text = """
                안촉촉한 초코칩 나라에 살던 안촉촉한 초코칩이 촉촉한 초코칩 나라의 
                촉촉한 초코칩을 보고 촉촉한 초코칩이 되고 싶어서 촉촉한 초코칩 나라에 
                갔는데 촉촉한 초코칩 나라의 촉촉한 초코칩 문지기가 넌 촉촉한 초코칩이 
                아니고 안촉촉한 초코칩이니까 안촉촉한 초코칩나라에서 살아 라고해서 안촉촉한 
                초코칩은 촉촉한 초코칩이 되는 것을 포기하고 안촉촉한 초코칩 나라로 돌아갔다.
                """;
        String[] words = text.split(" ");

        // 의사 코드 pseudo code
        Map<String, Integer> map = new HashMap<>();
        // 반복
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // 단어가 있다면
            if (map.containsKey(word)) {
                // 횟수+1
                int count = map.get(word);
                count++;
                map.put(word, count);
            } else {
                // 단어가 없다면
                // words 단어를 map에 put(단어, 1)
                map.put(word, 1);
            }
        }
        // 많이 등장된 단어 상위 5개만 출력하기
        System.out.println(map);
    }
}
