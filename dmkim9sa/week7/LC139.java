package leetcode.week7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Word Break
public class LC139 {

    public static void main(String[] args) {
        String[] arr = {"leet", "code"};
        boolean solution = wordBreak("leetcode", Arrays.stream(arr).collect(Collectors.toList()));
        System.out.println("solution = " + solution);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    System.out.println(s.substring(j, i));
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}