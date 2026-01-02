package dailypractice.LeetCode.year25.october.week2;

import java.util.ArrayList;
import java.util.List;

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

public class AllElementBinaryTree {
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> and = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        inOrderTravel(root1, l1);
        inOrderTravel(root2,l2);
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()){
            if (l1.get(i) < l2.get(j)){
                and.add(l1.get(i++));
            }
            else {
                and.add(l2.get(j++));
            }
        }
        while ( i < l1.size()){
            and.add(l1.get(i++));
        }
        while (j < l2.size()){
            and.add(l2.get(j++));
        }

        return and;
    }

    public static void inOrderTravel(TreeNode r, ArrayList<Integer> list){
        if (r == null){
            return;
        }
        inOrderTravel(r.left, list);
        list.add(r.val);
        inOrderTravel(r.right, list);

    }

    public static void main(String[] args) {
        TreeNode r1 = new TreeNode(2, new TreeNode(1), new TreeNode(4));
        TreeNode r2 = new TreeNode(1, new TreeNode(0), new TreeNode(3));
        System.out.println(getAllElements(r1,r2));
    }
}
