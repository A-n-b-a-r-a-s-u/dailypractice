package dailypractice.LeetCode.year25.april.week3;

import java.util.Arrays;

public class FairPairs {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        long count =0;
        long current;
        Arrays.sort(nums);
        
        for (int i =0; i< nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                current = nums[i] + nums[j];
                if (current > upper || current < lower)
                    break;
                if (current <= upper && current >= lower){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] n = {1,7,9,2,5};
        System.out.println(countFairPairs(n,11,11));
    }
}
