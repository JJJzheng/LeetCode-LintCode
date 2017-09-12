import kotlin.reflect.KAnnotatedElement;

/**
 * 大数相加 通过链表倒叙
 * Created by Administrator on 2017/7/6 0006.
 */
public class AddTwoNumbers {
    public static void main(final String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        /*ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);

        l2.next = l3;*/
        ListNode node = addNumbers(l1, l4);
//        System.out.println("asdddddddddddddddddddddddddddddd");
        while (node != null) {
            System.out.print(node.val+ " ");
            node = node.next;
        }
    }

    public static ListNode addNumbers(ListNode l1, ListNode l2) {
        return help(l1, l2, 0);
    }

    public static ListNode help(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null)
            return carry == 0 ? null : new ListNode(carry);
        if (l1 == null && l2 != null)
            l1 = new ListNode(0);
        if (l1 != null && l2 == null)
            l2 = new ListNode(0);

        int sum = l1.val + l2.val + carry;
        ListNode cur = new ListNode(sum % 10);
        cur.next = help(l1.next, l2.next, sum / 10);
        return cur;

    }

//  垃圾算法
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        int length = 0;
        int length2 = 0;
        ListNode node1 = l1;
        ListNode node2 = l2;

        while (node1 != null) {
            node1 = node1.next;
            length++;
        }
        while (node2 != null) {
            node2 = node2.next;
            length2++;
        }
        System.out.println(length + "  " + length2);

        ListNode curNode = new ListNode(l1.val);
        node2 = curNode;
        boolean reNext = false;
        for (int i = 0; i < (length > length2 ? length2 : length); i++) {
            node1 = new ListNode(0);
            int temp = l1.val + l2.val;
            if (reNext)
                temp++;
            System.out.println("temp = " + temp);
            if (temp >= 10) {
                reNext = true;
                node1.val = temp % 10;
            } else {
                reNext = false;
                node1.val = temp;
            }

            l1 = l1.next;
            l2 = l2.next;
            node2.next = node1;
            node2 = node2.next;
        }

        if (length == length2) {
            if (reNext) {
                node1 = new ListNode(1);
                node2.next = node1;
            }
            return curNode.next;
        }

        if (length > length2)
            node2.next = l1;
        else
            node2.next = l2;

        node2 = node2.next;
        while (node2 != null) {
            if (reNext) {
                node2.val++;
                reNext = false;
            }
            if (node2.val >= 10) {
                node2.val = 0;
                reNext = true;
            }
            node1 = node2;
            node2 = node2.next;
        }

        if (reNext) {
            node2 = node1;
            node1 = new ListNode(1);
            node2.next = node1;
        }
        return curNode.next;
    }
}
