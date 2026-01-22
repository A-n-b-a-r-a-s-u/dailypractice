package dailypractice.LeetCode.year2026.january.week4;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumPairRemove {
    public int minimumPairRemoval(int[] nums) {
        int ans = 0;
        while (!isArrayIncreasing(nums)){
            ArrayList<Integer> list = new ArrayList<>();
            int prev = nums[0];
            list.add(prev);
            int min = Integer.MAX_VALUE;
            int inde1 = 0, inde2 = 1;
            for (int i =1; i< nums.length; i++){
                list.add(nums[i]);
                if (prev + nums[i] < min){
                    inde1 = i-1;
                    inde2 = i;
                    min = prev + nums[i];
                }
                prev = nums[i];
            }
            list.remove(inde2);
            list.remove(inde1);
            list.add(inde1, min);
            nums = list.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
            ans++;
        }

        return ans;
    }

    public boolean isArrayIncreasing(int[] arr){
        int prev = arr[0];
        for (int i =1; i< arr.length; i++){
            if (prev > arr[i]){
                return false;
            }
            prev = arr[i];
        }
        return true;
    }

    public static void main(String[] args) {
        MinimumPairRemove m = new MinimumPairRemove();
        int[] num = {1,2,2};
        System.out.println(m.minimumPairRemoval(num));
    }
}
