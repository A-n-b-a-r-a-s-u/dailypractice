package dailypractice.LeetCode.november.week1;

import java.util.ArrayList;

public class RopeColourFull {
    public static int  minCost(String colors, int[] neededTime) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(neededTime[0]);
        for (int i = 1; i< colors.length(); i++){
            if (!list.isEmpty() && colors.charAt(i) != colors.charAt(i-1)){
                int max = Integer.MIN_VALUE;
                int cur = 0;
                for (int time : list){
                    max = Math.max(max, time);
                    cur += time;
                }
                ans += cur - max;
                list = new ArrayList<>();
            }
            list.add(neededTime[i]);
        }
        if ( list.size() > 1){
            int max = Integer.MIN_VALUE;
            int cur = 0;
            for (int time : list){
                max = Math.max(max, time);
                cur += time;
            }
            ans += cur - max;

        }

        return ans;
    }

    public static void main(String[] args) {
        String c = "abaac";
        int[] n = {1,2,3,4,5};
        System.out.println(minCost(c,n));
    }
}
