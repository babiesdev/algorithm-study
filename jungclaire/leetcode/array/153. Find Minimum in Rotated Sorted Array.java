class Solution153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] <= nums[right]) {
                return nums[left];
            }
            int m = (left + right) / 2;
            if (nums[m] >= nums[left]) {
                left = m + 1;
            } else {
                right = m;
            }
        }
        return -1;
    }
}