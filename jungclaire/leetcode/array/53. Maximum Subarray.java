class Solution53 {
    public int maxSubArray(int[] nums) {
        int cursor = Integer.MIN_VALUE;
        int result = cursor;

        for (int i : nums) {
            cursor = cursor > 0 ? cursor + i : i;
            result = Math.max(cursor, result);
        }

        return result;
    }
}