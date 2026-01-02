package dailypractice.LeetCode.year25.december.week4;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumPenalty {
    public static int bestClosingTime(String customers) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int overallMin = Integer.MAX_VALUE;
        int count =0;
        for (int c: customers.toCharArray()){
            if(c == 'Y')
                count++;
        }
        list.add(count);
        for (int i =0; i< customers.length(); i++){
            overallMin = Math.min(overallMin, count);
            if (customers.charAt(i) == 'Y'){
                count--;
            }
            else {
                count++;
            }
            list.add(count);
        }
        overallMin = Math.min(overallMin, count);
        System.out.println(list.toString());
        return list.indexOf(overallMin);
    }

    public static void main(String[] args) {
        String s = "NNNNN";
        System.out.println(bestClosingTime(s));
    }
}
