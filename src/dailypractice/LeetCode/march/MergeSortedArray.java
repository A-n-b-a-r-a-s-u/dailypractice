package dailypractice.LeetCode.march;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0){
            for (int j =0; j< n; j++){
                nums1[j] = nums2[j];
            }
        }
        if (n ==0)  return;
        int j =0;
        for (int i =m; i< nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] n1 = {0};
        int[] n2 = {1};
        int m = 0;
        int n = 1;
        merge(n1,m,n2,n);

        for (int i : n1){
            System.out.print(i + " ");
        }

    }
}
