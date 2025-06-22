package dailypractice.LeetCode.june.week4;

public class DivideString {
    public static String[] divideString(String s, int k, char fill) {
        int leng = s.length() % k == 0 ? s.length()/k: (s.length()/k) +1;
        String[] ans = new String[leng];
        int remain = s.length() % k == 0? 0: k - (s.length() % k);
        String rm = "";
        for (int i =0; i< remain; i++){
            rm += fill;
        }
        int start = 0;
        for (int i =0; i< leng; i++){
            if (i == leng-1 && remain > 0){
                String cur = s.substring(start);
                cur += rm;
                ans[i] = cur;
                continue;
            }

            String cur = s.substring(start, start+k);
            start += k;
            ans[i] = cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ctoyjrwtngqwt";
        divideString(s, 8, 'x');
    }
}
