package dailypractice.LeetCode.year25.october.week2;

public class MysticDungen {
    public static int maximumEnergy(int[] energy, int k) {
        int ans = Integer.MIN_VALUE;
        int n = energy.length;
        int[] updatedArray = new int[n];

        for (int i = n-k; i < n; i++){
            updatedArray[i] = energy[i];
            ans = Math.max(ans, updatedArray[i]);
        }
        for (int j = n-k-1; j >= 0; j-- ){
            updatedArray[j] = energy[j] + updatedArray[j+k];
            ans = Math.max(updatedArray[j], ans);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] e = {-2,-3,-1};
        System.out.println(maximumEnergy(e,2));
    }
}

/*
public static int maximumEnergy(int[] energy, int k) {
        int ans = Integer.MIN_VALUE;
        for (int i =0; i< energy.length; i++){
            int cur = 0;
            int j = i;
            while (j < energy.length){
                cur += energy[j];
                j += k;
            }
            ans = Math.max(ans, cur);
        }

        return ans;
    }
 */