object SUM3 {
  def src.java.main(args: Array[String]): Unit = {
    threeSum(Array(-1, 0, 1, 2, -1, -4))
  }

  /**
    * 题目大意：在一个数组当中寻找是否存在三个数字 a b c 使得 a + b + c = 0
    * 解法：利用 twoSum a + b = -c ，先排序，然后对每个数字 k 进行查找是否在当前数组中存在两个数字的和等于 -k
    * @param nums
    * @return
    */
  def threeSum(nums: Array[Int]): List[List[Int]] = {
//    var arr = new List[List[Int]]
    if (nums.length < 3 || nums == null)
      null
    var ans: Array[Int] = nums.sorted

    null
  }
}


/**
  * java 的 ac 代码
  * public class Sum3 {
    public static void src.java.main(final String[] args) {
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
//                System.out.println(-target + "  " + nums[left] + "  " + nums[right]);
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
  */
