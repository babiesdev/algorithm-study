public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLIS(new int[] { 10, 9, 2, 5, 3, 7, 101, 18 }));
    }
}

class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        Arrays.fill(lis, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        Arrays.sort(lis);
        return lis[nums.length - 1];
    }
}