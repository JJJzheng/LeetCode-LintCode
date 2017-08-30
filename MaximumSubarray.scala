object MaximumSubarray {
  def main(args: Array[String]): Unit = {
    val arr = Array(-2,1,-3,4,-1,2,1,-5,4)
    println(maxSubArray(arr))
  }

  /**
    * 题目大意：要求数组最大连续子串
    * 解法：类似DP，只要当前位置的和大于零就继续加，小于零就重新开始计数
    * @param nums
    * @return
    */
  def maxSubArray(nums: Array[Int]): Int = {
    if (nums.length == 1)
      return nums(0)
    if (nums.length < 0 || nums == null)
      return 0
    var nowMax : Int = nums(0)
    var sum = nums(0)
    for (i <- 1 until nums.length) {
      if (sum <= 0)
        sum = nums(i)
      else
        sum += nums(i)
      if (sum > nowMax)
        nowMax = sum
    }
    nowMax
  }
}
