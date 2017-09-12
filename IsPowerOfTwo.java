/**
 * LeetCode 231
 * Created by Administrator on 2017/7/7 0007.
 */
public class IsPowerOfTwo {
    public static void main(final String[] args) {
        System.out.println(isPowerOfTwo(5));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n % 2 == 1)
            return false;
        int count = 0;
        while (n > 0) {
            count += n & 0x01;
            n >>= 1;
        }
        return  count == 1;
    }
}
