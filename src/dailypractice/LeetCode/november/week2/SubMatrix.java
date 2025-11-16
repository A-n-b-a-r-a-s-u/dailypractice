package dailypractice.LeetCode.november.week2;

public class SubMatrix {
    public static int[][] rangeAddQueries(int n, int[][] queries) {

        int[][] ans = new int[n][n];
        for (int[] query : queries){
            int rowStart = query[0];
            int rowEnd = query[2];
            int columnStart = query[1];
            int columnEnd = query[3];

            for (int i = rowStart; i <= rowEnd ; i++){
                for (int j = columnStart; j <= columnEnd; j++ ){
                    ans[i][j]++;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] q = {{3,1,7,3},
                {7,5,7,8},
                {4,12,6,12},
                {2,8,6,11},
                {9,11,10,11},
                {9,3,11,11},
                {0,12,10,12},
                {10,5,11,12},
                {4,7,6,12},
                {0,2,9,6},
                {12,7,12,11},
                {2,7,3,8},
                {2,9,6,12},
                {10,7,10,12},
                {11,6,11,7},
                {3,2,12,9}}
                ;

        int[][] a = rangeAddQueries(13, q);
        for (int i = 0; i < a.length ; i++){
            for (int j = 0; j < a[0].length; j++ ){
                System.out.print(a[i][j] + " ");;
            }
            System.out.println();
        }
    }
}
