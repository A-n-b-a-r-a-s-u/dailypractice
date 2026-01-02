package dailypractice.LeetCode.year25.october.week5;

public class MinimumIncrement {
    public int minNumberOperations(int[] target) {
        int ans = target[0];
        for (int i =1; i< target.length; i++){
            ans += Math.max(target[i] - target[i-1], 0);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
