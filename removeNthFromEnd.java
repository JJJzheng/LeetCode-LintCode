public class removeNthFromEnd {
    public static void main(final String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node.next = node2;
//        node2.next = node3;
//        node3.next = node4;
        node4.next = node5;


        node = remove(node, 2);
        while (node != null) {
            System.out.print(node.val + "  ");
            node = node.next;
        }
    }

    /*public static ListNode remove(ListNode head, int n) {
        ListNode pHead = null;
        if (head == null)
            return null;
        if (head.next == null && n == 1)
            return null;

        pHead = head;
        ListNode end = head;
        int length = 0;


        while (pHead.next != null) {

            length++;
            pHead = pHead.next;
            if (length > n) {
                end = end.next;
                length--;
            }
        }

    }*/

    /**
     * 题目大意：删除倒数第 n 个节点
     * @param head
     * @param n
     * @return
     */
    public static ListNode remove(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode left = start, right = start;
        left.next = head;

        for (int i = 0; i < n + 1; i++) {
            right = right.next;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return start.next;

    }
}
