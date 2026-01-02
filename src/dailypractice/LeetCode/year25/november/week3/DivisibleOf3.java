package dailypractice.LeetCode.year25.november.week3;

public class DivisibleOf3 {
    public int minimumOperations(int[] nums) {
        int ans = 0;

        for (int num : nums){
            if ( num % 3 != 0)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
