package dailypractice.LeetCode.year25.june.week2;

import java.util.ArrayList;
import java.util.List;

public class LexicographicNumber {
    public static List<Integer> lexicalOrder(int n) {
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
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> res = lexicalOrder(13);
        for (int i =0; i< res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
    }
}
