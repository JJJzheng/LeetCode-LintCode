object SameTree {
  def src.java.main(args: Array[String]): Unit = {

  }

  /**
    * 题目大意：判断两颗树是否相等
    * 解法： 使用递归 把左右子树看成是新的二叉树
    * @param p
    * @param q
    * @return
    */
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null)
      return true
    if (p == null && q != null || p != null && q == null)
      return false
    if (p.value == q.value) {
      isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
    else  false
  }
}
