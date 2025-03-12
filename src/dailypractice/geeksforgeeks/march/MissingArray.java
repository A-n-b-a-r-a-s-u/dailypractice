package dailypractice.geeksforgeeks.march;

public class MissingArray {
    int missingNumber(int arr[]) {
        int ans =0;
        int n = arr.length;
        int total = factorial(n);
        for (int i =0; i< n;i++) {
            if (arr[i] <= n){
                ans += arr[i];
            }
        }

        if (total == ans){
            return  n+1;
        }
        return (total - ans);
    }
    public int factorial(int num){
        int result =0;
        for (int i=0; i<= num; i++){
            result+= i;
        }
        return result;
    }



    public static void main(String[] args) {
        MissingArray ma = new MissingArray();
        int[] a = {2};
        System.out.println(ma.missingNumber(a));

    }
}
