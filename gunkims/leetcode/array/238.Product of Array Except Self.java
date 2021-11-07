import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[]{1,2,3,4})));
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answers = new int[nums.length];

        int output = 1;
        for (int i = 0; i < nums.length; i++) {
            answers[i] = output;
            output *= nums[i];
        }
        output = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answers[i] *= output;
            output *= nums[i];
        }
        return answers;
    }
}