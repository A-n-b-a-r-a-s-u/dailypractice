package dailypractice.LeetCode.year25.april.week4;

import java.util.HashMap;

public class LargestGroup {
    public static int countLargestGroup(int n) {
        int ans =0;
        int largest =0;
        HashMap<Integer, Integer> group = new HashMap<>();
        int current;
        for (int i =1; i<= n; i++){
            current = i < 9 ? i : sumOfDigits(i);
            group.put(current, group.getOrDefault(current, 0) + 1);
            if (largest < group.get(current)){
                largest = group.get(current);
            }
        }
        for (int each: group.values()){
            if (largest == each){
                ans++;
            }
        }
        return ans;
    }
    static int sumOfDigits(int data){
        int sum = 0;
        while (data > 0){
            sum += data % 10;
            data /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(countLargestGroup(13));

    }
}
