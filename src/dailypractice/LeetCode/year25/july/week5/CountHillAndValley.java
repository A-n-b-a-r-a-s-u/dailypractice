package dailypractice.LeetCode.year25.july.week5;

public class CountHillAndValley {
    public static int countHillValley(int[] nums) {
        int ans = 0;
        for (int i = 1; i< nums.length-1; i++){
            int prevIndex = i-1, nextIndex = i+1;
            if (nums[i] == nums[i-1]){
                continue;
            }
            while (prevIndex >= 0 && nums[prevIndex] == nums[i]){
                prevIndex--;
            }
            while (nextIndex < nums.length && nums[nextIndex] == nums[i]){
                nextIndex++;
            }
            if (prevIndex < 0 || nextIndex >= nums.length){
                continue;
            }

            if (nums[prevIndex] < nums[i]  && nums[i] > nums[nextIndex]){
                ans++;
            }
            else if (nums[prevIndex] > nums[i]  && nums[i] < nums[nextIndex]){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {2,4,1,1,6,5};
        System.out.println(countHillValley(n));
    }
}
