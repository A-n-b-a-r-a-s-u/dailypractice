package dailypractice.LeetCode.year25.october.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Node{
    int val;
    Node left;
    Node right;
    Node(int v){
        val = v;
    }
    Node(Node root, Node l, Node r){
        root.left = l;
        root.right = r;
    }
}

public class InterviewProb {

    public int interview(int[][] matrix, int[] array, int n, int m){
        int ans = 0;
        HashMap<Integer, Node> nodeList = new HashMap<>();
        for (int i = 0; i< n; i++){
            Node nod = new Node(i);
            nodeList.put(i, nod);
        }

        HashMap<Integer, ArrayList<Integer>> parentChildList = new HashMap<>();

        for (int[] mat : matrix){
            if (parentChildList.containsKey(mat[0])){
                ArrayList<Integer> temp = parentChildList.get(mat[0]);
                temp.add(mat[1]);
            }
            else {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(mat[1]);
                Collections.sort(tempList);
                parentChildList.put(mat[0], tempList);
            }
        }

        for (int parent: parentChildList.keySet()){
            ArrayList<Integer> children = parentChildList.get(parent);
            if (children.size() > 1){
                Node rootN = nodeList.get(parent);
                Node leftN = nodeList.get(children.get(0));
                Node rightN = nodeList.get(children.get(1));
                new Node(rootN, leftN, rightN);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        Node root = nodeList.get(0);
        inOrder(root, result);
        System.out.println(result);
        int index = result.get(m-1);
        System.out.println(index);
        ans = array[index];

        return ans;
    }

    public void inOrder(Node root, ArrayList<Integer> res){
        if (root == null)
            return;
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }

    public static void main(String[] args) {
        int[][] mat = { {0,1}, {0,2}, {1, 3}, {1, 4}, {2, 5}, {2,6} };
        int[] arr = {10, 20, 15, 25, 30, 18, 22};
        InterviewProb ip = new InterviewProb();
        System.out.println(ip.interview(mat, arr, 7, 3));
    }
}
