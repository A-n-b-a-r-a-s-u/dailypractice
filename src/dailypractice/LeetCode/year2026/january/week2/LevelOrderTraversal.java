package dailypractice.LeetCode.year2026.january.week2;

import java.util.*;

public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> curQueue = new LinkedList<>();
        Queue<TreeNode> preQueue = new LinkedList<>();
        curQueue.add(root);
        if (root == null)
            return ans;
        ans.add(Collections.singletonList(root.val));
        while (!curQueue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            while (!curQueue.isEmpty()){
                TreeNode cur = curQueue.poll();
                if (cur.left != null){
                    preQueue.add(cur.left);
                    list.add(cur.left.val);
                }
                if (cur.right != null){
                    preQueue.add(cur.right);
                    list.add(cur.right.val);
                }
            }
            curQueue = preQueue;
            preQueue = new LinkedList<>();
            if (!list.isEmpty())
                ans.add(list);
        }
        return ans;
    }

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null)
            return null;
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[]  rootArr = {};
        TreeNode root = buildTree(rootArr);

        List<List<Integer>> a =  levelOrder(root);
        System.out.println(a);

    }
}
