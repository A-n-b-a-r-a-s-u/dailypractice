package dailypractice.LeetCode.year25.june.week2;

import java.util.HashMap;

public class EvenandOddFrequency {
    public static int maxDifference(String s) {
        int hodd = 0, leven = Integer.MAX_VALUE;
        HashMap<Character, Integer> alphaCount = new HashMap<>();
        for (int i =0; i< s.length(); i++){
            alphaCount.put(s.charAt(i), alphaCount.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int k: alphaCount.values()){
            if (k%2 == 0){
                leven = Math.min(k, leven);
            }
            else {
                hodd = Math.max(k, hodd);
            }
        }
        return hodd - leven;
    }

    public static void main(String[] args) {
        System.out.println(maxDifference("aaaaabbc"));
    }
}