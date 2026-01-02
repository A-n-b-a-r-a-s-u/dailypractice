package dailypractice.LeetCode.year25.june.week2;

public class MaxDifferenceSequence {
    public static int maxDifference(String s, int k) {
        int ans =0;
        for (int i =0; i< s.length(); i++){
            int window = k;
            int[] num = new int[5];
            for (int j =i; j< window; j++){
                
                window++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        maxDifference("112233", 3);
    }
}
