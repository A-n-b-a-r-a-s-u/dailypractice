package dailypractice.LeetCode.year2026.february.week1;

import java.util.Arrays;

public class TransformedArray {

    public static int[] constructTransformedArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i =0; i< nums.length; i++){
            int num = nums[i];
            if (num > 0){
                int move = (i + num) % nums.length;
                result[i] = nums[move];
            }
            else if (num < 0) {
                int move = (((i + num) % nums.length) + nums.length) % nums.length;
                System.out.println(move);
                result[i] = nums[move];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] n = {3,-2,1,1};
        int[] r = constructTransformedArray(n);
        System.out.println();
    }
}
