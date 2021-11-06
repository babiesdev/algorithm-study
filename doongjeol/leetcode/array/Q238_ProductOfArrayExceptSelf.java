package leetcode.array;

import java.util.EnumSet;

public class Q238_ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // result를 1로 초기화
        for(int i=0 ; i<nums.length ; i++){
            result[i] = 1;
        }

        // nums의 기준 왼쪽부터 계산하여 result 배열에 넣기 (첫번째 인덱스는 생략)
        for(int i=1 ; i<nums.length; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }

        // nums의 기준 오른쪽부터 계산하여 nums 배열에 넣기 (마지막 인덱스는 생략)
        for (int i = (nums.length-2); i >= 0; i--) {
            nums[i] = nums[i] * nums[i + 1];
        }

        // 앞에서 구한 result와 nums를 곱해준다. (마지막 인덱스는 생략)
        for (int i = 0; i < nums.length - 1; i++) {
            result[i] = result[i] * nums[i + 1];
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);

        for (int i = 0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
