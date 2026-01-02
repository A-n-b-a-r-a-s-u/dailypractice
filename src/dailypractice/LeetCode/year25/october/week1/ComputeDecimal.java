package dailypractice.LeetCode.year25.october.week1;

import java.util.ArrayList;

public class ComputeDecimal {
    public static int[] decimalRepresentation(int n) {
        StringBuilder copy = new StringBuilder(String.valueOf(n));
        ArrayList<Integer> ans = new ArrayList<>();
        int num = 1;
        for (int i =0; i< copy.length(); i++){
            int mod = (n % 10) * num;
            if (mod != 0)
                ans.addFirst(mod);
            n /= 10;
            num *= 10;
        }

        int[] res = new int[ans.size()];
        int index = 0;
        System.out.println(ans);
        for (int a : ans){
            res[index++] = a;
            System.out.println(a);
        }
        return res;
    }


    public static void main(String[] args) {
        decimalRepresentation(102);
    }
}
