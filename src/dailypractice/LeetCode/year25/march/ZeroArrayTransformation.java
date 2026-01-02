package dailypractice.LeetCode.year25.march;

public class ZeroArrayTransformation {
    public int minZeroArray(int[] nums, int[][] queries) {
        for (int i =0; i< queries.length; i++){
            if(isAllZero(nums)){
                return 0;
            }
            int tillTraverse = queries[i][1];
            int detection = queries[i][2];
            for (int j=queries[i][0];j<= tillTraverse; j++){
                if (nums[j] == 0){
                    continue;
                }
                else if (nums[j] - detection >= 0) {
                    nums[j] = nums[j] - detection;
                }
                else {
                    nums[j] = 0;
                }
            }
            if (isAllZero(nums)){
                return i+1;
            }
        }

        return -1;
    }

    public boolean isAllZero(int[] nums){
        int len = nums.length;
        for (int k =0; k< len; k++){
            if (nums[k] > 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] n = {8,4};
        int[][] q = {{0,1,5},{1,1,5},{1,1,3},{1,1,4},{0,0,3},{1,1,4},{0,1,2},{1,1,3},{1,1,1}};

        ZeroArrayTransformation z = new ZeroArrayTransformation();

        System.out.println(z.minZeroArray(n,q));
    }
}
