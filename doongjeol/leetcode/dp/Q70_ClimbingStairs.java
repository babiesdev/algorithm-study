package leetcode.dp;

public class Q70_ClimbingStairs {
    public static int[] arr;
    public static int climbStairs(int n) {
        arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            if(i == 2)
                arr[2] = 2;
            else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }

        return arr[n];
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(climbStairs(n));
    }
}
