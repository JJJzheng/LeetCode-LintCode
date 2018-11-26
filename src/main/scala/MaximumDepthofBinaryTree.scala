object MaximumDepthofBinaryTree {
  def src.java.main(args: Array[String]): Unit = {
    var node1 = new TreeNode(2)
    var node2 = new TreeNode(1)
    var node3 = new TreeNode(3)
    node1.left = node2
    node1.right = node3

    println(maxDepth(node1))
  }

  /**
    * 题目大意：求二叉树的深度
    * 解法：递归求解
    * @param root
    * @return
    */
  def maxDepth(root: TreeNode): Int = {
    if (root == null)
      return 0

    var left : Int = maxDepth(root.left)
    var right : Int = maxDepth(root.right)

    Math.max(left, right) + 1
  }
}
