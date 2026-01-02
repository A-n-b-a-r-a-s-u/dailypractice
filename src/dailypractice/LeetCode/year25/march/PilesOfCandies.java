package dailypractice.LeetCode.year25.march;

public class PilesOfCandies {
    public static int maximumCandies(int[] candies, long k) {
        int small =Integer.MAX_VALUE;
        int total =0;
        for (int cand : candies) {
            if (small > cand){
                small = cand;
            }
            total += cand;
        }

        if (total < k){
            return 0;
        }
        int res = (int) (total/k);
        return res;
    }

    public static void main(String[] args) {
        int[] can = {2,5};
        int k = 11;
        System.out.println(maximumCandies(can, k));

    }
}
