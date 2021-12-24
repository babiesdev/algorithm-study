package leetcode.week11;

import java.util.*;

/**
 * Longest Consecutive Sequence
 * 가장 긴 연속되는 수열의 길이를 반환하는 문제
 */
public class LC128 {

    public static void main(String[] args) {
        int solution = longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        System.out.println("solution = " + solution);
    }


    /**
     * Union Find
     */
    public static int longestConsecutiveUnionFind(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();


        return 0;
    }


    // Big-O: O(n) (for loop 1개 사용!)
    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int[] arr = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int n = 0;
        while (it.hasNext()) {
            arr[n] = it.next();
            n++;
        }

        int length = 1;
        int max = 0;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int num = arr[i];
            if (num + 1 != arr[i + 1]) {
                max = Math.max(max, length);
                length = 1;
                continue;
            }
            length++;
        }
        return Math.max(max, length);
    }
}