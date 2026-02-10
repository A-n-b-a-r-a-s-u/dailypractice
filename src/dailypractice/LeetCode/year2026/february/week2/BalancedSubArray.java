package dailypractice.LeetCode.year2026.february.week2;

import java.util.HashMap;
import java.util.HashSet;

public class BalancedSubArray {
    public static int longestBalanced(int[] nums) {
        int ans = 0;
        HashSet<Integer> odd;
        HashSet<Integer> even;
        for (int i = 0; i< nums.length; i++){
            odd = new HashSet<>();
            even = new HashSet<>();
            int length = 0;
            for (int j = i; j < nums.length; j++){
                int num = nums[j];
                if(num % 2 == 0){
                    even.add(num);
                }
                else {
                    odd.add(num );
                }
                length++;
                if (even.size() == odd.size()){
                    ans = Math.max(ans, length);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nu = {2,5,4,3};

        System.out.println(longestBalanced(nu));
    }
}
