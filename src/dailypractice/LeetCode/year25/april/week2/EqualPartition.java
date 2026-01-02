package dailypractice.LeetCode.year25.april.week2;

public class EqualPartition {
    public static boolean canPartition(int[] nums) {
        int sum =0;
        for (int j : nums) {
            sum += j;
        }
        if (sum % 2 != 0){
            return false;
        }
        int target = sum /2;
        boolean[] ans = new boolean[target+1];
        ans[0] =true;
        for (int num: nums){
            for (int curr = target; curr >= num; curr--){
                ans[curr] = ans[curr] || ans[curr - num];
                if (ans[target]){
                    return true;
                }
            }
        }
        return ans[target];
    }

    public static void main(String[] args) {
        int[] n ={1,1,1,1,1,1};
        System.out.println(canPartition(n));

    }
}


/*
public static boolean canPartition(int[] nums) {
        boolean ans = false;
        Arrays.sort(nums);
        int start =0;
        int required = nums[nums.length-1];
        for (int i =0; i< nums.length-1; i++){
            if (required == sumOfArray(Arrays.copyOfRange(nums,i, nums.length-1))){
                return true;
            }
            required += nums[start];
            start++;
        }
        return ans;
    }

    public static int sumOfArray(int[] arr){
        int sum =0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
 */