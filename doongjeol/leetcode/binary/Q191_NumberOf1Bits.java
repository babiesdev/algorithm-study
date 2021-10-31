package leetcode.binary;

public class Q191_NumberOf1Bits {
    public static int hammingWeight(int n) {
        int answer = 0 ;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if((n & mask) != 0){
                answer++;
            }
            mask <<= 1; // mask = mask << 1
        }

        return answer;

    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}