package dailypractice.LeetCode.august.week4;

public class ZeroFilled {
    public static long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int count = 0;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == 0){
                count++;
                ans+= count;
            }
            else {
                count = 0;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] n = {0,0,0,2,0,0};
        System.out.println(zeroFilledSubarray(n));
    }
}
