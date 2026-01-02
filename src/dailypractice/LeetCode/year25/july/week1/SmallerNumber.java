package dailypractice.LeetCode.year25.july.week1;


public class SmallerNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        for (int j =0; j< nums.length; j++){
            int cur =0;
            for (int i = 0; i< nums.length; i++){
                if (nums[i] < nums[j]) {
                    cur++;
                }
            }
            ans[j] = cur;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {8,1,2,2,3};
        int[] a = smallerNumbersThanCurrent(n);
        for (int b : a){
            System.out.print(b + " ");
        }
    }
}
