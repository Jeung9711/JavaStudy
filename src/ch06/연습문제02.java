package ch06;

public class 연습문제02 {
    public static void main(String[] args) {
        char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        int position = 0;

        for (int i=0; i<100; i++) {
            int pos = (int) (Math.random()*nums.length);

            //위치 교환하기
            char temp = nums[pos];
            nums[pos] = nums[0];
            nums[0] = temp;
        }
        System.out.println(nums);
    }
}
