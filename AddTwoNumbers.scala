object AddTwoNumbers {
  def main(args: Array[String]): Unit = {
    val l1 = new ListNode(2)
    val l2 = new ListNode(4)
    val l3 = new ListNode(3)
    l1.next = l2
    l2.next = l3

    val l4 = new ListNode(5)
    val l5 = new ListNode(6)
    val l6 = new ListNode(4)

    l4.next = l5
    l5.next = l6

    var node = addTwoNumbers(l1, l4)
//    node = l2
//    while (node != null) {
//      println(node.x)
//      node = node.next
//    }
  }

  /**
    * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    * Output: 7 -> 0 -> 8
    * 链表倒序输出 求和
    * @param l1
    * @param l2
    * @return
    */
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var node1 = l1
    var node2 = l2
    var prev = new ListNode(0)
    var head = prev
    var carry = 0
    while (node1 != null || node2 != null || carry != 0){
      var cur = new ListNode(0)
      var sum = 0
      if (node2 != null)
        sum += node2.x
      if (node1 != null)
        sum += node1.x
      sum += carry
      cur.x = sum % 10
      carry = sum / 10
      prev.next = cur
      prev = cur
      println(prev.x)
      if (node1 != null)
        node1 = node1.next
      if (node2 != null)
        node2 = node2.next
    }
    head.next
  }
}
