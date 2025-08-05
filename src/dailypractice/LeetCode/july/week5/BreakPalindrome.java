package dailypractice.LeetCode.july.week5;

import java.util.Arrays;

public class BreakPalindrome {
    public static String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1){
            return "";
        }
        char[] charArray = palindrome.toCharArray();
        for (int i = 0; i< charArray.length; i++){
            if (i == charArray.length-1 && charArray[i] == 'a'){
                charArray[i] = 'b';
            }
            else if (charArray[i] != 'a'){
                char temp = charArray[i];
                charArray[i] = 'a';
                if (isPalindrome(new String(charArray))){
                    charArray[i] = temp;
                }
                else {
                    break;
                }
            }
        }

        return new String(charArray);
    }
    public static boolean isPalindrome(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(breakPalindrome("abccba"));

    }
}
