import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.countBits(2)));
    }
}

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i / 2] + (i % 2 == 0 ? 0 : 1);
        }
        return ans;
    }
}