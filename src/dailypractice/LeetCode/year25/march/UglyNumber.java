package dailypractice.LeetCode.year25.march;

public class UglyNumber {
    public boolean isUgly(int n) {
        int[] factors = {2,3,5};
        if (n <= 0) return false;
        for (int fact: factors){
            while (n % fact ==0){
                n /= fact;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        System.out.println(u.isUgly(8));
    }
}


/*
public boolean isUgly(int n) {
        List<Integer> divisors = new ArrayList<>();
        if (n <= 0) return false;
        for (int i =1; i <= n; i++){
            if (n % i == 0) divisors.add(i);
        }
        for (int div: divisors){
            if (isPrime(div)){
                if (div == 2 || div == 3 || div == 5) {

                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isPrime(int num){
        if (num <= 1) return false;
        for (int j=2; j< Math.sqrt(num); j++){
            if (num % j == 0) return false;
        }
        return true;
    }
 */