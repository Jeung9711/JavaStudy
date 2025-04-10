package practice_0409;

import java.util.Arrays;

public class 곱하기혹은더하기 {
    public static void main(String[] args) {
        String s;
        s = "02984";
        String[] nums = s.split("");
        System.out.println(Arrays.toString(nums));

        int result = 0;
        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (n <= 1 || result <= 0) {
                result += n;
            } else {
                result *= n;
            }
        }
        System.out.println(result);
    }
}
