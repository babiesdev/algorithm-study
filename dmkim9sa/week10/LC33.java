package leetcode.week10;

/**
 * Search in Rotated Sorted Array
 */
public class LC33 {

    public static void main(String[] args) {
        int solution = search(new int[]{4,5,6,7,0,1,2}, 0);
        System.out.println("solution = " + solution);
    }

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int m = (left + right) / 2;
            if(nums[m] == target) {
                return m;
            } else if (nums[left] <= nums[m]) {
                if (target >= nums[left] && target < nums[m]) {
                    right = m - 1;
                }else {
                    left = m + 1;
                }
            } else {
                if (target > nums[m] && target <= nums[right]) {
                    left = m + 1;
                }else {
                    right = m - 1;
                }
            }
        }
        return -1;
    }
}
