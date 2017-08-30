object MergeSortedArray {
  def main(args: Array[String]): Unit = {
      merge2(Array(5,9,13,26,32,45,76,92,0,0,0,0,0,0,0,0,0,0,0,0),8, Array(1,4,5,9,17,24,38,46,58,72,92,102),12)
//    merge( Array(),0, Array(1,4,5,9,17,24,38,46,58,72,92,102),12)
  }
  def merge2(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var index1 = m - 1   // 对应nums1
    var index2 = n - 1   // 对应nums2
    var index = m + n -1  //  对应合并后的数组
    if (n == 0)
      return
    if (m == 0) {
      for (i <- 0 until n)
        nums1(i) = nums2(i)
      return
    }

    while (index1 >= 0 && index2 >= 0) {
      if (nums1(index1) > nums2(index2)) {
        nums1(index) = nums1(index1)
        index1 -= 1
        index -= 1
      }
      else {
        nums1(index) = nums2(index2)
        index2 -= 1
        index -= 1
      }
    }
    if (index2 == -1)
      return
    while (index >= 0)
    {
      nums1(index) = nums2(index2)
      index2 -= 1
      index -= 1
    }

    for (j <- 0 until m + n)
      println(nums1(j))
  }

  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {

    var array : Array[Int] = new Array[Int](m + n)
    //x 对应 nums1 m  y 对应 nums2 n i 对应新数组
    var x = 0
    var y = 0
    var i = 0
    while (x < m && y < n && i < m + n) {
      if (nums1(x) <= nums2(y)) {
        array(i) = nums1(x)
        x += 1
      }
      else {
        array(i) = nums2(y)
        y += 1
      }
      i += 1
    }
    while (x < m) {
      array(i) = nums1(x)
      x += 1
      i += 1
    }
    while (y < n) {
      array(i) = nums2(y)
      i += 1
      y += 1
    }
    for (j <- 0 until m + n)
      nums1(j) = array(j)
  }
}
