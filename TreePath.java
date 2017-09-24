import java.util.ArrayList;
import java.util.List;

public class TreePath {
    public static void main(final String[] args) {
//        String a = "->";
//        a += 5;
//        System.out.println(a);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        // write your code here
        ArrayList<String> result = new ArrayList<>();
        if (root == null)
            return result;
        findPath(result, root, "");
        return result;
    }

    public void findPath(ArrayList<String> result, TreeNode root, String ans) {
        String oth = "";
        if (ans.equals(""))
            ans += root.val;
        else
            oth += "->" + root.val;

        if (root.left != null)
            findPath(result, root.left, ans + oth);
        if (root.right != null)
            findPath(result, root.right, ans + oth);

        if (root.left == null && root.right == null)
            result.add(ans + oth);
    }
}
