package dailypractice.LeetCode.march;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEqualPairs {
    public static boolean divideArray(int[] nums) {
        if (nums.length %2 !=0){
            return false;
        }
        ArrayList<Integer> cmp = new ArrayList<>();
        for (int j =0; j< nums.length; j++) {
            cmp.add(nums[j]);
        }
        int size = nums.length;

        for (int i =0; i< size/2; i++) {
            int temp = cmp.getFirst();
            cmp.removeLast();
            if (cmp.contains(temp)){
                int index = cmp.indexOf(temp);
                cmp.remove(index);
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4};

        System.out.println(divideArray(a));

    }
}
