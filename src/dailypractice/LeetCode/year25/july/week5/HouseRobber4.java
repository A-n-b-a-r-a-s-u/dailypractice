package dailypractice.LeetCode.year25.july.week5;

import java.util.ArrayList;
import java.util.HashMap;

public class HouseRobber4 {
    public int minCapability(int[] nums, int k) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            hash.put(nums[i], i);
            list.add(nums[i] );
        }

        list.sort(null);

        int index = hash.get(list.getFirst());

        if (index > 0){

        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
