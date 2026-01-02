package dailypractice.LeetCode.year25.august.week5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DiagonalTraversal {
    public  static int[] findDiagonalOrder(int[][] mat) {
        int size = mat.length * mat[0].length;
        int[] ans = new int[size];
        int index = 0;
        int m = 0, n = 0;
        boolean upward = true;
        while (size > 0){
            if (upward){
                if (m < 0 || n > mat[0].length){
                    m += 1;
                    upward = false;
                    size--;
                    ans[index++] = mat[m][n];
                    continue;
                }
                ans[index++] = mat[m][n];
                m--;
                n++;
            }
            else {
                if (n < 0 || m > mat.length){
                    m -= 1;
                    n += 1;
                    upward = true;
                    size--;
                    ans[index++] = mat[m][n];
                    continue;
                }
                ans[index++] = mat[m][n];
                m++;
                n--;
            }
            size--;
        }
        return ans;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        int[][] m = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[] a = findDiagonalOrder(m);
        String ab = "a";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(ab.getBytes());
        for (int an: a){
            System.out.print(an + " ");
        }


    }
}
