package dailypractice.LeetCode.year25.june.week5;

import java.util.Arrays;
import java.util.Comparator;

public class SubSequence {
    public static int[] maxSubsequence(int[] nums, int k) {
        int[][] indexValue = new int[nums.length][2];
        int[] ans = new int[k];

        for (int i =0; i< nums.length; i++){
            indexValue[i][0] = nums[i];
            indexValue[i][1] = i;
        }
        Arrays.sort(indexValue, (a,b) -> b[0] - a[0]);
        Arrays.sort(indexValue, 0 , k, Comparator.comparingInt(a -> a[1]));

        for (int i = 0; i< k; i++){
           ans[i] =  indexValue[i][0];
        }

        for (int n: ans){
            System.out.print(n + " ");
        }
        System.out.println();
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {2,1,3,3};
        maxSubsequence(n, 2);
    }
}
