package dailypractice.LeetCode.year25.april.week1;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int ans =0;
        for (char st : stones.toCharArray()){
            if (jewels.contains(String.valueOf(st))){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String j = "z";
        String s = "ZZ";

        System.out.println(numJewelsInStones(j,s));
    }
}
