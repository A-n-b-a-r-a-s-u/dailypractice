package dailypractice.LeetCode.year25.july.week1;

import java.util.ArrayList;
import java.util.HashMap;

public class IntervalBetween {
    public static long[] getDistances(int[] arr) {
        long[] ans = new long[arr.length];
        HashMap<Integer, ArrayList<Integer>> valuesIndex = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            ArrayList<Integer> cur;
            if (valuesIndex.isEmpty()){
                cur = new ArrayList<>();
                System.out.println(cur);
            }
            else {
                cur = valuesIndex.get(arr[i]);
            }
            cur.add(i);
            valuesIndex.put(arr[i], valuesIndex.getOrDefault(arr[i], cur ));
        }

        for (int i =0; i< valuesIndex.size(); i++){
            System.out.println(valuesIndex);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,1,2,3,3};
        getDistances(arr);
    }

}
