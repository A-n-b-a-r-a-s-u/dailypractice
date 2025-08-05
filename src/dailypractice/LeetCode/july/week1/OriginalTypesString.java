package dailypractice.LeetCode.july.week1;

import java.util.HashMap;

public class OriginalTypesString {
    public static int possibleStringCount(String word) {
        int ans = 1;
        for (int i = 0; i< word.length()-1; i++){
            if (word.charAt(i) == word.charAt(i +1)){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(possibleStringCount("abcd"));
    }
}
