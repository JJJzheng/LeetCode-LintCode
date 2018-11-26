import java.util.Scanner;
import java.util.Stack;

public class QSort {
    public static void main(final String[] args) {
            int length;
            Scanner in = new Scanner(System.in);
            length = in.nextInt();
            int[] array = new int[length];
            int i = 0;
            for (i = 0; i < length; i++)
                array[i] = in.nextInt();
            quicksort(array);
            for (i = 0; i < length; i++)
                System.out.print(array[i] + " ");
    }

    public static void quicksort(int[] array) {
        if (array == null || array.length == 1)
            return;
        //存放开始与结束索引
        Stack<Integer> stack = new Stack<>();
        //压栈
        stack.push(0);
        stack.push(array.length - 1);
        //利用循环里实现
        while (!stack.empty()) {
            int right = stack.pop();
            int left = stack.pop();
            //如果最大索引小于等于左边索引，说明结束了
            if (right <= left)
                continue;
            int i = findPartition(array, left, right);
            if (left < i - 1) {
                stack.push(left);
                stack.push(i - 1);
            }
            if (i + 1 < right) {
                stack.push(i + 1);
                stack.push(right);
            }
        }
    }
    //找到轴心，进行交换
    public static int findPartition (int[] data, int first, int end)
    {
        int temp;
        int i = first, j = end;
        if (first < end) {
            temp= data[i];
            //当i=j的时候，则说明扫描完成了
            while (i < j) {
                //从右边向左边扫描找到一个小于temp的元素
                while (j > i && data[j] > temp)j--;
                if (i < j) {
                    //将该元素赋值给temp
                    data[i]= data[j];
                    //赋值后就应该将i+1指向下一个序号
                    i++;
                }
                //然后从左边向右边开始扫描，找到一个大于temp的元素
                while (i < j && temp > data[i])i++;
                if (i < j) {
                    //将该元素赋值给temp
                    data[j] = data[i];
                    //赋值后就应该将j-1指向前一个序号
                    j--;
                }
            }
            //将轴数据放在i位置中
            data[i] = temp;
        }
        return i;
    }
}
