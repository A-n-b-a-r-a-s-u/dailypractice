package dailypractice.LeetCode.year25.august.week5;

import java.util.HashSet;
import java.util.Set;

public class ValidSuduko {

    public static boolean isValidSudoku(char[][] board) {
        int rowLimit = board.length, columnLimit = board[0].length;
        int row = 0, column = 0;

        //For Row Checking
        while (row < rowLimit){
            Set<Character> numbers = new HashSet<>();
            for (int j = 0; j< columnLimit; j++){
                if (numbers.contains(board[row][j])){
                    System.out.println("In Row " + row + j);
                    return false;
                } else if (board[row][j] == '.') {
                    continue;
                } else {
                    numbers.add(board[row][j]);
                }
            }
            row++;
        }

        //For Column Checking
        while (column < columnLimit){
            Set<Character> numbers = new HashSet<>();
            for (int j = 0; j< rowLimit; j++){
                if (numbers.contains(board[j][column])){
                    System.out.println("In Column");
                    return false;
                }else if (board[j][column] == '.') {
                    continue;
                }
                else {
                    numbers.add(board[j][column]);
                }
            }
            column++;
        }

        int rStart =0, cStart = 0;
        for (int i = 0; i< 9; i++){
            Set<Character> numbers = new HashSet<>();
            for (int k = rStart; k< rStart + 3; k++){
                for (int l = cStart; l< cStart+3; l++){
                    if (numbers.contains(board[k][l])){
                        return false;
                    }
                    else if (board[k][l] == '.') {
                        continue;
                    }
                    else {
                        numbers.add(board[k][l]);
                    }
                }
            }
            cStart += 3;
            if (cStart >= columnLimit){
                cStart = 0;
                rStart +=3;
            }

        }

        return true;
    }
    public static void main(String[] args) {
        char[][] s = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(s));

    }
}
