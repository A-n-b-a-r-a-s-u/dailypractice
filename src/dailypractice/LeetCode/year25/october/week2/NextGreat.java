package dailypractice.LeetCode.year25.october.week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreat {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums2.length; i++){
            while(!stack.isEmpty() && nums2[stack.peek()] < nums2[i]){
                int index = stack.pop();
                map.put(nums2[index], nums2[i]);
            }
            stack.push(i);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++){
            int val = map.getOrDefault(nums1[i], -1);
            result[i] = val;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] n1 = {1,3,5,2,4};
        int[] n2 = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(n1, n2)));
    }
}


/*
Own method
public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack1 = new Stack<>();
        int[] num1 = new int[nums1.length];
        int idxs = 0;
        for (int i = nums1.length-1; i >= 0 ; i--){
            num1[idxs++] = nums1[i];
        }
        for (int n1: num1) stack1.push(n1);

        int[] num3 = new int[nums2.length];
        int idx = 0;
        for (int i = nums2.length-1; i >= 0 ; i--){
            num3[idx++] = nums2[i];
        }
        int index = 0;
        while (!stack1.isEmpty()){
            boolean flag = false;
            Stack<Integer> stack2 = new Stack<>();
            for (int n2: num3) stack2.push(n2);
            int cur = stack1.pop();
            while (!stack2.isEmpty()){
                if ( cur == stack2.peek() ){
                    flag = true;
                }
                if (flag && !stack2.isEmpty() && stack2.peek() > cur){
                    ans[index] = stack2.pop();
                    break;
                }
                stack2.pop();
            }
            index++;
        }

        return ans;
    }
 */