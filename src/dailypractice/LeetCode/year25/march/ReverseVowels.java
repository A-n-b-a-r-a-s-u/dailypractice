package dailypractice.LeetCode.year25.march;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder();
        ArrayList<Character> charList = new ArrayList<>();
        Set<Integer> intList = new HashSet<>();

        for (int i=0; i< s.length(); i++){
            if (s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U' ){
                charList.add(s.charAt(i));
                intList.add(i);
            }
        }
        int trave =charList.size()-1;
        for (int j=0; j<s.length(); j++){
            if (intList.contains(j)){
                ans.append(charList.get(trave));
                trave--;
            }
            else {
                ans.append(s.charAt(j));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));

    }
}
