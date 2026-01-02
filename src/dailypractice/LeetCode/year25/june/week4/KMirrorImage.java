package dailypractice.LeetCode.year25.june.week4;

public class KMirrorImage {
    public static long kMirror(int k, int n) {
        long ans = 0;
        int start = 1;
        while (n > 0){
            int cur = start;
            StringBuilder baseK = new StringBuilder();
            while (cur > 0){
                baseK.insert(0, cur % k);
                cur /= k;
            }
            if (isPalindrome(start) && isPalindrome(baseK.toString())){
                System.out.println(start + " --- " + baseK);
                n--;
                ans += start;
            }
            start++;
        }
        return ans;
    }

    static boolean isPalindrome(String s){
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    static boolean isPalindrome(int n){
        String sb = Integer.toString(n);
        return  new StringBuilder(sb).reverse().toString().equals(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(kMirror(3,7));
    }
}
