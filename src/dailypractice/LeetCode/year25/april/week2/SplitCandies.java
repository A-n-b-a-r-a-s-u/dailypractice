package dailypractice.LeetCode.year25.april.week2;

import java.util.Arrays;

public class SplitCandies {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = new int[2];
        int aliceSum = sum(aliceSizes);
        int bobSum = sum(bobSizes);
        int mid = (Math.max(aliceSum, bobSum) - Math.min(aliceSum, bobSum)) /2 + Math.min(aliceSum, bobSum);
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        System.out.println(mid);
        if (aliceSum < bobSum){
            ans[0] = aliceSizes[0];
            int required = mid - aliceSizes[0];
            System.out.println(required);
            for (int req: bobSizes){
                if (req == required){
                    ans[1] = req;
                    return ans;
                }
            }
        }
        if (bobSum < aliceSum){
            ans[0] = bobSizes[0];
            int required = mid - bobSizes[0];
            for (int req: aliceSizes){
                if (req == required){
                    ans[1] = req;
                    return ans;
                }
            }
        }
        return ans;
    }
    int sum(int[] arr){
        int sum =0;
        for (int n : arr){
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        SplitCandies s = new SplitCandies();
        int[] a ={1,2};
        int[] b = {2,3};
        int[] res = s.fairCandySwap(a,b);
        System.out.print(res[0] + " " + res[1]);

    }
}
