package dailypractice.LeetCode.june.week3;

public class MaximumDifference {
    public static int maxDiff(int num) {
        String s = Integer.toString(num), a = "", b;
        char c = 0;
        for (char ch : s.toCharArray())
            if (ch != '9') {
                c = ch;
                a = s;
                break;
            }
        if (!a.isEmpty())
            a = a.replace(c, '9');
        else
            a = s;

        if (s.charAt(0) != '1') {
            b = s.replace(s.charAt(0), '1');
        }
        else {
            b = s;
            for (int i = 1; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch != '0' && ch != '1') {
                    b = b.replace(ch, '0');
                    break;
                }
            }
        }
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(123456));
    }
}

/*
public static int maxDiff(int num) {
        int ans =0;
        String s = String.valueOf(num);
        for (int i =0; i< s.length(); i++){
            String s1 = String.valueOf(num);
            int max  =0 , min = Integer.MAX_VALUE ;
            max = Math.max(max, Integer.parseInt(s.replace(s1.charAt(i), '9')));
            int curMin  = Integer.parseInt(s.replace(s1.charAt(i), '0'));
            String s2 = String.valueOf(curMin);
            if (s2.charAt(0) == '0'){
                curMin  = Integer.parseInt(s.replace(s1.charAt(i), '1'));
            }
            min =  Math.min(min, curMin);
            ans = Math.max(ans, max - min);
        }
        return ans;
    }
 */
