package dailypractice.geeksforgeeks.july.week1;


import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static int substrCount(String s, int k) {
        int ans = 0;
        for (int i =0; i<= s.length()-k; i++){
            String substr = s.substring(i, i+k);
            Set<Character> unique = new HashSet<>();
            for (int j =0; j< substr.length(); j++){
                unique.add(substr.charAt(j));
            }
            if (unique.size() == k-1){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(substrCount("aabab", 3));
    }
}
