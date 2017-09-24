public class RemoveElement {
    public static void main(final String[] args) {

    }

    /**
     * 题目大意：在给定数组中删除所给出的数字 并且给出数量
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null)
            return 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[n++] = nums[i];
        }
        return n;

    }
}
