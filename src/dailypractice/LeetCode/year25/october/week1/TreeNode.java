package dailypractice.LeetCode.year25.october.week1;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class CompleteTrees {
    int inorder(TreeNode t){
        if( t == null)
            return 0;
        return 1 + inorder(t.left) + inorder(t.right);
    }
    public int countNodes(TreeNode r) {
        int ans = 0;
        ans += inorder(r);
        return ans;
    }

}
