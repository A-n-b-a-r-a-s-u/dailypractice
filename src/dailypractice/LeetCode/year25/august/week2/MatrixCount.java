package dailypractice.LeetCode.year25.august.week2;

public class MatrixCount {
    public static int countNegatives(int[][] grid) {
        int ans = 0;

        for (int[] traverse : grid) {
            for (int k : traverse) {
                if (k < 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}