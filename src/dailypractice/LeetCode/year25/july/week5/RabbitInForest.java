package dailypractice.LeetCode.year25.july.week5;

import java.util.HashMap;

public class RabbitInForest {
    public static int numRabbits(int[] answers) {
        int ans = 0;
        HashMap<Integer, Integer> rabbitCount = new HashMap<>();

        for (int answer : answers) {
            rabbitCount.put(answer, rabbitCount.getOrDefault(answer, 0) + 1);
        }
        for (int element : rabbitCount.keySet()){
            int group = element + 1;
            int count = 0;
            while (rabbitCount.get(element) >= group){
                rabbitCount.put(element, rabbitCount.get(element) - group);
                count++;
            }
            count += rabbitCount.get(element) > 0 ? 1 : 0;
            ans += count * group;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {1,1,2};
        System.out.println(numRabbits(n));

    }
}
