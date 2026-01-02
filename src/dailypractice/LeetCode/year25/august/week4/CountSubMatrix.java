package dailypractice.LeetCode.year25.august.week4;

public class CountSubMatrix {

    public static int numSubmat(int[][] mat) {
        int ans = 0;
        int m = mat.length;
        int n = mat[0].length;
        int[][] dynamic = new int[m+1][n+1];
        for (int i = 0; i< m; i++ ) {
            for (int j = 0; j< n; j++){
                if (mat[i][j] == 1){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,0,1},{1,1,0},{1,1,0}};
        System.out.println(numSubmat(mat));

    }
}
