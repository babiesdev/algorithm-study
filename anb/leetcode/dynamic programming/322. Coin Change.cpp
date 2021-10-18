class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        int dp[10001]={}, i, j;
        memset(dp, 0x3F, sizeof dp);
        dp[0] = 0;
        for(i=0;i<coins.size();i++) 
            for(j=coins[i];j<=amount;j++)
                dp[j] = min(dp[j], dp[j-coins[i]] + 1);
        return dp[amount] == 0x3F3F3F3F ? -1 : dp[amount];
    }
};