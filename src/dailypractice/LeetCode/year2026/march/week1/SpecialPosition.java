package dailypractice.LeetCode.year2026.march.week1;

public class SpecialPosition {
    public int numSpecial(int[][] mat) {
        int ans =0;
        int m = mat.length;
        int n = mat[0].length;
        for (int i =0; i<m; i++){
            for (int j = 0; j< n; j++){
                if (mat[i][j] == 1){
                    ans += isSpecial(i, j, mat );
                    break;
                }
            }
        }

        return ans;
    }

    public int  isSpecial(int i, int j, int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        for (int l = 0; l< m; l++){
            if (l == i){
                continue;
            }
            if (mat[l][j] == 1){
                return 0;
            }
        }

        for (int k = 0; k< n; k++){
            if (k == j){
                continue;
            }
            if (mat[i][k] == 1){
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {

    }
}
