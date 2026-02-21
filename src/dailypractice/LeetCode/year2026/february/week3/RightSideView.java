package dailypractice.LeetCode.year2026.february.week3;

import java.util.*;

class TreeNode {
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

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<TreeNode> tree = new ArrayList<>();
        if(root == null)
            return ans;
        tree.add(root);
        ans.add(root.val);
        dfs(tree, ans);
        return ans;
    }

    public void bfs(TreeNode root, ArrayList<TreeNode> nodes){
        if (root.left != null)
            nodes.add(root.left);
        if (root.right != null)
            nodes.add(root.right);
    }

    public void dfs(ArrayList<TreeNode> root, List<Integer> ans){
        if (root.isEmpty()){
            return;
        }
        ArrayList<TreeNode> newNode = new ArrayList<>();
        for (TreeNode t : root){
            bfs(t, newNode);
        }

        TreeNode last = newNode.getLast();
        ans.add(last.val);
        dfs(newNode, ans);

    }

    public static void main(String[] args) {

    }
}
