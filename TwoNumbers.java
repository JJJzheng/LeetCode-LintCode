/**
 * Created by Administrator on 2017/7/6 0006.
 */
public class TwoNumbers {
    public static void main(final String[] args) {
        int[] array = {3,2,4};
        twoSum(array, 6);
        int i = 011;
        System.out.println(i);
    }

    public static int[] twoSum(int[] nums, int target) {
        /*int[] array = new int[2];
        int left = 0;
        int right = nums.length - 1;
        array[0] = 0;
        array[1] = 0;
        int curNum = nums[left] + nums[right];
        while (curNum != target) {
            if (left >= right)
                return array;
            if (curNum > target)
                right--;
            if (curNum < target)
                left++;
            curNum = nums[left] + nums[right];
        }

        array[0] = left;
        array[1] = right;
        System.out.println(left + " " + right);
        return array;*/
        int[] array = new int[2];
        if (nums == null || nums.length <= 0)
            return array;
        int curNum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                curNum = nums[i] + nums[j];
                if (curNum == target) {
                    array[0] = i;
                    array[1] = j;
                    break;
                }
            }
        }
        return array;

    }
}
