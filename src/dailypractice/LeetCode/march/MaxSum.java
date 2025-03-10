package dailypractice.LeetCode.march;

import java.util.Arrays;

public class MaxSum {
    public static int maxAbsoluteSum(int[] nums) {
        int ans = 0;
        int max = nums[0];
        int min = nums[0];
        int overallMax = nums[0];
        int overalMin = nums[0];
        for (int i=1; i< nums.length; i++) {
            max = Math.max(nums[i], max + nums[i]);
            min = Math.min(nums[i], min + nums[i]);
            overallMax = Math.max(overallMax, max);
            overalMin = Math.min(overalMin, min);
        }
        ans = Math.max(Math.abs(overallMax), Math.abs(overalMin));

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,-5,1,-4,3,-2};

        System.out.println(maxAbsoluteSum(nums));

    }
}
