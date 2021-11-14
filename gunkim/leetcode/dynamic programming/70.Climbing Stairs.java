class Solution {
    private int[] memo = new int[45];
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        if(memo[n-1] != 0) return memo[n-1];

        memo[n-1] = climbStairs(n - 1) + climbStairs(n - 2);
        return memo[n-1];
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(6));
    }
}
