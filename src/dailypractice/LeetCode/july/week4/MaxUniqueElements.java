package dailypractice.LeetCode.july.week4;

import java.util.HashSet;

public class MaxUniqueElements {
    public static int maxSum(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MIN_VALUE;
        for (int n : nums){
            if (n > 0 && !(set.contains(n))){
                set.add(n);
                ans += n;
            }
            min = Math.max(min, n);
        }
        System.out.println(ans);
        return ans == 0 ? min: ans;
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        System.out.println(maxSum(n));
    }
}
