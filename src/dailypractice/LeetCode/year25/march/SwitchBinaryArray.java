package dailypractice.LeetCode.year25.march;

public class SwitchBinaryArray {
    public int minOperations(int[] nums) {
        int ans =-1;
        int count =0;
        for (int i=0; i<= nums.length-3; i++) {
            if (nums[i] == 0){
                nums[i] = nums[i] == 0?1 :0;
                nums[i+1] = nums[i+1] == 0?1 :0;
                nums[i+2] = nums[i+2] == 0?1 :0;
                count++;
            }
        }
        if (isAllElemetOne(nums)){
            return count;
        }

        return ans;
    }
    public boolean isAllElemetOne(int[] number){
        for (int i=0; i< number.length; i++){
            if (number[i] == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwitchBinaryArray s = new SwitchBinaryArray();
        int[] n ={0,1,1,1};
        System.out.println(s.minOperations(n));

    }
}
