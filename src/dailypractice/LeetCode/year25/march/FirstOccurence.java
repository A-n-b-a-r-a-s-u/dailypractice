package dailypractice.LeetCode.year25.march;

public class FirstOccurence {
    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)){
            return -1;
        }
        else {
            for (int i =0; i< haystack.length(); i++){
                if (haystack.charAt(i) == needle.charAt(0)){
                    if (needle.equals(haystack.substring(i, i + needle.length())) ){
                        return i;
                    }
                }
            }
        }
        return -2;
    }

    public static void main(String[] args) {
        String h = "leetcode";
        String n = "leeto";

        System.out.println(strStr(h,n));

    }
}
