import java.util.ArrayList;

public class FindContinuousSequence {
    public static void main(final String[] args) {
        ArrayList<ArrayList<Integer>> lists = find(3);
//        System.out.println(lists);
        for (ArrayList<Integer> a: lists) {
            for (int i = 0; i < a.size(); i++)
                System.out.print(a.get(i) + "  ");
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> find(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum < 2)
            return res;
        int left = 1;
        int right = 2;
        int num = 3;
        while (right <= sum / 2 + 1 && left < right) {
            if (num < sum) {
                right++;
                num += right;
            } else if (num > sum) {
                num -= left;
                left++;
            } else  {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = left; i <= right; i++)
                    list.add(i);
                res.add(list);
                num -= left;
                left++;
            }
        }
        return res;
    }
}
