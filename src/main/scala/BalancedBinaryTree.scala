object BalancedBinaryTree {
  var isBalence : Boolean = true

  def src.java.main(args: Array[String]): Unit = {
    var node1 = new TreeNode(2)
    var node2 = new TreeNode(1)
    var node3 = new TreeNode(3)
    node1.left = node2
    node1.right = node3
    println(isBalanced(node1))

  }
  def isBalanced(root: TreeNode): Boolean = {
    getDepth(root)
    isBalence
  }

  def getDepth(treeNode: TreeNode) : Int = {
    if (treeNode == null)
      return 0
    var left : Int = getDepth(treeNode.left)
    var right : Int = getDepth(treeNode.right)


    if (Math.abs(left - right) > 1)
      isBalence = false
    if (left > right)
      left + 1
    else
      right + 1
  }
}
