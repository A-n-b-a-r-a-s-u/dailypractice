package dailypractice.LeetCode.year25.march;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int x=0, y=0;
        for (int i =0; i< nums.length; i++) {
            if (nums[y] == 0 ){
                y++;
                continue;
            }
            nums[x] = nums[y];
            x++;
            y++;
        }
        for (int j =x; j< nums.length; j++){
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        int[] n = {0,1,0,3,12};
        moveZeroes(n);
        for (int i =0; i<n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
}
