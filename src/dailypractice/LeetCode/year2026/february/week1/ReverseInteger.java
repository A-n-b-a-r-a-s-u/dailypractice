package dailypractice.LeetCode.year2026.february.week1;

public class ReverseInteger {
    public static int reverse(int x) {
        int ans ;
        StringBuilder res = new StringBuilder(String.valueOf(Math.abs(x)));
        if (x < 0)
            res.append('-');
        try{
            ans = Integer.parseInt(String.valueOf(res.reverse()));
        }
        catch (Exception e){
            return 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1534236469));
    }
}
