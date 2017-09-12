import java.util.ArrayList;


public class KthNode {
    ArrayList<TreeNode> list = new ArrayList<TreeNode>();
    public TreeNode getNode(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0)
            return null;
        getNode(pRoot, k);
        if (k > list.size())
            return null;
        return list.get(k - 1);
    }
    public  void getHelper(TreeNode pRoot, int k) {
        if (list.size() == k)
            return;
        if (pRoot.left != null)
            getHelper(pRoot.left, k);
        list.add(pRoot);
        if (pRoot.right != null)
            getHelper(pRoot.right, k);
    }
}
