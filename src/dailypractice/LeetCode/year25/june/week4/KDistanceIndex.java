package dailypractice.LeetCode.year25.june.week4;

import java.util.ArrayList;
import java.util.List;

public class KDistanceIndex {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> keyIndexs = new ArrayList<>();
        int index = 0;
        for (int n: nums){
            if (n == key){
                keyIndexs.add(index);
            }
            index++;
        }
        for (int i = 0; i< nums.length; i++){
            for (int j = 0; j< keyIndexs.size(); j++){
                if (Math.abs(i - keyIndexs.get(j)) <= k){
                    ans.add(i);
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {2,2,2,2,2};
        System.out.println(findKDistantIndices(n, 2, 2));
    }
}
