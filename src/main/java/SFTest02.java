import java.util.Scanner;

public class SFTest02 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int len = 0, t = n;
            while (t > 0) {
                len++;
                t /= 10;
            }
            long sum = 2, m = 4;
            for (int i = 0; i < len; i++) {
                sum += m;
                m *= 2;
            }

            while (Long.valueOf(getLuckNumber(sum)) > n) {
                sum--;
            }
            System.out.println(sum);
        }
    }
    public static String getLuckNumber(long n){
        //1、为方便处理将n装换成二进制的串
        String str = Long.toBinaryString(n);

        //2、计算二叉树的层数层数
        int level = str.length();
        if(!str.contains("0")){
            level += 1;
        }

        //3、设定第n个是所在层的第k个，计算K
        long m= n-((1<<(level-1)) -2);

        //4、计算对应的二进制
        //  （1）位数：就是所在层数减一，即level-1
        //  （2）大小：树的同一层是从0开始记得，以第四层为例 000，001，010，011，100，101，110，111
        //      而m是从1，开始记的，所以从零开始计的话，就是第m-1个节点，
        //      第m-1个节点的值就是将m-1转成二进制，左面以0填充
        String result = Long.toBinaryString(m-1);
        while(result.length()<level-1){
            result = "0"+result;
        }

        //5、将“0”换成“4”，“1”换成“7”,得到最终结果
        result = result.replace("0", "4");
        result = result.replace("1", "7");
        return result;
    }

}
