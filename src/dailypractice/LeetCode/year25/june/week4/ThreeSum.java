package dailypractice.LeetCode.year25.june.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i =0; i< nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i +1;
            int k = nums.length-1;
            while (j<k){
                int total = nums[i] + nums[j] + nums[k];
                if (total < 0){
                    j++;
                } else if (total > 0) {
                    k--;
                }
                else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j< k){
                        j++;
                    }
                }
            }
        }

        for (List<Integer>n : ans){
            System.out.println(n);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {-1,0,1,2,-1,-4};
        threeSum(n);
    }
}
