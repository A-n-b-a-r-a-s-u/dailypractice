package dailypractice.LeetCode.year25.august.week5;

import java.util.ArrayList;

public class LongestSubArrayOf1 {

    public static int longestSubarray(int[] nums) {
        int ans = 0;
        ArrayList<Integer> oneCount = new ArrayList<>();
        int count = 0;
        for (int num : nums) {
            if (num == 1) count++;
            else {
                oneCount.add(count);
                count = 0;
            }
        }
        oneCount.add(count);
        int cur ;
        for (int i =0; i< oneCount.size()-1; i++){
            cur = oneCount.get(i) + oneCount.get(i+1);
            ans = Math.max(ans, cur);
        }
        if (oneCount.size() == 1)
            return oneCount.getFirst()-1;

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1,1,1};
        System.out.println(longestSubarray(n));
    }
}

/*
public int longestSubarray(int[] nums) {
        int ans = 0;
        int count = 0;
        boolean foundZero = false;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == 1){
                count++;
            }
            else if (foundZero && nums[i] == 0){
                ans = Math.max(ans, count);
                count = 0;
                foundZero = false;
            }
            else {
                foundZero = true;
            }
        }

        return ans;
    }
 */