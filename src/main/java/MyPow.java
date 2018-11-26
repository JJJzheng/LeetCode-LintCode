public class MyPow {
    public static void main(final String[] args) {
        System.out.println(myPow(2.1, 3));
    }

    /**
     * 求 x 的 n 次幂
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        double ans = 1.0;
        if (n == 0) return 1.0;
        else if (n < 0) {
            if (n == Integer.MIN_VALUE)
                return 1.0 / (myPow(x, Integer.MAX_VALUE) * x);
            else return 1.0 / myPow(x, -n);
        } else  {
          ans = 1.0;
          while (n > 0) {
              if ((n & 1) == 1)
                  ans *= x;
              x *= x;
              n >>= 1;
          }
        }
        return ans;
    }
}
