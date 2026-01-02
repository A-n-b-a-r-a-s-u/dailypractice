package dailypractice.LeetCode.year25.november.week3;

import java.util.ArrayList;
import java.util.List;

public class DivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int current = 0;

        for (int bit : nums) {
            current = (current * 2 + bit) % 5;
            ans.add(current == 0);
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
