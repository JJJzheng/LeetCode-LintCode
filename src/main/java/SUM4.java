import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SUM4 {
    public static void main(final String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        fourSum(arr, 0);
    }

    /**
     * 题目大意： KNUM系列问题
     * @param nums
     * @param target
     * @return
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();


        if (nums == null || nums.length < 4)
            return result;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1;j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;


                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        result.add(list);
                        System.out.println(nums[i] + "  " + nums[j] + "  " + nums[left] + "  " + nums[right]);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left  - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }
            }
        }
        return result;
    }
}
