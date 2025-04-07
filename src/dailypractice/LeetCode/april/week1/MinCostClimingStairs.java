package dailypractice.LeetCode.april.week1;

public class MinCostClimingStairs {
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
    public static void main(String[] args) {
        int[] c = {0,2,2,1};
        System.out.println(minCostClimbingStairs(c));
    }
}
