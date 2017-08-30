object SwapNodesinPairs {
  def main(args: Array[String]): Unit = {
    var node1 = new ListNode(1)
    var node2 = new ListNode(2)
    var node3 = new ListNode(3)
    var node4 = new ListNode(4)
    val node5 = new ListNode(5)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    var node = swapPairs(node1)

    while (node != null) {
      println(node.x)
      node = node.next
    }
  }

  /**
    * 题目大意：链表中节点两两互换，不能简单修改节点的值
    * 解法：递归，用中间节点辅助，把剩下来的链表当做是新的链表就可以
    * @param head
    * @return
    */
  def swapPairs(head: ListNode): ListNode = {
      changeNode(head)
  }
  def changeNode(head : ListNode): ListNode = {
    if (head == null)
      return null
    if (head.next == null)
      return head
    var node = head.next
    if (node.next == null) {
      node.next = head
      head.next = null
    } else {
      var node2 = node.next
      head.next = node2
      node.next = head
      head.next = changeNode(node2)
    }
    node
  }
}
