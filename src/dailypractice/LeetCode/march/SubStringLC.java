package dailypractice.LeetCode.march;

import java.util.HashSet;
import java.util.Set;

public class SubStringLC {
    public static int numberOfSubstrings(String s) {
        int ans =0;
        int[] charSequence = new int[3];
        int left =0;
        for (int right =0; right < s.length(); right++ ){
            charSequence[s.charAt(right) - 'a']++;
            while (charSequence[0] > 0 && charSequence[1] > 0 && charSequence[2] > 0 ){
                ans += s.length() - right;
                charSequence[s.charAt(left) - 'a']--;
                left++;

            }
        }
        return ans;
    }


    public static void main(String[] args) {

        System.out.println(numberOfSubstrings("aaacb"));
    }
}
