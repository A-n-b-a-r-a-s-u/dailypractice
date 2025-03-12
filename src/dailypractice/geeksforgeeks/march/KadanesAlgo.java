package dailypractice.geeksforgeeks.march;

public class KadanesAlgo {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        for (int i =0; i< arr.length; i++){
            sum += arr[i];
            if (maxSum < sum) maxSum = sum;
            if (sum < 0) sum =0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] a= {-2,-4};
        System.out.println(maxSubarraySum(a));
    }
}
