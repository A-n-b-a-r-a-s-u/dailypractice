package dailypractice.LeetCode.year2026.january.week1;

import java.util.HashSet;

public class RepeatedNum {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();

        for (int num : nums) {
            if (!unique.contains(num)) {
                unique.add(num);
            } else {
                return num;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
