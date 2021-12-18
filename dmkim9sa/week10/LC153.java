package leetcode.week10;

/**
 * Find Minimum in Rotated Sorted Array
 */
public class LC153 {

    public static void main(String[] args) {
        int solution = findMin(new int[]{3, 4, 5, 1, 2});
        System.out.println("solution = " + solution);

    }
    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] <= nums[right]) {
                return nums[left];
            }
            int midian = (left + right) / 2;
            if (nums[midian] >= nums[left]) {
                left = midian + 1;
            }else {
                right = midian;
            }
        }

        return -1;
    }
}
