package leetcode.week3;

// Number of 1 Bits
public class LC198 {

    public static void main(String[] args) {
        int result = hammingWeight(64);
        System.out.println("result = " + result);
    }

    public static int hammingWeight(int n) {

        int sum = 0;

        while (n != 0) {
            sum += (n & 1);
            n >>>= 1; // n = n >>> 1;
        }

        return sum;
    }
}
