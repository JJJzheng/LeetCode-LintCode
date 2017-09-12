/**
 * 汉明距离 ： 将一个字符变成另一个字符所需要改变的字符个数
 * 这题是求的二进制需要改变的个数  只需要异或操作 得到的结果统计1的个数
 * Created by Administrator on 2017/7/7 0007.
 */
public class HammingDistance {
    public static void main(final String[] args) {
        System.out.println(getDistance(4, 14));
    }

    public static int getDistance(int x, int y) {
        int cur = x ^ y;
        int sum = 0;
        //统计 二进制中 1的个数
        while (cur > 0) {
            cur = cur & (cur - 1);
            sum++;
        }
        return sum;
    }
}
