/**
 * Created by Administrator on 2017/7/10 0010.
 */
public class MergeTwoLists {
    public static void main(final String[] args) {
        ListNode pHead1 = new ListNode(1);
        ListNode pHead2 = new ListNode(2);
        ListNode pHead3 = new ListNode(3);
        ListNode pHead4 = new ListNode(4);
        ListNode pHead5 = new ListNode(5);
        ListNode pHead6 = new ListNode(6);

        pHead1.next = pHead3;
        pHead3.next = pHead5;


        pHead2.next = pHead4;
        pHead4.next = pHead6;

        ListNode node = mergo(pHead1, pHead2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static ListNode  mergo(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergo(l1.next, l2);
            return l1;
        } else {
            l2.next = mergo(l1, l2.next);
            return l2;
        }
    }
    public static ListNode mergoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode temp = null;

        if (node1.next == null && node2.next == null) {
            if (node1.val <= node2.val) {
                node1.next = node2;
                return node1;
            } else {
                node2.next = node1;
                return node2;
            }
        }
//        System.out.println("aaaaa");
        while (node1.next != null && node2.next != null) {
            if (node1.val <= node2.val) {
                temp = node1.next;
                node1.next = node2;
                node1 = temp;
            } else {
                temp = node2.next;
                node2.next = node1;
                node2 = temp;
            }
        }
//        System.out.println("bbbbb");
        if (node1.next == null) {
            while (node2.next != null) {
                if (node1.val  > node2.val && node1.val <= node2.next.val) {
                    node1.next = node2.next;
                    node2.next = node1;
                    break;
                }
                node2 = node2.next;
            }
        }
//        System.out.println("ccccc");
        if (node2.next == null) {
            while (node1.next != null) {
                if (node2.val > node1.val && node2.val <= node1.next.val) {
                    node2.next = node1.next;
                    node1.next = node2;
                    break;
                }
                node1 = node1.next;
            }
        }
//        System.out.println("ddddd");
        return l1.val >= l2.val ? l2 : l1;
    }
}
