package dailypractice.LeetCode.year2026.january.week2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

public class LevelWiseSum {
    public static int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1;
        int curLevel = 1;
        int total = Integer.MIN_VALUE;
        queue.add(root);

        ArrayList<Integer> countList = new ArrayList<>();
        while (!queue.isEmpty()){
            int size = queue.size();

            int curTotal = 0;
            for (int i = 0; i< size; i++){
                TreeNode cur = queue.poll();
                curTotal += cur.val;

                if (cur.left != null)
                    queue.add(cur.left);
                if (cur.right != null)
                    queue.add(cur.right);
            }
            if (curTotal > total){
                total = curTotal;
                level = curLevel;
            }
            countList.add(curTotal);
            curLevel++;
        }

        System.out.println(countList);
        return level;
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
        Integer[]  rootArr = {-100,-200,-300,-20,-5,-10,null};
        TreeNode root = buildTree(rootArr);
        System.out.println(maxLevelSum(root));
    }
}
