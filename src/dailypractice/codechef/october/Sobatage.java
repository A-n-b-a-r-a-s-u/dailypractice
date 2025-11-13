package dailypractice.codechef.october;

import java.util.Arrays;
import java.util.Scanner;

public class Sobatage {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] ans = {250, 375, 509, 12};
        System.out.println(rank(150,1,ans));


    }

    public static int rank( int X, int K, int[] A){
        Arrays.sort(A);
        int N = A.length;
        for (int i = 0; i < N / 2; i++) {
            int temp = A[i];
            A[i] = A[N - 1 - i];
            A[N - 1 - i] = temp;
        }

        // Sabotage top K opponents (set to 0)
        for (int i = 0; i < K && i < N; i++) {
            A[i] = 0;
            X += 100;
        }

        // Count how many have score > X
        int better = 0;
        for (int score : A) {
            if (score > X) better++;
        }

        int rank = better + 1;
        return  rank;
    }
}
