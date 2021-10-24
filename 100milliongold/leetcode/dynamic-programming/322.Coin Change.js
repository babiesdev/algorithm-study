/**
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
 var coinChange = function(coins, amount) {
    const dp = new Array(amount + 1).fill(Infinity);

  // 초기값
  dp[0] = 0;

  for (let money = 1; money <= amount; money++) {
    for (let i = 0; i < coins.length; i++) {
      if (coins[i] <= money) {
        dp[money] = Math.min(dp[money], dp[money - coins[i]] + 1);
      }
    }
  }

  const answer = dp[amount] === Infinity ? -1 : dp[amount];
  return answer;
};

console.log(coinChange([186,419,83,408] ,6249))