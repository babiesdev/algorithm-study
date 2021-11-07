package leetcode.week3;

import java.util.Arrays;

// Product of Array Except Self
public class LC238 {

    public static void main(String[] args) {
        int[] result = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] except = new int[nums.length];
        except[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            except[i] = except[i - 1] * nums[i - 1];
        }

        System.out.println(Arrays.toString(except));

        int mul = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            mul *= nums[i + 1];
            except[i] *= mul;
        }

        return except;
    }
}
