package dailypractice.LeetCode.year25.april.week1;

public class OrderTripletTwo {
    public static long maximumTripletValue(int[] nums) {
        long ans =0;
        int maxDiff =0, k;
        int prefixElement = nums[0];
        for (int j=1; j< nums.length-1; j++) {
            maxDiff = Math.max(maxDiff, prefixElement - nums[j]);
            prefixElement = Math.max(prefixElement, nums[j]);
            k = j+1;
            ans = Math.max(ans, (long)maxDiff * nums[k]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1,2,3};
        System.out.println(maximumTripletValue(n));

    }
}
