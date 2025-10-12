package dailypractice.LeetCode.august.week4;

public class MinimumAreaOfOnes {
    public static int minimumArea(int[][] grid) {
        int ans ;
        int row = grid.length, column = grid[0].length;
        int rowStart = 0, rowEnd = 0;
        int columnStart = 0, columnEnd = 0;

        boolean flag = true;
        int i =0;
        while (flag && i < row){
            for (int j = 0; j< column; j++){
                if (grid[i][j] ==1){
                    rowStart = i;
                    flag = false;
                    break;
                }
            }
            i++;
        }

        flag = true;
        i = row-1;
        while (flag && i > 0){
            for (int j = 0; j< column; j++){
                if (grid[i][j] ==1){
                    rowEnd = i;
                    flag = false;
                    break;
                }
            }
            i--;
        }

        flag = true;
        i = 0;
        while (flag && i < column){
            for (int j = 0; j < row; j++){
                if (grid[j][i] == 1){
                    columnStart = i;
                    flag = false;
                    break;
                }
            }
            i++;
        }

        flag = true;
        i = column-1;
        while (flag && i > 0){
            for (int j = 0; j< row; j++){
                if (grid[j][i] ==1){
                    columnEnd = i;
                    flag = false;
                    break;
                }
            }
            i--;
        }

        ans = (rowEnd - rowStart +1) * (columnEnd- columnStart +1);
        return ans;
    }

    public static void main(String[] args) {
        int[][] g = {{1,0},{0,0}};
        System.out.println(minimumArea(g));
    }
}
