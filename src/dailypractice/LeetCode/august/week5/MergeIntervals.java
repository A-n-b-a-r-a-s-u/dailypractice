package dailypractice.LeetCode.august.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int[] inter : intervals){
            if (ans.isEmpty()){
                ans.add(inter);
                continue;
            }
            int[] cmp1 = ans.getLast();
            if (cmp1[1] >= inter[0]){
                int[] newint = {cmp1[0], Math.max(inter[1], cmp1[1])};
                ans.removeLast();
                ans.add(newint);
            }
            else {
                ans.add(inter);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] inter = {{1,3},{2,6},{8,10},{15,18}};
        int[][] n = merge(inter);
        for (int[] nu: n){
            System.out.println(Arrays.toString(nu));
        }
    }
}
