package dailypractice.LeetCode.year25.march;


public class RecolurConsecutiveBlocks {
    public static int minimumRecolors(String blocks, int k) {
        int ans =0;
        int WCount =0;

        for (int i =0; i< k; i++) {
            if (blocks.charAt(i) == 'W') WCount++;
        }
        ans = WCount;
        for (int j = k; j< blocks.length(); j++){
            if (blocks.charAt(j) == 'W') WCount++;
            if (blocks.charAt( j-k) == 'W') WCount--;

            ans = Math.min(ans, WCount);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBWBBBW", 2));

    }
}
