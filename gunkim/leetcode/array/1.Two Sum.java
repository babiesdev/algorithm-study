import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = nums;
        for(int i = 0 ; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == j) continue;
                if(nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                    break;
                }
            }
        } 
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2,7,11,15}, 9)));
    }
}