object BinaryTreeLevelOrderTraversalII {
  /**
    * 题目大意：要求倒序 层次序输出二叉树  每层都存放在一个 List 中，所有的 list 集中成一个 二维list
    * 解法： 层次序遍历很简单，怎么切，怎么存是一个问题。scala 语法有点难
    */
  var ansList : List[List[Int]] = List()
  var nList : List[Int] = List()
  def src.java.main(args: Array[String]): Unit = {
    var node1 = new TreeNode(2)
    var node2 = new TreeNode(1)
    var node3 = new TreeNode(3)
    node1.left = node2
    node1.right = node3
    nList = node1.value :: nList
    order(node1)
    for (i <- ansList)
      println(i)
  }
  def levelOrderBottom(root: TreeNode): List[List[Int]] = {

    List()
  }

  def levelMaker(list: List[List[Int]], root: TreeNode , level : Int) :Unit = {
    if (root == null)
      return
    if (level >= list.size)
      return
  }

  /**
    * 二叉树的层次序遍历：从上到下
    * @param root
    */
  def order(root : TreeNode)  {
    if (root.left != null) {
      nList = root.left.value :: nList
      println(nList)
    }
    if (root.right != null) {
      nList = root.right.value :: nList
      println(nList)

    }
    if (root.left != null)
      order(root.left)
    if (root.right != null)
      order(root.right)
    ansList = nList :: ansList
  }
}
