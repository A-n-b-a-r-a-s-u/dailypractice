package dailypractice.LeetCode.year25.april.week4;

import java.util.HashSet;
import java.util.Set;

public class CountCompleteSubArray {
    public int countCompleteSubarrays(int[] nums) {
        int count =0;
        HashSet<Integer> unique = new HashSet<>();
        for (int i: nums){
            unique.add(i);
        }
        int windowSize = unique.size();
        for (int i =0; i<= nums.length ; i++){
            Set<Integer> current = new HashSet<>();
            for (int j = i; j< nums.length; j++){
                current.add(nums[j]);
                if (current.size() == windowSize){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        CountCompleteSubArray c = new CountCompleteSubArray();
        int[] n ={1,3,1,2,2};
        System.out.println(c.countCompleteSubarrays(n));

    }
}
