package dailypractice.LeetCode.march;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int highest = 0;
        for (int cand: candies){
            if (highest < cand){
                highest = cand;
            }
        }
        for (int cand:candies){
            if (cand + extraCandies >= highest){
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] c ={2,3,5,1,3};
        List<Boolean> a = kidsWithCandies(c, 3);

        for (boolean can : a){
            System.out.print(can + " ");
        }


    }

}
