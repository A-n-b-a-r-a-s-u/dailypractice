package dailypractice.LeetCode.year25.march;

import java.util.ArrayList;

public class HappyNumber {
    public static boolean isHappy(int n) {
        ArrayList<Integer> visitedNumb = new ArrayList<>();
        while (true){
            int traverseNum = n;

            n =0;
            while (traverseNum > 0){
                int num = traverseNum %10;
                num *= num;
                traverseNum /=10;
                n += num;
            }
            if (visitedNumb.contains(n)){
                return false;
            }
            visitedNumb.add(n);
            if (n == 1){
                return true;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(isHappy(2));

    }
}
