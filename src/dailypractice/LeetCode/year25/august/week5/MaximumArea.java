package dailypractice.LeetCode.year25.august.week5;

public class MaximumArea {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0;
        int maxDiagonalSq = 0;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0], w = dimensions[i][1];
            int curDiagonalSq = l * l + w * w;
            int curArea = l * w;

            if (curDiagonalSq > maxDiagonalSq ||
                    (curDiagonalSq == maxDiagonalSq && curArea > maxArea)) {
                maxDiagonalSq = curDiagonalSq;
                maxArea = curArea;
                ans = curArea;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
