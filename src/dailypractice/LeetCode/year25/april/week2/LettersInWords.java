package dailypractice.LeetCode.year25.april.week2;

import java.util.ArrayList;
import java.util.List;

public class LettersInWords {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i =0; i< words.length; i++){
            if (words[i].contains(String.valueOf(x))){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] s = {"abc","bcd","aaaa","cbc"};
        List<Integer> a = findWordsContaining(s, 'z');
        for (int j =0; j< a.size(); j++){
            System.out.print(a.get(j));
        }
    }
}
