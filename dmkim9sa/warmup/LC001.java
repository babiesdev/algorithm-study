package leetcode.warmup;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 1. Two Sum [level : easy]
public class LC001 {

    // 2. Map
    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return new int[]{};
    }

    // 1. For
    public int[] twoSumFor(int[] nums, int target) {

        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}
