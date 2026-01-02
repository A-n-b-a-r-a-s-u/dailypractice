package dailypractice.LeetCode.year25.october.week2;

import java.util.Arrays;

public class SpellsAndPotions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i< spells.length; i++){
            int n  = midPoint(potions, spells[i], success );
            if (n != -1)
                ans[i] = potions.length - n;
        }

        return ans;
    }
    public static int midPoint (int[] potions, int spell, long success){
        int start = 0, end = potions.length-1;
        int mid ;
        int index = -1;
        while (start <= end){
            mid = ((end - start) /2) + start;
            if ((long) potions[mid] * spell >= success ){
                index = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] p = {5,1,3};
        int[] s = {1,2,3,4,5};
        int[] a = successfulPairs(p,s,7);
        System.out.println(Arrays.toString(a));
    }
}
