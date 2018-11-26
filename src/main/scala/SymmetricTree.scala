object SymmetricTree {
  def src.java.main(args: Array[String]): Unit = {

  }

  /**+
    * 题目大意：判断一棵树是否对称
    * 解法：利用递归的方法，左右两颗子树互相印证即可
    * @param root
    * @return
    */
  def isSymmetric(root: TreeNode): Boolean = {
    if (root == null || root.right == null && root.left == null)
      return true
    if (root.right != null && root.left != null)
      check(root.left,root.right)
    else
      false
  }

  def check(tree1 : TreeNode, tree2 : TreeNode) : Boolean = {
    if (tree1 == null && tree2 == null)
      return true
    if (tree1 != null && tree2 == null || tree1 == null && tree2 != null)
      return false
    if (tree1.value == tree2.value)
      check(tree1.left, tree2.right) && check(tree1.right, tree2.left)
    else
      false
  }
}
