package dailypractice.LeetCode.april.week1;

public class WithBrainPower {
    public static long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        for (int i = questions.length-1; i>=0; i--){
            int index = i + questions[i][1] + 1;
            if (index < questions.length){
                dp[i] = dp[index] + questions[i][0];
            }
            else {
                dp[i] = questions[i][0];
            }
            if (i < questions.length-1){
                dp[i] = Math.max(dp[i], dp[i+1] );
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int [][] q = {{21,5}, {92,3}, {74,2}, {39,4}, {58,2}, {5,5}, {49,4}, {65,3} };
        System.out.println(mostPoints(q));

    }
}

/*
Greedy Approach

public static long mostPoints(int[][] questions) {
        long ans = 0;
        for (int i = 0; i< questions.length; i++){
            long  currPoints =0;
            int index =i;
            while (index < questions.length){
                currPoints += questions[index][0];
                index += questions[index][1] + 1;
            }
            if (currPoints> ans) ans = currPoints;
        }
        return ans;
    }
 */
