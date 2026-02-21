package dailypractice.LeetCode.year2026.february.week3;

import java.util.ArrayList;


public class DepthOfTree {
    public int maxDepth(TreeNode root) {
        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);

        return dfs(nodes);
    }

    public int dfs(ArrayList<TreeNode> nodes){
        if (nodes.isEmpty())
            return 0;
        ArrayList<TreeNode> newNodes = new ArrayList<>();
        for (TreeNode node: nodes){
            bfs(node, newNodes);
        }
        return 1+ dfs(newNodes);
    }

    public void bfs(TreeNode root, ArrayList<TreeNode> nodes){
        if (root.left != null){
            nodes.add(root.left);
        }
        if (root.right != null){
            nodes.add(root.right);
        }
    }

    public static void main(String[] args) {

    }
}
