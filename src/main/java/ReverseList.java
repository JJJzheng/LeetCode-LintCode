public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode pre = null;
        ListNode node = null;

        while (head != null) {

            node = head.next;
            head.next = pre;
            pre = head;

            head = node;
        }

        return pre;
    }
}
