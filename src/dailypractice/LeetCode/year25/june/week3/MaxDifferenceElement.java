package dailypractice.LeetCode.year25.june.week3;

public class MaxDifferenceElement {
    public static int maximumDifference(int[] nums) {
        int ans = -1, i =0;
        for (int j =1; j< nums.length; j++){
            if (i < j && nums[j] > nums[i]){
                int cur = nums[j] - nums[i];
                ans = Math.max(ans, cur);
            }
            else {
                i = j;
            }
        }
        if (ans == 0) return -1;
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {7,1,5,4};
        System.out.println(maximumDifference(n));
    }
}
