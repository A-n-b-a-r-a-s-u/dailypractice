package dailypractice.LeetCode.year25.may.week1;

import java.util.HashMap;

public class DominousPair {
    public static int numEquivDominoPairs(int[][] dominoes) {
        int count =0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        HashMap<Integer, int[]> arrayTable = new HashMap<>();
        int high = 1;
        for (int i =0; i< dominoes.length; i++){
            int current = dominoes[i][0] + dominoes[i][1];
            countMap.put(current, countMap.getOrDefault(current, 0) +1);
            arrayTable.put(current, dominoes[i]);
            if (countMap.get(current) > high){
                high = current;
            }
        }
        int [] finalArray = arrayTable.get(high);
        return count;
    }

    public static void main(String[] args) {
        int[][] d = {{1,2}, {2,1}, {3,4}, {5,6}};
        numEquivDominoPairs(d);

    }
}
