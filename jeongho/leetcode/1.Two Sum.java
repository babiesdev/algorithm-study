import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] print = solution.twoSum(new int[] { 1, 3, 5 }, 6);

        System.out.println(Arrays.toString(print));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] param = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {

                } else if (nums[i] + nums[j] == target) {
                    param[0] = i;
                    param[1] = j;

                    return param;
                }
            }
        }
        return param;
    }
}