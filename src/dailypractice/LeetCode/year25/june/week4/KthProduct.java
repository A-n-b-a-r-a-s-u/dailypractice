package dailypractice.LeetCode.year25.june.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthProduct {
    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long ans = 0;
        List<Long> res = new ArrayList<>();
        for (int i = 0; i< nums1.length; i++){
            for (int j =0; j< nums2.length; j++){
                res.add((long) nums1[i]* nums2[j]);
            }
        }
        Collections.sort(res);
        for (long n: res){
            System.out.print(n + " ");
        }
        System.out.println();
        return res.get((int) k-1);
    }

    public static void main(String[] args) {
        int[] n1 = {-2,-1,0,1,2};
        int[] n2 = {-3,-1,2,4,5};
        System.out.println(kthSmallestProduct(n1, n2, 3));

    }
}
