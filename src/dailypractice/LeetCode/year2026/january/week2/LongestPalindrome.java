package dailypractice.LeetCode.year2026.january.week2;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String ans = String.valueOf(s.charAt(0));
        int len = 1;
        for (int j =0; j< s.length(); j++){
            for (int i = j; i <= s.length(); i++){
                String subString = s.substring(j,i);
                if (len < subString.length() && isPalindrome(subString)){
                    ans = subString;
                    len = subString.length();
                }
            }
        }

        return ans;
    }

    public boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String rev = String.valueOf(sb.reverse());
        if (str.equals(rev)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
