package dailypractice.LeetCode.april.week1;

public class MinCostClimingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] ans = new int[cost.length+1];
        for (int i = 2; i<= cost.length; i++){
            ans[i] = Math.min(ans[i-1] + cost[i-1], ans[i-2] + cost[i-2]);
        }
        return ans[cost.length];
    }

    public static void main(String[] args) {
        int[] c = {0,2,2,1};
        System.out.println(minCostClimbingStairs(c));
    }
}


/*
public static int minCostClimbingStairs(int[] cost) {
        int ans =0;
        for (int i = cost.length-1; i>0; i--){
            if (cost[i] == cost[i-1]){
                ans += cost[i];
                i--;
            }
            else if (cost[i] < cost[i-1]){
                ans += cost[i];
            }
            else {
                ans += cost[i-1];
                i--;
            }
        }
        return ans;
    }
 */