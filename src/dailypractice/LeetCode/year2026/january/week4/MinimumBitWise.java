package dailypractice.LeetCode.year2026.january.week4;

import java.util.Arrays;
import java.util.List;

public class MinimumBitWise {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        Arrays.fill(ans,-1);
        for (int i =0; i< nums.size(); i++){
            int tar = nums.get(i);
            for (int j = 0; j <= tar; j++){
                int n = j | (j+1);
                if (n == nums.get(i)){
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
