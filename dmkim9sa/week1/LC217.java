package leetcode.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Contains Duplicate [lv: easy]
public class LC217 {

    // Set 1
    public boolean containsDuplicateSet1(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        return !(set.size() == nums.length);
    }

    // Set 2
    public boolean containsDuplicateSet2(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    // 배열 정렬
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i+1]) continue;
            return true;
        }

        return false;
    }
}
