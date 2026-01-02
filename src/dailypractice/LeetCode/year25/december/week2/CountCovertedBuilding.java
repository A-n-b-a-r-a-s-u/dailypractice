package dailypractice.LeetCode.year25.december.week2;

import java.util.HashMap;
import java.util.TreeSet;

public class CountCovertedBuilding {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int ans = 0;
        HashMap<Integer, TreeSet<Integer>> rowToCol = new HashMap<>();
        HashMap<Integer, TreeSet<Integer>> colToRow = new HashMap<>();

        for (int[] build : buildings){
            int x = build[0];
            int y = build[1];
            rowToCol.computeIfAbsent(x, k -> new TreeSet<>()).add(y);
            colToRow.computeIfAbsent(y, k -> new TreeSet<>()).add(x);
        }

        for (int[] build : buildings){
            int x = build[0];
            int y = build[1];

            TreeSet<Integer> row = colToRow.get(y);
            TreeSet<Integer> col = rowToCol.get(x);

            Integer right = row.higher(x);
            Integer left = row.lower(x);
            Integer up = col.higher(y);
            Integer down = col.lower(y);

            if (right != null && left != null && up != null && down != null)
                ans++;
        }


        return ans;
    }
    public static void main(String[] args) {

    }
}
