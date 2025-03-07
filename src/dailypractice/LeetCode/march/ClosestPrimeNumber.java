package dailypractice.LeetCode.march;

import java.util.ArrayList;

public class ClosestPrimeNumber {
    public static int[] closestPrimes(int left, int right) {
        int[] ans = {-1, -1};
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = left; i<= right; i++) {
            if (isPrime(i)){
                primeList.add(i);
            }
        }
        for (int i =0; i< primeList.size(); i++) {
            System.out.println(primeList.get(i));
        }
        System.out.println(primeList.size());

        if (primeList.size() <= 1) {
            return ans;
        }
        else {
            int smallest =Integer.MAX_VALUE;
            for (int i =1; i< primeList.size(); i++) {
                int num1 = primeList.get(i-1);
                int num2 = primeList.get(i);
                if (smallest > num2- num1){
                    smallest = num2 - num1;
                    ans[0] = num1;
                    ans[1] = num2;
                }
            }
            return ans;
        }
    }

    public static boolean isPrime(int num){
        if (num <= 1) return false;
        for (int i = 2; i<= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = closestPrimes(4, 6);
        for (int j =0; j <=1; j++) {
            System.out.println(a[j]);
        }

    }
}
