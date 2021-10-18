import java.util.HashMap;

class Solution {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int numsLength = nums.length;
    Integer result;

    for (int i = 0; i < numsLength; i++) {
      result = map.get(nums[i]);
      if (result != null) {
        return new int[] {result, i};
      } else {
        map.put(target - nums[i], i);
      }
    }
    return new int[] {1, 2};
  }
}