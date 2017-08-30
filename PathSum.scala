object PathSum {
  def main(args: Array[String]): Unit = {
    var node1 = new TreeNode(2)
    var node2 = new TreeNode(1)
    var node3 = new TreeNode(3)
//    node1.left = node2
//    node1.right = node3

    node2.left = node1
//    println(ans)
//    println(hasPathSum(node1,4))
//    println(hasPathSum(node1,3))
//    println(hasPathSum(null,3))
//    println(hasPathSum(null,0))
//    println(hasPathSum(node2,0))

    println(hasPathSum(node2, 1))
    println(hasPathSum2(node2, 1))
  }

  /**
    * 题目大意：给定一棵树以及一个数字，求这个树的路径下数字和是否等于给定数字
    * 解法：递归,深度优先搜索
    * @param root
    * @param sum
    * @return
    */

  def hasPathSum2(root: TreeNode, sum: Int): Boolean = {
    if (root == null)
      return false
    if (root.left == null && root.right == null && sum - root.value == 0)
      return true
    hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value)
  }

  var ans : Boolean = false
  def hasPathSum(root: TreeNode, sum: Int): Boolean = {
    if (root == null && sum == 0)
      return false
    if (root == null && sum != 0)
      return false
    if (root != null && sum == 0)
      return false

    DFSPathSum(root,sum)
    ans
  }

  def DFSPathSum(root: TreeNode, n: Int): Unit = {
    if (n - root.value < 0)
      return
    if (n - root.value == 0 && root.left == null && root.right == null) {
      ans = true
      return
    }

    if (root.left != null)
      DFSPathSum(root.left, n - root.value)
    if (root.right != null)
      DFSPathSum(root.right, n - root.value)
  }


}
