package leetcode.week1;

import java.util.Arrays;

// Contains Duplicate [lv: easy]
public class LC217 {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i+1]) continue;
            return true;
        }

        return false;
    }
}
