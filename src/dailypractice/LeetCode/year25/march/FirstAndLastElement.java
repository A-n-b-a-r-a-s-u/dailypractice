package dailypractice.LeetCode.year25.march;

public class FirstAndLastElement {
    public static int[] searchRange(int[] nums, int target) {
        boolean flag = true;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for (int i=0;i< nums.length; i++) {
            if (flag && nums[i] == target){
                result[0] = i;
                flag = false;
            }
            if (nums[i] == target){
                result[1] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] l = {5,7,7,8,8,10};
        int t= 8;
        int[] ans = searchRange(l,t);
        System.out.println(ans[0]);
        System.out.println(ans[1]);


    }
}
