package dailypractice.LeetCode.year25.july.week4;

import java.util.Stack;

public class MaximumScore {
    public static int maximumGain(String s, int x, int y) {
        int ans =0;
        Stack<Character> stc = new Stack<>();
        for (int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a' && (!stc.isEmpty())){
                if ("ab".equals("a"+stc.peek())){
                    ans += y;
                    stc.pop();
                }
                else {
                    stc.push(c);
                }
            }
            else if (c == 'b' && (!stc.isEmpty())){
                if ("ba".equals("b"+stc.peek())){
                    ans += x;
                    stc.pop();
                }
                else {
                    stc.push(c);
                }
            }
            else {
                stc.push(c);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maximumGain("cdbcbbaaabab" , 4, 5));
    }
}
