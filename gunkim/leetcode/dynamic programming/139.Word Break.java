import java.util.List;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int size = s.length();

        boolean[] dp = new boolean[size + 1];
        dp[0] = true;

        for (int i = 0; i <= size; i++)
            for (int j = 0; j <= i; j++) {
                if (wordDict.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                }
            }
        return dp[size];
    }
}