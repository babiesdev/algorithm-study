class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int left_num = 1;
        int right_num = 1;
        int[] product = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            product[i] = left_num;
            left_num *= nums[i];
        }

        for (int i = nums.length - 1; i > -1; i--) {
            product[i] = right_num * product[i];
            right_num *= nums[i];
        }
        return product;
    }
}