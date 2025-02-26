package dailypractice.geeksforgeeks.february;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int result =0;
        LinkedHashMap<Integer, Integer> arrayCount= new LinkedHashMap<>();
        for (int i=0; i< nums.length; i++){
            if (arrayCount.containsKey(nums[i])){
                arrayCount.compute(nums[i], (k, temp) -> temp + 1);
            }
            else {
                arrayCount.put(nums[i], 1);
            }
        }
        result = arrayCount.size();
        Integer[] finalArray = arrayCount.keySet().toArray(new Integer[result]);
        int t =0;
        for (Integer j : finalArray){
            nums[t] = j;
            t++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));

        for (int k =0; k< arr.length; k++) {
            System.out.println(arr[k]);
        }

    }
}
