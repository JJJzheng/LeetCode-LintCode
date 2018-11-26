import java.util.Arrays;

public class Sum3Closest {
    public static void main(final String[] args) {
        int [] arr = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(arr, 1));
    }

    /**
     * 题目大意: 给定一个数组和数字，要求在数组中找出 3 个数相加和最接近所给出的数字
     * 解法：定一个指针遍历有序数组，然后用两个指针 start end 在其后的数组中二次遍历  暴力求解
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3)
            return 0;
        Arrays.sort(nums);
        int sum = 0;
        int start = 0;
        int end = nums.length - 1;
        int bestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            start = i + 1;  end = nums.length - 1;
            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(sum - target) < Math.abs(bestSum - target))
                    bestSum = sum;
                if (sum > target)
                    end--;
                else
                    start++;
            }
        }
        return bestSum;
    }
}
