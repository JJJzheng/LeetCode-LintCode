/**
 * 数字倒转，符号不变，主要Int 32位越界
 * Created by Administrator on 2017/7/7 0007.
 */
public class ReverseInteger {
    public static void main(final String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        System.out.println(x);
        if (x > -10 && x < 10)
            return x;
        long num = 0;
        boolean neg = x < 0;
        if (neg)
            x = Math.abs(x);
        while (x > 0) {
            int n = x % 10;
            num = num * 10 + n;
            if (num > 2147483647)
                return 0;
            x /= 10;
        }
        if (neg)
            num *= -1;
        return (int) num;
    }
}
