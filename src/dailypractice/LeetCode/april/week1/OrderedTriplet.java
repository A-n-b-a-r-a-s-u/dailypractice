package dailypractice.LeetCode.april.week1;

public class OrderedTriplet {
    public static long maximumTripletValue(int[] nums) {
        long ans =0 ;
        int maxDiff =0, k ;
        int maxPrefix = nums[0];
        for (int j =1; j< nums.length-1; j++) {
            maxDiff = Math.max(maxDiff, maxPrefix - nums[j]);
            maxPrefix = Math.max(maxPrefix, nums[j]);
            k = j+1;
            ans = Math.max(ans, (long) maxDiff * nums[k]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] n ={1000000,1,1000000};
        System.out.println(maximumTripletValue(n));

    }
}
