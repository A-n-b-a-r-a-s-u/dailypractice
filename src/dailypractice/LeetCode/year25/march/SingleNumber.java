package dailypractice.LeetCode.year25.march;

import java.util.ArrayList;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        ArrayList<Integer> checkNumber = new ArrayList<>();
        int res = 0;
        for (int num: nums){
            if (checkNumber.contains(num)){
                checkNumber.remove(checkNumber.indexOf(num));
            }
            else {
                checkNumber.add(num);
            }
        }
        res = checkNumber.getFirst();
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(singleNumber(a));
    }
}
