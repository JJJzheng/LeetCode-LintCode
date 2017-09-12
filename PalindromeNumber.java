/**
 * 判断数字时候回文
 * Created by Administrator on 2017/7/7 0007.
 */
public class PalindromeNumber {
    public static void main(final String [] args) {
        System.out.println(isPalindromeNumber(-2147447412));
    }
    public static boolean isPalindromeNumber(int x) {
        System.out.println(x);
        if (x < 10 && x > -10)
            return true;
        if (x < 0)
            x = Math.abs(x);
        String str = String.valueOf(x);
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
