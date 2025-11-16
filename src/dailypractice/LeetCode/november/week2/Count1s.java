package dailypractice.LeetCode.november.week2;

public class Count1s {
    public static int numSub(String s) {
        long ans = 0;
        long count = 0;
        long mod = 1000000007;
        for (int i =0; i< s.length(); i++){
            if (s.charAt(i) == '1'){
                count++;
                ans = (ans + count) % mod;
            }
            else {
                count = 0;
            }
        }

        return (int)ans;
    }

    public static void main(String[] args) {
        System.out.println(numSub("0110111"));
    }
}
