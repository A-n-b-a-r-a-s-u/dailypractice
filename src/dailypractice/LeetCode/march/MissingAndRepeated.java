package dailypractice.LeetCode.march;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingAndRepeated {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int size = n * n;
        int actualSum =0;
        int sum = size * (size+1)/2;
        for (int i =0; i< n; i++ ){
            for (int j =0; j< n; j++){
                int val = grid[i][j];
                actualSum += val;
                if (!set.add(val)){
                    ans[0] = val;
                }
            }
        }

        ans[1] = sum - (actualSum - ans[0]);
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3},{2,2}};
        int[] a = findMissingAndRepeatedValues(grid);
        for(int t : a){
            System.out.print(t + " ");
        }


    }
}


/*
int[] ans = new int[2];
        ArrayList<Integer> merge = new ArrayList<>();
        int size = grid.length * grid.length;

        for (int i =1; i <= size; i++) {
            merge.add(i);
        }
        for (int j = 0; j<= grid.length ; j++) {
            for (int k = 0; k< grid.length; k++) {
                if (merge.contains(grid[j][k])){
                    merge.remove(grid[j][k]);
                }
                else {
                    ans[0] = grid[j][k];
                }
            }
        }

        ans[1] = merge.get(0);

        return ans;
 */