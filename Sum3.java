import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Sum3 {
    public static void main(final String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = threeSum(arr);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        if (nums == null || nums.length < 3)
            return results;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right  = nums.length - 1;
            int target = 0 - nums[i];
            twoSum(target, left, right, results, nums);
        }
        return results;
    }

    public static void twoSum(int target, int left, int right, List<List<Integer>> lists, int[] nums) {
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                List<Integer> ans = new ArrayList<>();
                ans.add(-target);
                ans.add(nums[left]);
                ans.add(nums[right]);
                lists.add(ans);
                System.out.println(-target + "  " + nums[left] + "  " + nums[right]);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else
                left++;
        }
    }
}
