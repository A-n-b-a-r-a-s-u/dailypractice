package dailypractice.LeetCode.year25.january;

import java.util.Scanner;

public class LongestStringPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];

        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("Enter the string for an input: ");
        Scanner input = new Scanner(System.in);
        String[] inpString = new String[3];
        for (int i =0; i< 3; i++) {
            inpString[i] = input.next();
        }

        LongestStringPrefix lsp = new LongestStringPrefix();
        System.out.println(lsp.longestCommonPrefix(inpString));
    }
}

/*
public String longestCommonPrefix(String[] strs) {
        String result = "";
        String res ="";
        int lengthOfStr = strs.length;
        for (int i =0; i< lengthOfStr; i++) {
            for (int j=0; j< lengthOfStr; j++) {
                if (j != lengthOfStr-1 && strs[j].charAt(i) == strs[j+1].charAt(i)) {
                    if (j+1 == lengthOfStr-1) {
                        res += strs[j].charAt(i);
                    }
                }
                else if (j != lengthOfStr-1 && strs[j].charAt(i) != strs[j+1].charAt(i)) {
                    res = "";
                    break;
                }

            }
            result += res;
            res ="";
        }

        return result;

    }
 */
