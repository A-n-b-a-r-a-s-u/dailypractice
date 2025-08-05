package dailypractice.LeetCode.july.week4;

public class MinimumCostToCook {
    public static int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
            int ans ;
            int cost1 =0; int cost2 = 0;
            int minutes = (targetSeconds/60);
            int remainingSeconds = targetSeconds % 60;
            if (minutes > 99) {
                minutes--;
                remainingSeconds += 60;
            }
            int targetInMinutes1 = (minutes * 100) + remainingSeconds;
            int targetInMinutes2 = remainingSeconds < 40 ? (minutes-1) * 100 + remainingSeconds + 60: (minutes * 100) + remainingSeconds;

            int startcopy = startAt;
            for (char c: String.valueOf(targetInMinutes1).toCharArray()){
                int temp = c-'0';
                if (temp == startcopy){
                    cost1 += pushCost;
                }
                else {
                    cost1 += moveCost;
                    cost1 += pushCost;
                }
                startcopy = c - '0';
            }
            for (char c: String.valueOf(targetInMinutes2).toCharArray()){
                int temp = c - '0';
                if (temp == startAt){
                    cost2 += pushCost;
                }
                else {
                    cost2 += moveCost;
                    cost2 += pushCost;
                }
                startAt = c - '0';
            }
            ans = Math.min(cost1, cost2);
            return ans;
    }

    public static void main(String[] args) {
        System.out.println(minCostSetTime(9, 1000, 1, 6039));

    }
}


/*
 public static int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {

    }
 */