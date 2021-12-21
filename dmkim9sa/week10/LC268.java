package leetcode.week10;

import java.util.*;

// Missing Number
public class LC268 {

    public static void main(String[] args) {
        int solution = missingNumber2(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println("solution = " + solution);
    }

    public static int missingNumber2(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            n += i - nums[i];
        }
        return n;
    }

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length + 1;
        boolean[] check = new boolean[n];

        for (int i = 0; i < nums.length; i++) {
            check[nums[i]] = true;
        }

        int num = 0;
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                num = i;
            }
        }
        return num;
    }
}
