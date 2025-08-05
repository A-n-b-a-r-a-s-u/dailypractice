package dailypractice.LeetCode.july.week1;

import java.util.HashMap;

public class LuckyNumber {
    public static int findLucky(int[] arr) {
        int ans = -1;
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int j : arr) {
            list.put(j, list.getOrDefault(j, 0) + 1);
        }
        for (int key: list.keySet()){
            if (key == list.get(key)){
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {2,2,3,4};
        System.out.println(findLucky(n));
    }
}
