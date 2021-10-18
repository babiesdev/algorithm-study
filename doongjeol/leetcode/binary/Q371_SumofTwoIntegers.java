package leetcode.binary;

public class Q371_SumofTwoIntegers {
    public static int getSum(int a, int b) {
        int xor = a^b;
        int and = (a&b) << 1;

        if(xor == 0)
            return and;
        if(and == 0)
            return xor;
        else
            return getSum(xor, and);

    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(getSum(a,b));

    }
}
