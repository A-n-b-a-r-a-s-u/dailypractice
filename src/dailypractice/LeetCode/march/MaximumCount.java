package dailypractice.LeetCode.march;

public class MaximumCount {
    public static int maximumCount(int[] nums) {
        int pos =0, neg = 0;
        for (int i =0; i< nums.length; i++){
            if (nums[i] > 0) pos++;
            if (nums[i] < 0) neg++;
        }

        return Math.max(pos, neg);
    }

    public static void main(String[] args) {
        int[] a = {5,20,66,1314};
        System.out.println(maximumCount(a));

    }
}
