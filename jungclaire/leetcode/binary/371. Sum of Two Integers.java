class Solution371 {
  public int getSum(int a, int b) {
    while (a != 0 && b != 0) {
      int and = a & b;
      int xor = a ^ b;
      a = and << 1;
      b = xor;
    }
    if (a != 0) {
      return a;
    } else {
      return b;
    }
  }
}