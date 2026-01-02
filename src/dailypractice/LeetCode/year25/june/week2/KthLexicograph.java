package dailypractice.LeetCode.year25.june.week2;

import java.util.ArrayList;
import java.util.List;

public class KthLexicograph {
    public static int findKthNumber(int n, int k) {
        List ans = new ArrayList();
        int current =1;

        for (int i =0; i< n; i++){
            ans.add(current);
            if (current *10 <= n){
                current *= 10;
            }
            else {
                if (current >= n) {
                    current /= 10;
                }
                current++;
                while (current %10 == 0){
                    current /= 10;
                }
            }
        }
        return (int) ans.getLast();
    }
    public static void main(String[] args) {
        System.out.println(findKthNumber(13, 2));
    }
}
