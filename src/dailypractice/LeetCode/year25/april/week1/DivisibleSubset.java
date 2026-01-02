package dailypractice.LeetCode.year25.april.week1;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> current ;
        for (int i =0; i< nums.length; i++){
            current = new ArrayList<>();
            current.add(nums[i]);
            for (int j =0; j< i; j++){
                if (nums[i] % current.get(j) == 0 || current.get(j) % nums[i] ==0){
                    current.add(nums[j]);
                }
            }
            if (current.size() > ans.size()){
                ans = current;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {4,8,10,240};
        List<Integer> a = largestDivisibleSubset(n);
        for (int i =0; i< a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }

    }
}
