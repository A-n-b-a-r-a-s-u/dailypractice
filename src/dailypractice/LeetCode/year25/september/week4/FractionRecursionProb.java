package dailypractice.LeetCode.year25.september.week4;

import java.util.HashMap;
import java.util.Map;

public class FractionRecursionProb {
    public static String fractionToDecimal(int numerator, int denominator) {
        StringBuilder ans = new StringBuilder();
        if (numerator == 0)
            return "0";
        long numer = Math.abs((long) numerator);
        long denomin = Math.abs((long) denominator);
        if (numerator < 0 ^ denominator < 0)
            ans.append("-");

        ans.append(numer/denomin);
        long reminder = numer % denomin;
        if (reminder == 0)
            return ans.toString();
        ans.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (reminder != 0){
            if (map.containsKey(reminder)){
                ans.insert(map.get(reminder), "(");
                ans.append(")");
                break;
            }
            map.put(reminder, ans.length());
            reminder *= 10;
            ans.append(reminder/denomin);
            reminder %= denomin;

        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4,333));
    }
}

/*
Not Working Method - Done by Me Later learned and updated the code

public static String fractionToDecimal(int numerator, int denominator) {
        String ans ;
        float f = (float) numerator / denominator;
        ans = String.valueOf(f);
        String[] an = ans.split("\\.");
        if (an.length == 1 || an[1].equals("0")){
            return an[0];
        }
        if (an[1].length() == 1){
            return an[0] +"." + an[1];
        }
        String fraction =  an[1];
        String cmp = "";
        for (int i = 0; i< fraction.length(); i++){
            cmp += fraction.charAt(i);
            String temp = fraction.replace(cmp, "");
            if (temp.isEmpty()){
                return an[0] +"."+ "("+ cmp + ")";
            }
        }

        return an[0] +"." + an[1];
    }
 */