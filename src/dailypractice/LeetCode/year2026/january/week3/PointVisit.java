package dailypractice.LeetCode.year2026.january.week3;

public class PointVisit {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans =0;
        int[] previous ;
        int[] current;
        previous = points[0];
        for (int i = 1; i< points.length; i++){
            current = points[i];
            int inc = 0;
            while (previous[0] != current[0] || previous[1] != current[1]){
                if (previous[0] != current[0]){
                    int diff = current[0] - previous[0];
                    previous[0] += diff;
                    inc = Math.max(Math.abs(diff), inc);
                }
                if (previous[1] != current[1]) {
                    int diff = current[1] - previous[1];
                    previous[1] += diff;
                    inc = Math.max(Math.abs(diff), inc);
                }
                ans += inc;
            }
            previous = points[i];
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
