import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (pRoot == null)
            return ans;

        LinkedList<TreeNode> temp = new LinkedList<>();
        temp.addLast(pRoot);
        while (temp != null) {
            int n = 0;
            int h = temp.size();
            ArrayList<Integer> list = new ArrayList<>();
            while (n < h) {
                TreeNode node = temp.getFirst();
                temp.pop();
                list.add(node.val);
                if (node.left != null)
                    temp.add(node.left);
                if (node.right != null)
                    temp.add(node.right);
                n++;
            }
            ans.add(list);
        }
        return ans;
    }
}
