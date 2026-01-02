package dailypractice.LeetCode.year25.september.week4;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int ans = Integer.MIN_VALUE;
        ans = triangle.getFirst().getFirst();
        int index = 0;
        for (int i =1; i< triangle.size(); i++){
            if (triangle.get(i).get(index) > triangle.get(i).get(index + 1))
                index++;
            ans += triangle.get(i).get(index);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> l = Arrays.asList(
                Arrays.asList(-1),
                Arrays.asList(2, 3),
                Arrays.asList(1, -1, 3));
        System.out.println(minimumTotal(l));
    }
}
