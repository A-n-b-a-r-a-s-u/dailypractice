package dailypractice.LeetCode.november.week3;

public class OnesAtleastK {

    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        for (int i : nums){
            if ( i == 1){
                if (count > 0)
                    return false;
                count = k;
            }
            else
                count--;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
