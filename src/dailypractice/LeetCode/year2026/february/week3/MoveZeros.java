package dailypractice.LeetCode.year2026.february.week3;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int left =0;
        int right = 0;
        while (right < nums.length){
            if (nums[right] == 0){
                right++;
                continue;
            }
            nums[left] = nums[right];
            left++;
            right++;
        }
        while (left < nums.length){
            nums[left] = 0;
            left++;
        }

    }

    public static void main(String[] args) {

    }
}
