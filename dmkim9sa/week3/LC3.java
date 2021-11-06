package leetcode.week3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC3 {

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb");
        int max = maxSubArray(new int[]{2, 4, 7, 10, 8, 4}, 3);
        System.out.println("result = " + result);
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) return 0;

        int maxLength = 0;
        int i = 0, j = 0;
        int length = s.length();
        Set<Character> set = new HashSet<>();

        while(j < length) {
            if(i > j) break;
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
                continue;
            }
            set.remove(s.charAt(i++));
        }
        

        return maxLength;
    }

    // 크기가 3인 서브 배열의 합 중 가장 큰 서브 배열의 합
    public static int maxSubArray(int[] arr, int range) {

        int windowSum = 0;
        int start = 0;
        int maxSum = 0;

        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];

            if(end >= (range - 1)) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[start];
                start++;
            }
        }

        return maxSum;
    }
}
