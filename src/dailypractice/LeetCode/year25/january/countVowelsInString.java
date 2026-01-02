package dailypractice.LeetCode.year25.january;

import java.util.HashMap;
import java.util.Map;

public class countVowelsInString {

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] result = new int[queries.length];
        Map<String, Integer> wmap = new HashMap<>();
        for (int i =0; i< words.length; i++) {
            String s = words[i];
            for (int j =0; j< s.length(); j++) {
                if ((s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u') && (s.charAt(s.length()-1) == 'a' || s.charAt(s.length()-1) == 'e' || s.charAt(s.length()-1) == 'i' || s.charAt(s.length()-1) == 'o' || s.charAt(s.length()-1) == 'u') ){
                    wmap.put(s, 1);
                }
                else {
                    wmap.put(s,0);
                }
            }
        }

        for (int i =0; i< queries.length ; i++) {
            int count =0;
            int[] qry = queries[i];
            for (int j = qry[0]; j <= qry[1]; j++) {
                String cmp = words[j];
                if (wmap.get(cmp) == 1){
                    count += 1;
                }
            }

            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] word = {"a","e","i"};
        int[][] query =  {{0,2},{0,1},{2,2}};
        int [] temp = vowelStrings(word, query);
        for (int i =0; i< temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
