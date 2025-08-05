package dailypractice.LeetCode.june.week5;


import java.util.TreeMap;

public class HarmoniousSebSequence {
    public static int findLHS(int[] nums) {
        int ans = 0;
        TreeMap<Integer, Integer> list = new TreeMap<>();
        for (int num : nums) {
            list.put(num, list.getOrDefault(num, 0) + 1);
        }
        for (Integer n : list.keySet()){
            if (list.containsKey(n+1)){
                int cur = list.get(n) + list.get(n+1);
                ans = Math.max(ans, cur);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int [] n = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(n));
    }
}


/*
public static int findLHS(int[] nums) {
        int ans = 0;
        TreeMap<Integer, Integer> list = new TreeMap<>();
        for (int num : nums) {
            list.put(num, list.getOrDefault(num, 0) + 1);
        }
        int[] uniqueNum = new int[list.size()];
        int index =0;
        for (Integer n : list.keySet() ){
            uniqueNum[index++] = n;
        }
        for (int j =0; j< list.size()-1; j++){
            if (uniqueNum[j+1] - uniqueNum[j] == 1){
                int cur = list.get(uniqueNum[j]) + list.get(uniqueNum[j+1]);
                ans = Math.max(ans, cur);
            }
        }
        return ans;
    }
 */