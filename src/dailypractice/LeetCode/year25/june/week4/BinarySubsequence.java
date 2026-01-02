package dailypractice.LeetCode.year25.june.week4;

public class BinarySubsequence {
    public static int longestSubsequence(String s, int k) {
        int sm = 0;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(s.length() - 1 - i);
            if (ch == '1') {
                if ( sm + (1 << i) <= k) {
                    sm += 1 << i;
                    cnt++;
                }
            } else {
                cnt++;
            }
        }
        return cnt;
    }



    public static void main(String[] args) {
        String s = "000101010011011001011101111000111111100001011000000100010000111100000011111001000111100111101001111001011101001011011101001011011001111111010011100011110111010000010000010111001001111101100001111";
        System.out.println(longestSubsequence(s, 300429827));
    }
}


/*
public static int longestSubsequence(String s, int k) {
        int ans ;
        StringBuilder str = new StringBuilder();
        int index = s.length()-1;
        String prev = "";
        for (int  i = s.length()-1; i >= 0; i--){
            str.insert(0,s.charAt(index--));
            int cur = Integer.parseInt(str.toString(), 2);
            if (cur == k){
                break;
            } else if (cur > k) {
                str = new StringBuilder(prev);
                break;
            }
            prev = String.valueOf(str);
        }

        for (int j = index; j >=0; j--){
            if (s.charAt(j) == '0'){
                str.insert(0, '0');
            }
        }
        ans = str.length();
        return ans;
    }
 */