public class Billiy {
    public static void main(final String[] args) {
//        System.out.println("x1f@tal.con".contains("@tal"));
        System.out.println(checkEmail("x1f@tal.con"));
        System.out.println(checkEmail("zx1f@tal.con"));
        System.out.println(checkEmail("x1f@taal.con"));
    }
    public static void findList(int n) {
        int[] num = new int[n];
        int count = n;
        int len = 0;
        int i = -1;
        while (count > 0) {
            i++;
            if (i >= n) i = 0;
            if (num[i] == -1) continue;
            len++;
            if (len == 3) {
                len = 0;
                num[i] = -1;
                count--;
                System.out.println(i + 1);
            }
        }
    }

    /**
     * 利用二分搜索 设在 nums 当中所有点都一样 只有一点不同，相当于一枚重量不同的硬币
     * @param nums
     */
    public  int findCoin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int count = 0; //记录称重次数
        while (left < right) {
            mid = (left + right) / 2;
            int sumLeft = sum(nums, left, mid);  //求重
            int sumRight = sum(nums, mid + 1, right);
            if (sumLeft < sumRight) {
                right = mid - 1;
            }
            else
                left = mid + 1;
            count++;  //统计次数
        }
        return count;
    }

    public  int sum(int[] nums, int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }

    /**
     * 字符串匹配，利用滑动窗口
     * @param str
     * @return
     */
    public static boolean checkEmail(String str) {
        if (str == null)
            return false;
        if (!str.contains("@tal") || str.charAt(0) != 'x')
            return false;

        int pre = 0;
        int index = 1;  //记录当前判定的位置
        int len = str.length();
        String parten = "@tal";

        while (index < len) {
            int j = 0;
            while (str.charAt(index) == parten.charAt(j)) {
                index++;
                j++;
                if (j == parten.length())
                    return true;
            }
            index++;
        }

        return false;
    }
}
