object RemoveDuplicatesfromSortedArray {

  def main(args: Array[String]): Unit = {
    println(removeDuplicates(Array(1,2,2,5,5,7,8,8,9)))
  }

  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length == 0 || nums == null)
      return 0
    var left : Int = 1
    var right : Int = 1
    while (right < nums.length) {
      if (nums(right) != nums(right - 1)) {
        nums(left) = nums(right)
        left += 1
      }
      right += 1
    }
    left
  }

}
