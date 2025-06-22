package dailypractice.LeetCode.june.week3;

import java.util.Arrays;

public class ParitionArray {
    public static int partitionArray(int[] nums, int k) {
        int ans = 0;
        int start = 0;
        if (nums.length == 1){
            return 1;
        }
        Arrays.sort(nums);
        for (int i = 1; i< nums.length ; i++){
            if ( nums[i] - nums[start] > k){
                ans++;
                start = i;
            }
        }
        ans++;
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {2,2,4,5};
        System.out.println(partitionArray(n, 0));
    }
}
