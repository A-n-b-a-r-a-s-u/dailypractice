package dailypractice.LeetCode.year25.april.week5;

public class CountOfSubArray {
    public static int countSubarrays(int[] nums) {
        int count =0;
        for (int i =0; i< nums.length-2; i++){
            if (nums[i] + nums[i+2] == ((float)nums[i+1]/2)){
                System.out.println(nums[i+1]/2);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] n ={-1,-4,-1,4};
        System.out.println(countSubarrays(n));
    }
}
