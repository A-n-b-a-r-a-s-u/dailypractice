package dailypractice.LeetCode.may.week4;

public class NiceArray {
    public static int numberOfSubarrays(int[] nums, int k) {
        int res =0, i =0, n = nums.length, count =0;

        // changed nums array to show only odd number with 1 and even to 0
        for (int m =0; m< n; m++){
            if (nums[m] %2 == 1){
                nums[m] = 1;
            }
            else nums[m] = 0;
        }

        for (int j : nums){
            if (j == 1){
                k--;
                count = 0;
            }
            while (k == 0){
                k += nums[i++];
                count++;
            }
            res += count;
        }
        return  res;
    }

    public static void main(String[] args) {
        int[] a = {2,2,2,1,2,2,1,2,1,2};
        System.out.println(numberOfSubarrays(a, 2));;
    }
}


/*
int res =0;
        for (int i =0; i< nums.length; i++){
            if (nums[i] % 2 == 0)
                nums[i] = 0;
            else{
                nums[i] = 1;
            }
        }
        for (int i =0; i < nums.length; i++){
            int curr =nums[i];
            if (curr == k){
                res++;
            }
            for (int j =i+1; j< nums.length; j++){
                curr += nums[j];
                if (curr == k){
                    res++;
                } else if (curr > k) {
                    break;
                }
            }
        }
        return res;
 */