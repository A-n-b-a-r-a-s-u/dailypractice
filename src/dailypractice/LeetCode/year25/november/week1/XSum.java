package dailypractice.LeetCode.year25.november.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class XSum {
    public static int[] findXSum(int[] nums, int k, int x) {
        int[] ans = new int[nums.length - k + 1];
        int stopIndex = k;
        for (int i = 0; i < nums.length-k; i++){
            ans[i] = sortFunction(Arrays.copyOfRange(nums, i, stopIndex++) , x);
        }

        return ans;
    }
    public static int sortFunction(int[] subArray, int x){
        int res = 0;
        Arrays.sort(subArray);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(subArray[0]);
        int count = 1;
        for (int i = 1 ;i< subArray.length; i++){
            if (subArray[i-1] != subArray[i]){
                list.add(count);
                count = 1;
                unique.add(subArray[i]);
            }
            else {
                count++;
            }
        }
        list.add(count);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < unique.size(); j++){
            if (map.containsKey(list.get(j))){
                int num = map.get(list.get(j));
                if (num < list.get(j)){
                    map.put(list.get(j), unique.get(j) );
                }
            }
            else
                map.put(list.get(j), unique.get(j) );
        }

        list.sort((a, b) -> b - a);
        int size = Math.min(x, unique.size());
        for (int k = 0; k< size; k++){
            res += map.get(list.get(k)) * list.get(k);
        }



        return res;
    }

    public static void main(String[] args) {
        int[] n = {1,1,2,2,3,4,2,3};

        int[] out = findXSum(n, 6, 2);
        for (int l : out){
            System.out.println(l);
        }
    }
}
