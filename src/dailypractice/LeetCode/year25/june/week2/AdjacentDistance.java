package dailypractice.LeetCode.year25.june.week2;

public class AdjacentDistance {
    public static int maxAdjacentDistance(int[] nums) {
        int ans = Math.abs(nums[0] - nums[nums.length-1]);
        for (int i = 0; i < nums.length-1; i++ ){
            int cur = Math.abs(nums[i] - nums[i+1]);
            ans =  Math.max(ans, cur);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {3,2,-5,-3};
        System.out.println(maxAdjacentDistance(n));
    }
}
