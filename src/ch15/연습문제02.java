package ch15;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class 연습문제02 {
    public static void main(String[] args) {
        Set<Integer> lotto = new TreeSet<Integer>();
        lotto.add(2);
        lotto.add(7);
        lotto.add(11);
        while (lotto.size() < 6) {
            int num = (int)(Math.random() * 45 + 1);
            // Set은 중복을 허용하지 않아 그냥 넣어도 됨
            lotto.add(num); // TreeSet 객체에 랜덤숫자 저장
        }
        Iterator<Integer> iter = lotto.iterator();
        while (iter.hasNext()) {
            System.out.println( iter.next());
        }
        //for(Integer a : lotto) {
        //}
    }
}
