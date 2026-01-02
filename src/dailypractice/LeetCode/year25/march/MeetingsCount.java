package dailypractice.LeetCode.year25.march;


import java.util.Arrays;
import java.util.Comparator;

public class MeetingsCount {
    public static int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int preEnd = 0;

        for (int[] meet: meetings){
            int start = Math.max(meet[0], preEnd+1 );
            int length = meet[1] - start +1;
            days -= Math.max(length,0);
            preEnd = Math.max(preEnd+1,meet[1] );
        }
        return days;
    }

    public static void main(String[] args) {
        int[][] m ={{2,4}, {1,3}};
        int r= countDays(5, m);
        System.out.println(r);

    }
}

/**
 * public static int countDays(int days, int[][] meetings) {
 *         HashSet<Integer> map = new HashSet<>();
 *         for (int[] a : meetings){
 *             for (int j = a[0]; j<= a[1]; j++){
 *                 map.add(j);
 *             }
 *         }
 *         result = days - map.size();
 *         return result;
 *     }
 */
