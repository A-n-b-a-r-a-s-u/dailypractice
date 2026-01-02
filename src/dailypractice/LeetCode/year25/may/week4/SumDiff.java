package dailypractice.LeetCode.year25.may.week4;

public class SumDiff {
    public static int differenceOfSums(int n, int m) {
        int res, num1 = 0, num2 = 0;
        for (int i =1; i<=n; i++){
            if (i % m == 0)
                num2 += i;
            else
                num1+=i;
        }
        res = num1 - num2;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(differenceOfSums(5, 1));;
    }
}
