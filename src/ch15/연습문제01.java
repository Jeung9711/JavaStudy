package ch15;

import java.util.*;

public class 연습문제01 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2); numbers.add(3); numbers.add(3);
        numbers.add(2); numbers.add(2); numbers.add(4);
        numbers.add(1); numbers.add(8); numbers.add(7);
        System.out.println("삭제 전 데이터 : " + numbers);

        // set으로 요소를 출력하려면 Iterator 필요
        Iterator<Integer> iter = numbers.iterator();
        // 반환값이 boolean
        while (iter.hasNext()) {
            // 반환값이 다음 요소
            Integer value = iter.next();
            System.out.println(value);
        }

//        for(int i=0; i<numbers.size(); i++) {
//        for(int i=numbers.size()-1; i >-1; i--) {
//            if( numbers.get(i) % 2 == 0 ) {
//                numbers.remove(i);
//            }
//        }
//        System.out.println("삭제 후 데이터 : " + numbers);
    }
}
