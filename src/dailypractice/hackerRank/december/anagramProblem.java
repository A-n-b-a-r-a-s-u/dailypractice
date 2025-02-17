package dailypractice.hackerRank.december;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class anagramProblem {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> string1 = new HashMap<>();
        Map<Character, Integer> string2 = new HashMap<>();
        if (a.length() != b.length()) {
            return false;
        }
        for (int i =0; i< a.length(); i++) {
            if (string1.containsKey(a.charAt(i))){
                string1.compute(a.charAt(i),(key , value) -> value + 1);
            }
            else {
                string1.put(a.charAt(i), 1);
            }
            if (string2.containsKey(b.charAt(i))){
                string2.compute(b.charAt(i),(key, value) -> value + 1);
            }
            else {
                string2.put(b.charAt(i), 1);
            }
        }
        for(char cmp1 : string1.keySet()){
            if (string2.containsKey(cmp1)){
                if (!(string1.get(cmp1).equals(string2.get(cmp1)))){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in1 = sc.next();
        String in2 = sc.next();
        isAnagram(in1, in1);
        boolean ret = isAnagram(in1, in2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}