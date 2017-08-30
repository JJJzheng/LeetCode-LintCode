object MedianofTwoSortedArrays {

  def main(args: Array[String]): Unit = {
    println(findMedianSortedArrays(Array(1,2),Array(3,4)))
  }

  /**
    * http://www.cnblogs.com/yuzhangcmu/p/4138184.html
    * https://leetcode.com/problems/median-of-two-sorted-arrays/discuss/
    * @param nums1
    * @param nums2
    * @return
    */
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    if(nums1 == null || nums2 == nums1)
      return 0
    val len = nums1.length + nums2.length

    var ans: Double = 0

    if (len % 2 == 0)
      ans = (findKthNumble(nums1, nums2, 0, 0, len / 2) + findKthNumble(nums1, nums2, 0, 0, len / 2 + 1)) / 2
    else
      ans = findKthNumble(nums1, nums2, 0, 0, len / 2 + 1)

    ans
  }

  def findKthNumble(A: Array[Int], B: Array[Int], indexA: Int, indexB: Int, k: Int): Int = {
    val lenA = A.length
    val lenB = B.length

    if (indexA >= lenA)
       B(indexB + k - 1)
    if (indexB >= lenB)
       A(indexA + k - 1)

    if (k == 1)
      Math.min(A(indexA), B(indexB))

    val mid = k / 2 - 1

    var keyA: Int = 0
    var keyB: Int = 0

    if (indexA + mid >= lenA)
      keyA = Integer.MAX_VALUE
    if (indexA + mid < lenA)
      keyA = A(indexA + mid)


    if (indexB + mid >= lenB)
      keyB = Integer.MAX_VALUE
    if (indexB + mid < lenB)
      keyB = B(indexB + mid)

    if (keyA < keyB)
      findKthNumble(A, B, indexA + k / 2, indexB, k - k / 2)
    else
      findKthNumble(A, B, indexA, indexB + k / 2, k - k / 2)
  }
}
