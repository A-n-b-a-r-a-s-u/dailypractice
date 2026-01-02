package dailypractice.LeetCode.year25.july.week5;

public class BitWiseAND {
    public static int longestSubarray(int[] nums) {
        int ans = 0;
        int max = 0;
        for (int n: nums){
            max = Math.max(max, n);
        }

        int count = 0;
        for (int num: nums){
            if (num == max){
                count++;
            }
            else {
                count = 0;
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4};

        System.out.println(longestSubarray(n));
    }
}
