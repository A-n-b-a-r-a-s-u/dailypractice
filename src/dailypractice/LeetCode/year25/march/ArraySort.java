package dailypractice.LeetCode.year25.march;

public class ArraySort {
    public static void sortColors(int[] nums) {

        for(int i =0; i< nums.length; i++){
            for (int j=i +1; j< nums.length; j++){
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] n = {2,0,2,1,1,0};
        sortColors(n);
        for (int i =0; i< n.length; i++){
            System.out.print(n[i]);
        }
        System.out.println("Over...");

    }
}
