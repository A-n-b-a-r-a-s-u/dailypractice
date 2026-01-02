package dailypractice.LeetCode.year25.october.week1;

import java.util.Arrays;
import java.util.HashMap;

public class MaxElementSubset {

    public static int maximumLength(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for (int num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }
        Integer[] arr = numCount.keySet().toArray(new Integer[0]);
        Arrays.sort(arr);
        int base = 0;
        for (Integer n : arr){
            if(n == 1){
                continue;
            }
            base = n;
            break;
        }
        if(base == 0){
            return ans;
        }
        int pow = 1;
        while (true){
            int reqired = (int)Math.pow(base, pow++);
            if (!(numCount.containsKey(reqired)) || numCount.get(reqired) < 2){
                ans++;
                break;
            }
            System.out.println(reqired);
            ans += 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1,16,49,16,121};
        System.out.println(maximumLength(n));
    }
}
