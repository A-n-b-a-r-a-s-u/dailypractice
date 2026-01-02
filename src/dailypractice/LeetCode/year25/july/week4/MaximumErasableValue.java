package dailypractice.LeetCode.year25.july.week4;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasableValue {
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        int sum = 0;
        int start = 0;
        for (int i = 0; i< nums.length; i++){
            while (set.contains(nums[i])){
                set.remove(nums[start]);
                sum -= nums[start++];
            }
            set.add(nums[i]);
            sum += nums[i];
            ans = Math.max(sum, ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(a));
    }
}


/*
public static int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        for (int i = 0; i< nums.length; i++){
            ArrayList<Integer> lst = new ArrayList<>();
            int curSum = 0;
            for (int j = i; j< nums.length; j++){
                if (lst.contains(nums[j])){
                    break;
                }
                else {

                    lst.add(nums[j] );
                    curSum += nums[j];
                }
                sum = Math.max(sum, curSum);
            }
        }
        return sum;
    }

    APPROACH - 2:
    public static int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int ans = 0;
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i< nums.length; i++){
            if (lst.contains(nums[i])){
                while (lst.contains(nums[i])){
                    sum -= lst.getFirst();
                    lst.removeFirst();
                }
                lst.add(nums[i]);
                sum += nums[i];
            }
            else {
                lst.add(nums[i]);
                sum += nums[i];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
 */