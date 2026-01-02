package dailypractice.LeetCode.year25.june.week2;

import java.util.HashSet;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int ans =0;
        HashSet<Character> seen = new HashSet<>();
        int left =0, right =0;

        while (right< s.length()){
            if (!seen.contains(s.charAt(right))){
                seen.add(s.charAt(right));
                ans = Math.max(ans, seen.size());
                right++;
            }
            else {
                seen.remove(s.charAt(left));
                left++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
}

/*

for (int i =0; i<= s.length(); i++){
            String cur = s.substring(0, i);
            if (validString(cur)){
                ans = Math.max(ans, cur.length());
            }
            cur = s.substring(i, s.length());
            if (validString(cur)){
                ans = Math.max(ans, cur.length());
            }
        }
 */