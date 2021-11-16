package leetcode.week6;

import java.util.Arrays;

// Counting Bits
public class LC338 {
    // DP
    public int[] countBitsDP(int n) {

        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = dp[i / 2] + i % 2;
        }
        return dp;
    }

    public int[] countBits(int n) {

        int[] answer = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int count = 0; // 1의 개수를 셀 변수
            String binary = Integer.toBinaryString(i);

            for (int j = 0; j < binary.length(); j++) {
                if(binary.charAt(j) == '1') count++;
            }

            answer[i] = count;
        }

        return answer;
    }

}
