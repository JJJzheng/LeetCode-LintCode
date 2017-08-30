import scala.util.control.Breaks

object SearchInsertPosition {
  def main(args: Array[String]): Unit = {
    val nums = Array(1,3,5,9,15,21,34,42)
    println(searchInsert(nums, 34))  //6
    println(searchInsert(nums, 35))  //7
    println(searchInsert(nums, 1))    // 0
    println(searchInsert(nums, 0))  //0
    println(searchInsert(nums, 42))   //7
    println(searchInsert(nums, 43))//8


  }

  /**
    * 题目大意：要求在数组当中找出当前的数字所在的下标，如果不存在输出需要插入位置的下标，数组是排序的
    * 解法：二分搜索
    * @param nums
    * @param target
    * @return
    */
  def searchInsert(nums : Array[Int], target :Int) : Int = {
    if (nums.length == 0)
      return 0
    var left = 0
    var right = nums.length - 1
    var mid = (left + right) / 2
    if (target <= nums(0))
      return 0
    if (target > nums(nums.length - 1))
      return nums.length
    var  flag : Boolean = true
    while (flag) {
      if (target > nums(mid))
        left = mid + 1
      if (target < nums(mid))
        right = mid

      if (left >= right || nums(mid) == target)
        flag = false
      else
        mid = (left + right) / 2
    }

    if (nums(mid) == target)
      mid
    else right

  }
}
