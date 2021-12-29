import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(sl.twoSum(nums,9)));
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(  2>= nums.length && nums.length >= 10000 )  return null;
        if(-1000000000 >= target && target >= 1000000000) return null;

        for(int i=0;i<nums.length-1;i++) {
            if(-1000000000 >= nums[i] && nums[i] >= 1000000000) return null;
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j] == target){
                    nums=new int[]{i,j};
                    return nums;
                }
        }
        return null;
    }// twoSum -end

}