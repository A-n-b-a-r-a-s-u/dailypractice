package dailypractice.LeetCode.year25.april.week1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static int majorityElement(int[] nums) {
        int ans =0, ansCount =0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num: nums){
            if (mp.containsKey(num)){
                mp.put(num, mp.get(num) +1);
            }
            else {
                mp.put(num, 1);
            }
        }
        for (int val: mp.keySet()){
            if (ansCount< mp.get(val)){
                ansCount = mp.get(val);
                ans = val;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(n));
    }
}


/*
public static int majorityElement(int[] nums) {
        int ans =0, ansCount =0;
        int count =0;
        if (nums.length == 1 ) return nums[0];
        for (int i =0; i< nums.length; i++) {
            for (int j = i+1; j< nums.length; j++){
                if (nums[i] == nums[j])
                    count++;
            }
            if(ansCount < count){
                ansCount = count;
                ans = nums[i];
            }
            count =0;
        }
        return ans;
    }
 */