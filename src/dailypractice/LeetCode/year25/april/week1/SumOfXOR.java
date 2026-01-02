package dailypractice.LeetCode.year25.april.week1;

public class SumOfXOR {
    public static int subsetXORSum(int[] nums) {
        int ans =0;
        int j = 1 ;
        for (int num : nums){
            ans ^= num;
        }
        for(int i =0; i< nums.length; i++) {
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {3,4,5,6,7,8};
        System.out.println(subsetXORSum(n));
    }
}

/*
public static int subsetXORSum(int[] nums) {
        int ans =0;
        int j = 1 ;
        for (int num : nums){
            ans ^= num;
        }
        for (int i =0; i< nums.length; i++) {
            ans += nums[i];
            while (j < nums.length-1){
                ans += nums[i] ^ nums[j];
                j++;
            }
            ans += nums[i] ^ nums[j];
        }
        return ans;
    }

 */