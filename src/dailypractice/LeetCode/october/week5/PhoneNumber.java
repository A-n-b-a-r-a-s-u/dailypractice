package dailypractice.LeetCode.october.week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumber {
    public static List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<Character, String> dialPad = new HashMap<>();
        dialPad.put('2', "abc");
        dialPad.put('3', "def");
        dialPad.put('4', "ghi");
        dialPad.put('5', "jkl");
        dialPad.put('6', "mno");
        dialPad.put('7', "pqrs");
        dialPad.put('8', "tuv");
        dialPad.put('9', "wxyz");

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();

        for (Character c: digits.toCharArray()){
            values.add(dialPad.get(c));
            list.add(dialPad.get(c).length());
        }
        for (int i = list.size()-1; i<4; i++){
            list.add(0);
        }

        for (int i =0; i< list.get(0); i++){
            String dialValue = values.get(0);
            String cur = "";
            cur += (dialValue.charAt(i));
            for (int j = 0; j< list.get(1); j++){
                String dialValue1 = values.get(1);
                String cur1 = cur;
                cur1 += (dialValue1.charAt(j));
                for (int k = 0; k< list.get(2); k++){
                    String dialValue2 = values.get(2);
                    String cur2 = cur1;
                    cur2 += (dialValue2.charAt(k));
                    for (int l = 0; l< list.get(3); l++){
                        String dialValue3 = values.get(3);
                        String cur3 = cur2;
                        cur3 += (dialValue3.charAt(l));
                        if (digits.length() == 4){
                            ans.add(cur3);
                        }
                    }
                    if (digits.length() == 3){
                        ans.add(cur2);
                    }
                }
                if (digits.length() == 2){
                    ans.add(cur1);
                }
            }
            if (digits.length() == 1){
                ans.add(cur);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));
    }
}
