package dailypractice.LeetCode.year25.may.week1;

public class ArrayPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i =0; i< nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {0,2,1,5,3,4};
        int[] a = buildArray(n);
        for (int s: a){
            System.out.print(s + " ");
        }


    }
}
