public class ConvertTreeNode {
    TreeNode leftNode = null;
    TreeNode rightNode = null;
    public  TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        convert(pRootOfTree.left);
        if (leftNode == null) {
            leftNode = rightNode = pRootOfTree;
        } else {
            rightNode.right = pRootOfTree;
            pRootOfTree.left = rightNode;
            rightNode = pRootOfTree;
        }
        convert(pRootOfTree.right);

        return leftNode;

    }
}
