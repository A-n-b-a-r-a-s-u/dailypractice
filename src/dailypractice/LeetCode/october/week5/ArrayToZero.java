package dailypractice.LeetCode.october.week5;

public class ArrayToZero {
    public static int countValidSelections(int[] nums) {
        int ans =0;

        for (int i =0; i< nums.length; i++){
            if (nums[i] == 0){
                int left = 0, right = 0;
                for (int j = i-1;j >= 0; j--){
                    left += nums[j];
                }
                for (int k = i+1;k < nums.length; k++){
                    right += nums[k];
                }
                if (left == right)
                    ans += 2;
                else if (left == right-1 || left-1 == right) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {16,13,10,0,0,0,10,6,7,8,7};
        System.out.println(countValidSelections(n));
    }
}
