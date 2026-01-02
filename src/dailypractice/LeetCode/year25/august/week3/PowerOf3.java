package dailypractice.LeetCode.year25.august.week3;

public class PowerOf3 {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n%3 == 0) n/=3;
        if (n ==1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}
