package dailypractice.LeetCode.september.week4;

import java.util.HashMap;

public class CountElements {
    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> numList = new HashMap<>();
        int max = 0;
        for (int i: nums){
            numList.put(i, numList.getOrDefault(i, 0)+1);
            max = Math.max(max, numList.get(i));
        }
        int count = 0;
        for (int j : numList.values()){
            if (j == max){
                count++;
            }
        }


        return (max * count);
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};

        System.out.println(maxFrequencyElements(n));
    }
}
