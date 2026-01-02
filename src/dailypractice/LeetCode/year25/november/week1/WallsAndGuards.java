package dailypractice.LeetCode.year25.november.week1;

public class WallsAndGuards {

    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for (int[] guard : guards) grid[guard[0]][guard[1]] = 1;
        for (int[] wall : walls) grid[wall[0]][wall[1]] = 2;

        for (int[] guard : guards) {
            int row = guard[0];
            int col = guard[1];

            for (int r = row - 1; r >= 0; r--) {
                if (grid[r][col] == 1 || grid[r][col] == 2) break;
                if (grid[r][col] == 0) grid[r][col] = 3;
            }

            for (int r = row + 1; r < m; r++) {
                if (grid[r][col] == 1 || grid[r][col] == 2) break;
                if (grid[r][col] == 0) grid[r][col] = 3;
            }

            for (int c = col - 1; c >= 0; c--) {
                if (grid[row][c] == 1 || grid[row][c] == 2) break;
                if (grid[row][c] == 0) grid[row][c] = 3;
            }

            for (int c = col + 1; c < n; c++) {
                if (grid[row][c] == 1 || grid[row][c] == 2) break;
                if (grid[row][c] == 0) grid[row][c] = 3;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] g = {{1,1}} ;
        int[][] w = {{0,1},{1,0},{2,1}} ;

        System.out.println(countUnguarded(3,3, g,w));
    }
}

/*
public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int ans = 0;
        int[][] matrix = new int[m][n];
        for (int[] wall : walls){
            matrix[wall[0]][wall[1]] = 1;
        }

        for (int[] guard : guards){
            int x = guard[0];
            int y = guard[1];
            int length = n ;
            int height = m  ;
            while (y < length){
                if (matrix[x][y] == 1){
                    break;
                }
                matrix[x][y++] = 2;
            }
            y = guard[1];
            while (y >= 0){
                if (matrix[x][y] == 1){
                    break;
                }
                matrix[x][y--] = 2;
            }
            x = guard[0];
            y = guard[1];
            while (x < height){
                if (matrix[x][y] == 1){
                    break;
                }
                matrix[x++][y] = 2;
            }
            x = guard[0];
            while (x >= 0){
                if (matrix[x][y] == 1){
                    break;
                }
                matrix[x--][y] = 2;
            }
        }
        for (int i = 0; i< m; i++){
            for (int j = 0; j< n; j++){
                if (matrix[i][j] == 0){
                    ans++;
                }
            }
        }

        return ans;
    }
 */