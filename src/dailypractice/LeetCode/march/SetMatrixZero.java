package dailypractice.LeetCode.march;

import java.util.HashSet;

public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rowList = new HashSet<>();
        HashSet<Integer> columnList = new HashSet<>();
        for (int m =0; m< matrix.length; m++){
            for (int n=0; n< matrix[0].length; n++){
                if (matrix[m][n] == 0){
                    rowList.add(m);
                    columnList.add(n);
                }
            }
        }

        for (int i =0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++){
                if (rowList.contains(i)){
                    matrix[i][j] = 0;
                }
                if (columnList.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] ma ={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(ma);
        for (int m =0; m< ma.length; m++){
            for (int n=0; n< ma[0].length; n++){
                System.out.print(ma[m][n] + " ");
            }
            System.out.println(" ");
        }


    }
}
