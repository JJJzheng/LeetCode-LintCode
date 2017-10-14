
import java.util.Hashtable;
import java.util.Scanner;

public class LRUCache {
    class LRUNode {
        String key;
        String value;
        LRUNode pre;
        LRUNode next;
    }

    private Hashtable<String, LRUNode> cache = new Hashtable<>();
    private int count;
    private int capacity;
    private LRUNode head, end;

    private void addNode(LRUNode node) {
        node.pre = head;
        node.next = head.next;

        head.next.pre = node;
        head.next = node;
    }

    private void removeNode(LRUNode node) {
        LRUNode pre = node.pre;
        LRUNode next = node.next;

        pre.next = next;
        next.pre = pre;
    }

    private void moveToHead(LRUNode node) {
        this.removeNode(node);
        this.addNode(node);
    }

    private LRUNode popend() {
        LRUNode res = end.pre;
        this.removeNode(res);
        return res;
    }

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;

        head = new LRUNode();
        head.pre = null;

        end = new LRUNode();
        end.next = null;

        head.next = end;
        end.pre = head;
    }

    public String get(String key) {
        LRUNode node = cache.get(key);
        if (node == null)
            return null;

        this.moveToHead(node);

        return node.value;
    }

    public void put(String key, String value) {
        LRUNode node = cache.get(key);
        if (node == null) {
            LRUNode newNode = new LRUNode();
            newNode.key = key;
            newNode.value = value;

            this.cache.put(key, newNode);
            this.addNode(newNode);
            count++;
            if (count > capacity) {
                LRUNode end = this.popend();
                this.cache.remove(end.key);
                count--;
            }
        } else {
            node.value = value;
            this.moveToHead(node);
        }
    }
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int m = in.nextInt();
            int n = in.nextInt();

            LRUCache cache = new LRUCache(m);
            String type;
            String key;
            String value;
            for (int i = 0; i < n; i++) {
                type = in.next();
                key = in.next();
                if (type.equals("get"))
                    System.out.println(cache.get(key));
                else {
                    value = in.next();
                    cache.put(key, value);
                }
            }
        }
    }
}
