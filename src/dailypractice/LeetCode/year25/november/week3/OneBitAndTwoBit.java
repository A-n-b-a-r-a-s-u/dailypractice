package dailypractice.LeetCode.year25.november.week3;

public class OneBitAndTwoBit {
    public boolean isOneBitCharacter(int[] bits) {
        int start = 0;
        boolean isOneBit = true;
        while (start < bits.length){
            if (bits[start] == 1){
                isOneBit = false;
                start++;
            }
            else
                isOneBit = true;
            start++;
        }

        return isOneBit;
    }

    public static void main(String[] args) {

    }
}
