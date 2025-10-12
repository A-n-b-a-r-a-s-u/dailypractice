package dailypractice.LeetCode.october.week2;

import java.util.Arrays;

public class WizardAndPortion {
    public static long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] done = new long[n + 1];

        for (int k : mana) {
            for (int i = 0; i < n; ++i) {
                done[i + 1] = Math.max(done[i + 1], done[i]) + (long) k * skill[i];
            }
            System.out.println(Arrays.toString(done));
            for (int i = n - 1; i > 0; --i) {
                done[i] = done[i + 1] - (long) k * skill[i];
            }
            System.out.println(Arrays.toString(done) + "\n");
        }

        return done[n];
    }

    public static void main(String[] args) {
        int[] s = {1,5,2,4};
        int[] m ={5,1,4,2};
        System.out.println("Mana : "+Arrays.toString(m));
        System.out.println("Skill : " + Arrays.toString(s) + "\n");
        System.out.println(minTime(s, m));
    }
}
