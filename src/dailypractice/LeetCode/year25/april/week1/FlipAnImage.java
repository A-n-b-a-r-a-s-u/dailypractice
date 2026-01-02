package dailypractice.LeetCode.year25.april.week1;

public class FlipAnImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] ans = new int[n][n];
        for (int i =0; i<n; i++ ){
            int index =0;
            int[] curr = new int[n];
            for (int j =n-1; j >= 0; j--){
                if (image[i][j] ==1){
                    curr[index] =0;
                }
                else {
                    curr[index] = 1;
                }
                index++;
            }
            ans[i] = curr;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] im= {{1, 1, 0},{1, 0, 1},{0, 0, 0}};
        int[][] p = flipAndInvertImage(im);
        for (int i =0; i< im.length; i++){
            for (int j =0; j< im.length; j++){
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }

    }
}
