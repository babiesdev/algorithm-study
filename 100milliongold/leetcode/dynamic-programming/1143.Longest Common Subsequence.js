/**
 * @param {string} text1
 * @param {string} text2
 * @return {number}
 */
var longestCommonSubsequence = function(text1, text2) {
    // Create dp table
    const dp = Array(text1.length+1).fill(0).map(() => Array(text2.length+1).fill(0))
    for(let i = 1; i < dp.length; i++) {
        for(let j = 1; j < dp[i].length; j++) {
            // If the letters match, look diagonally to get the max subsequence before this letter and add one
            if(text1[i-1]===text2[j-1]){
                dp[i][j] = dp[i-1][j-1] + 1
            } else {
                // If there is no match, set the cell to the previous current longest subsequence
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j])
            }
        }
    }
    return dp[text1.length][text2.length]
};