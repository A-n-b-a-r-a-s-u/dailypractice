package dailypractice.LeetCode.year25.march;

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int tra =0;
        if(s.isEmpty()){
            return true;
        }
        if( t.isEmpty()){
            return false;
        }
        for (int i=0; i< t.length(); i++ ){
            if(t.charAt(i) == s.charAt(tra)){
                tra++;
            }
            if (tra >= s.length()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
