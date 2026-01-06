package dailypractice.LeetCode.year2026.january.week2;

public class MatrixMaxSum {
    public static long maxMatrixSum(int[][] matrix) {
        long sum=0, smallest = Integer.MAX_VALUE;
        int negCount = 0;
        int n = matrix[0].length;
        for (int i =0; i< n; i++){
            for (int j =0; j< n; j++){
                int num = matrix[i][j];
                sum += Math.abs(num);
                smallest = Math.min(smallest, Math.abs(num));
                if (num < 0)
                    negCount++;
            }
        }
        if (negCount % 2 != 0){
            sum -= (2 * smallest);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
