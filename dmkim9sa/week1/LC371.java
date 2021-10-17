package leetcode.week1;

public class LC371 {

    public int getSum(int a, int b) {
        // 비트연산 덧셈의 핵심: XOR(서로 다르면 1 반환), AND(둘 다 1이면 1 반환), <<(왼쪽으로 비트 이동)
        if(b == 0) return a;

        int sum = a^b;
        int carry = (a&b) << 1;

        return getSum(sum, carry);
    }
}
