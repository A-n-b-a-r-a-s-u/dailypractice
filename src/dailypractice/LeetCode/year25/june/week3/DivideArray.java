package dailypractice.LeetCode.year25.june.week3;

import java.util.Arrays;

public class DivideArray {
    public static int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        Arrays.sort(nums);
        int index = 0;
        for (int i =0; i< n/3; i++){
            for (int j = 0; j< 3; j++){
                ans[i][j] = nums[index++];
            }
            if (ans[i][2] - ans[i][0] > k){
                return new int[0][0];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {2,4,2,2,5,2};
        divideArray(n,2);
    }
}
