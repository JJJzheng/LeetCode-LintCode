object MaximumBinaryTree {
  def main(args: Array[String]): Unit = {

  }

  /**
    * 题目大意：给出一个数组，要求当前数组中的最大数 n 建立节点，n 两边的数字为左右子树，并且也按照以上规则建立二叉树
    * 解法： 递归，找出当前数组中的最大数字，建立节点，左右两边当场是新的数
    * @param nums
    * @return
    */
  def constructMaximumBinaryTree(nums: Array[Int]): TreeNode = {
    if (nums.length ==  0)
      return null
    recursion(nums, 0, nums.length - 1)
  }

  def recursion(arr: Array[Int], left: Int, right: Int): TreeNode = {
    if (left > right)
      return null

    var pos = left
    for (i <- left to right) {
      if (arr(i) > arr(pos))
        pos = i
    }

    var nowNode : TreeNode = new TreeNode(arr(pos))
    nowNode.left = recursion(arr, left, pos - 1)
    nowNode.right = recursion(arr, pos + 1, right)

    nowNode
  }
}
