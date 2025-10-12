package dailypractice.LeetCode.august.week5;

import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalMatrix {

    public static int[][] sortMatrix(int[][] grid) {
        int row = grid.length, column = grid[0].length;
        int[][] ans = new int[row][column];
        int rowOriginal = 0,  columnOriginal = grid[0].length-1;
        for (int i = 0; i< grid.length-1; i++){
            ArrayList<Integer> curList = new ArrayList<>();
            int rowCopy = rowOriginal;
            int columnCopy = columnOriginal;
            while (rowCopy < row && columnCopy < column){
                curList.add(grid[rowCopy++][columnCopy++]);
            }
            curList.sort((a, b) -> a - b);

            int index = 0;
            rowCopy = rowOriginal;
            columnCopy = columnOriginal;
            while (index < curList.size()){
                ans[rowCopy++][columnCopy++] = curList.get(index++);
            }

            columnOriginal--;
        }

        columnOriginal = 0;
        for (int i = 0; i< grid.length; i++){
            ArrayList<Integer> curList = new ArrayList<>();
            int rowCopy = rowOriginal;
            int columnCopy = columnOriginal;
            while (rowCopy < row && columnCopy < column){
                curList.add(grid[rowCopy++][columnCopy++]);
            }
            curList.sort((a, b) -> b - a);

            int index = 0;
            rowCopy = rowOriginal;
            columnCopy = columnOriginal;
            while (index < curList.size()){
                ans[rowCopy++][columnCopy++] = curList.get(index++);
            }

            rowOriginal++;
        }


        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,7,3},{9,8,2},{4,5,6}};
        int[][] anser = sortMatrix(grid);

        for (int[] n : anser){
            System.out.println(Arrays.toString(n));
        }
    }
}
