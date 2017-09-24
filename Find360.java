import java.util.Scanner;

public class Find360 {
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
                nums[i] = in.nextInt();
            int m = in.nextInt();
            int left = 0;
            int right = 0;
            for (int i = 0; i < m; i++) {
                left = in.nextInt();
                right = in.nextInt();
                find(nums, left - 1, right - 1);
            }
        }
    }
    public static void find(int[] nums, int left, int right) {
        if ((right - left) < 2) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        for (int i = left; i < nums.length - 2; i++) {
            if (nums[i] <= nums[i + 1] && nums[i + 1] <= nums[i + 2])
                sum++;
            if ((i + 2) >= right)
                break;
        }
        System.out.println(sum);
    }
}
