package dailypractice.LeetCode.year2026.january.week2;

public class FourDivisor {
    public static int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int n: nums){
            int temp = 0;
            int count = 0;
            for (int i = 2; i * i<= n; i++){
                if (n % i == 0){
                    int j = n/i;
                    if (i == j || count > 0){
                        temp = 0;
                        break;
                    }
                    temp += i + j + 1+ n;
                    count++;
                }
            }
            ans += temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {21,4,7};
        System.out.println(sumFourDivisors(n));

    }
}
