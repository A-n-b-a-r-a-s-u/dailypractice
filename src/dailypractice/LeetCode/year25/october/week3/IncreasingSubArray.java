package dailypractice.LeetCode.year25.october.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IncreasingSubArray {

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int inc = 1, prevInc = 0, maxLen = 0;
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) inc++;
            else {
                prevInc = inc;
                inc = 1;
            }
            maxLen = Math.max(maxLen, Math.max(inc >> 1, Math.min(prevInc, inc)));
            if (maxLen >= k) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<>(Arrays.asList(2,5,7,8,9,2,3,4,3,1));
        System.out.println(hasIncreasingSubarrays(lt, 3));
    }
}
