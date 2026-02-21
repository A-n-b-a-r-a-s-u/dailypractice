package dailypractice.LeetCode.year2026.february.week3;

import java.util.ArrayList;

public class CountBinarySubString {
    public static int countBinarySubstrings(String s) {
        int ans =0;
        ArrayList<Integer> binaryCount = new ArrayList<>();
        int count =1;
        for (int i = 1; i< s.length(); i++){
            if (s.charAt(i-1) != s.charAt(i)){
                binaryCount.add(count);
                count = 1;
            }
            else {
                count++;
            }
        }
        binaryCount.add(count);
        System.out.println(binaryCount);

        for (int j =1; j< binaryCount.size(); j++){
            ans += Math.min(binaryCount.get(j), binaryCount.get(j-1));
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }
}
