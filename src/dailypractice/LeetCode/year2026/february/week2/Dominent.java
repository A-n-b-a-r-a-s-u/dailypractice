package dailypractice.LeetCode.year2026.february.week2;

public class Dominent {
    public static int dominantIndices(int[] nums) {
        int ans =0;
        int total =0;
        for (int num: nums){
            total += num;
        }
        int len = nums.length;
        for (int i=0; i< nums.length-1; i++) {
            len--;
            total -= nums[i];
            if (total / len < nums[i])
                ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {4,1,2};
        System.out.println(dominantIndices(n));
    }
}
