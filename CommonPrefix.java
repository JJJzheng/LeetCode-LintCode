/**
 * 寻找字符串数组中的最长公共前缀
 * Created by Administrator on 2017/7/7 0007.
 */
public class CommonPrefix {
    public static void main(final String[] args) {
        String[] strs = {"asdeee", "asdeweq", "asdeeqwe", "asdasd"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int i = 1;
        String pre = strs[0];
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0) {
                //indexOf的作用： 判断String当中时候包含目标字符串;
                pre = pre.substring(0, pre.length() - 1);
                //sunstring 截取目标字符串， 参数是对应位置.
                System.out.println(pre + " " + i);
            }
            i++;
        }
        return pre;
    }
}
