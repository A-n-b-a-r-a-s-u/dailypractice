package dailypractice.LeetCode.year25.august.week2;

import java.util.Stack;

public class NextGreatest {
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> stk = new Stack<>();

        for (int i =0; i< nums.length; i++){
            while (!stk.isEmpty() && nums[i] > nums[stk.peek()]){
                ans[stk.pop()] = nums[i];
            }
            stk.push(i);
        }

        while (!stk.isEmpty()){
            for (int i = 0; i< nums.length; i++){
                if (i == nums.length-1 && nums[stk.peek()] >= nums[i]){
                    ans[stk.pop()] = -1;
                }
                if (!stk.isEmpty() && nums[i] > nums[stk.peek()]){
                    ans[stk.pop()] = nums[i];
                    break;
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1,2,1};
        int[] res = nextGreaterElements(n);

        System.out.println();
        for (int r: res){
            System.out.print(r + " ");
        }
        System.out.println();
    }
}
