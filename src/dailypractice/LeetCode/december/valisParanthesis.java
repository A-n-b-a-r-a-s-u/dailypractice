package dailypractice.LeetCode.december;

import java.util.Collections;

public class valisParanthesis<T> {
    public T name ;
    public static boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        Collections collections ;


        System.out.println(isValid("([]"));;
    }
}
