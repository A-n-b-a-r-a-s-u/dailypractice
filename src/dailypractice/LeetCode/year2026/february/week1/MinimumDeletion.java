package dailypractice.LeetCode.year2026.february.week1;

public class MinimumDeletion {
    public static int minimumDeletions(String s) {
        int ans = Integer.MAX_VALUE;
        int a=0, b=0;
        for (int c : s.toCharArray()){
            if(c == 'a')
                a++;
        }

        for (int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a')
                a--;
            ans = Math.min(ans, a+b);
            if (ch == 'b')
                b++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumDeletions("bbaaaaabb"));
    }
}
