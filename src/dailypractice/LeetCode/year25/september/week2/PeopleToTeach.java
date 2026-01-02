package dailypractice.LeetCode.year25.september.week2;

import java.util.HashMap;

public class PeopleToTeach {

    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int ans = 0;
        HashMap<Integer, Integer> missingLangCnt = new HashMap<>();
        for (int[] frd : friendships){
            int[] frd1 = languages[frd[0]];
            int[] frd2 = languages[frd[1]];
            boolean flag = true;
            for (int i : frd1){
                if (!flag){
                    break;
                }
                for (int j : frd2) {
                    if (frd[i] == j) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag){
                for (int i : frd1){
                    missingLangCnt.put(i, missingLangCnt.getOrDefault(i,0) +1);
                }
                for (int j : frd2) {
                    missingLangCnt.put(j, missingLangCnt.getOrDefault(j,0) +1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
