package dailypractice.LeetCode.april.week1;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int[] newArray = Arrays.copyOf(nums, nums.length);
        int start =0;
        int len = Math.max(nums.length, k);
        for (int i =0; i< len; i++){
            if (k >0){
                nums[i % nums.length] = newArray[Math.abs(newArray.length - k) % nums.length];
                k--;
            }
            else {
                nums[i % nums.length] = newArray[start];
                start++;
            }
        }
    }

    public static void main(String[] args) {
        int[] n = {1,2, 3};
        rotate(n, 4);
        for (int j : n) {
            System.out.print(j + " ");
        }

    }
}
