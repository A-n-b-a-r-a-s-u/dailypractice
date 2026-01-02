package dailypractice.LeetCode.year25.june.week3;

import java.util.Arrays;
import java.util.HashMap;

public class KSpecialString {
    public static int minimumDeletions(String word, int k) {
        int ans = Integer.MAX_VALUE;
        HashMap<Character, Integer> charCount =  new HashMap<>();
        for ( char c : word.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int[] numArray = new int[charCount.size()];
        int index = 0;
        for (int n: charCount.values()){
            numArray[index++] = n;
        }
        Arrays.sort(numArray);

        for (int i =0; i< numArray.length; i++){
            int total = numArray[i];
            int range = numArray[i] + k;
            for (int j = i+1; j< numArray.length; j++){
                if (numArray[j] > range ){
                    total += range;
                }
                else {
                    total += numArray[j];
                }
            }
            int remains = word.length() - total;
            ans =  Math.min(ans, remains);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "vvnowvov";
        minimumDeletions(s, 2);

    }
}

/*

for (int i =0; i< numArray.length; i++){
            for (int j = i+ 1; j< numArray.length; j++){
                int diff = Math.abs(numArray[i] - numArray[j]);
                if (diff > k && numArray[i] > 0){
                    int reduceValue = diff - k;
                    ans += Math.min(reduceValue, numArray[i]);
                    numArray[i] -= reduceValue;
                    numArray[i] = Math.max(numArray[i], 0);
                }
            }
        }
 */
