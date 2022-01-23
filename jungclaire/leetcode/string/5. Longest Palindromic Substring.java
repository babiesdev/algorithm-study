class Solution5 {
    public String longestPalindrome(String s) {
        String result = "";
        char[] chr = s.toCharArray();
        boolean[][] dp = new boolean[chr.length][chr.length];
        int maxNumber = 0;

        for (int i = chr.length - 1; i >= 0; i--) {
            for (int j = i; j < chr.length; j++) {
                dp[i][j] = (chr[i] == chr[j] && (j - i <= 2 || dp[i + 1][j - 1]));
                if (dp[i][j] && j - i >= maxNumber) {
                    maxNumber = j - i;
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }
}