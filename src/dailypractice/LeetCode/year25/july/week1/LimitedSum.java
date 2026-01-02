package dailypractice.LeetCode.year25.july.week1;

import java.util.Arrays;

public class LimitedSum {
    public static int[] answerQueries(int[] nums, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(nums);
        int index = 0;
        for (int target: queries){
            int count =0;
            int sum = 0;
            for (int i =0; i< nums.length; i++){
                sum += nums[i];
                count++;
                if (target <= sum){
                    ans[index++] = target == sum ? count: --count;
                    break;
                } else if (i == nums.length-1) {
                    ans[index++] = count;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {624082};
        int[] q = {972985,564269,607119,693641,787608,46517,500857,140097};
        int[] an = answerQueries(n,q);
        for (int a: an){
            System.out.print(a + " ");
        }
    }
}
