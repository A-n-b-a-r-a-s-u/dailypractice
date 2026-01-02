package dailypractice.LeetCode.year25.march;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int ans = 0;
        if (n<=2) return n;

        int prev1 =1, prev2 =2;
        for (int i =3; i <= n; i++){
            ans = prev1 + prev2;
            prev1 = prev2;
            prev2 = ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));

    }
}
