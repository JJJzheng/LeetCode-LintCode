object MinimumDepthofBinaryTree {
  def src.java.main(args: Array[String]): Unit = {
    var node1 = new TreeNode(2)
    var node2 = new TreeNode(1)
    var node3 = new TreeNode(3)
    node1.left = node2
    node1.right = node3

    println(minDepth(node1))
  }

  /**
    * 题目大意：要求给出二叉树的最短深度
    * 解法：广度优先搜索，递归
    * @param root
    * @return
    */
  def minDepth(root: TreeNode): Int = {
    if (root == null)
      return 0
    if (root.left == null && root.right == null)
      return 1
//    var left : Int = minDepth(root.left) + 1
//    var right : Int = minDepth(root.right) + 1
//
//    Math.min(left, right)

    if (root.left == null)
       1 + minDepth(root.right)
    else if (root.right == null)
       1 + minDepth(root.left)
    else  1 + Math.min(minDepth(root.left) , minDepth(root.right))
  }


}
