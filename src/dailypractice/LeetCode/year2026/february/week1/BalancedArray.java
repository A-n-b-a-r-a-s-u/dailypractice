package dailypractice.LeetCode.year2026.february.week1;

import java.util.Arrays;

public class BalancedArray {
    public static int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int maxLen = 1;
        for (int i = 0; i < nums.length; i++){
            while ((long)nums[i]  > (long)nums[start] * k){
                start++;
            }
            maxLen = Math.max(maxLen, (i - start + 1));
        }

        return nums.length - maxLen;
    }
    public static void main(String[] args) {
        int[] n ={1,6,2,9};
        System.out.println(minRemoval(n,3));
    }
}
