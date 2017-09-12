public class CloneRandom {
    public static void main(final String[] args) {

    }
    public static RandomListNode clone(RandomListNode pHead) {
        if (pHead == null)
            return null;
        RandomListNode pre = pHead;

        while (pHead != null) {
            RandomListNode node1 = new RandomListNode(pHead.label);
            node1.next = pHead.next;
            node1.random = null;
            pHead.next = node1;
            pHead = node1.next;
        }

//        pre = pre.next;
        pHead = pre;
        RandomListNode node = null;
        while (pHead != null) {

            node = pHead.next;
            if (pHead.random != null)
                node.random = pHead.random.next;
            pHead = node.next;
        }
        pre = pre.next;
        pHead = pre;

        while (pHead != null) {
            pHead.next = pHead.next.next;
            pHead = pHead.next;
        }
        return pre;
    }

    /*public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null)
            return null;
        RandomListNode pNode = pHead;



        while (pNode != null) {
            RandomListNode clone = new RandomListNode(pNode.label);
            clone.next = pNode.next;
            clone.random = null;

            pNode.next = clone;
            pNode = clone.next;


        }

        pNode = pHead;

        while (pNode != null) {
            RandomListNode clone = pNode.next;
            if (pNode.random != null) {
                clone.random = pNode.random.next;
            }
            pNode = clone.next;
        }

        pNode = pHead;

        RandomListNode cloneNode = null;
        RandomListNode cloneHead = null;

        if (pNode != null) {
            cloneHead = cloneNode = pNode.next;
            pNode.next = cloneNode.next;
            pNode = pNode.next;
        }

        while (pNode != null) {
            cloneNode.next = pNode.next;
            cloneNode = cloneNode.next;

            pNode.next = cloneNode.next;
            pNode = pNode.next;
        }


        return cloneHead;
    }*/
}
