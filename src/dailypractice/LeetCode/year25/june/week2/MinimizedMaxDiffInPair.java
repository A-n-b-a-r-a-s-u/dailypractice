package dailypractice.LeetCode.year25.june.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MinimizedMaxDiffInPair {
    public static int minimizeMax(int[] nums, int p) {

        if (p ==0) return 0;
        int ans =0;
        Arrays.sort(nums);
        for (int m: nums){
            System.out.print(m + " ");
        }
        System.out.println();

        ArrayList<Integer> differeceList = new ArrayList<>();

        for (int i =0; i< nums.length-1; i++){
            differeceList.add(Math.abs(nums[i] - nums[i +1]));
        }
        differeceList.sort(Comparator.naturalOrder());

        for (int m: differeceList){
            System.out.print(m + " ");
        }
        System.out.println();
        ans = differeceList.get(p-1);
        return ans;
    }

    public static void main(String[] args) {
        int[] n = {3,4,2,3,2,1,2};
        System.out.println(minimizeMax(n,3));;
    }
}

/*

        public static int minimizeMax(int[] nums, int p) {
        int ans =0;
        Arrays.sort(nums);
        ArrayList<Integer> nu = new ArrayList<>();
        for (int num : nums){
            nu.add(num);
        }

        for (int j : nu){
            System.out.print(j + " ");
        }
        System.out.println();
        // used to remove duplicate values in array
        for (int i =0; i< nu.size()-1; i++){
            if (p <= 0){
                break;
            }

            if (nu.get(i) == nu.get(i + 1)){
                nu.remove(i+1);
                nu.remove(i);
                p--;
            }
        }

        for (int j : nu){
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("p  - "+ p);

        for (int i =0; i< nu.size()-1; i++){
            if (p <= 0) break;
            int diff = Math.abs(nu.get(0) - nu.get(1));
            ans = Math.max(ans, diff);
            nu.remove(1);
            nu.remove(0);
            p--;
        }

        return ans;
    }
 */