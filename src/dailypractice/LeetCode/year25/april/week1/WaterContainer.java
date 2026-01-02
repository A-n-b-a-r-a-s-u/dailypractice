package dailypractice.LeetCode.year25.april.week1;

public class WaterContainer {
    public static int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        int left = 0, right = height.length-1;
        while (left < right){
            area = Math.max(area, (right - left) * Math.min(height[left], height[right] ));
            if (height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }

        }
        return area;
    }

    public static void main(String[] args) {
        int[] h = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(h));

    }
}

/*
public static int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int start , end ;
        int diff ;
        for (int i =0; i< height.length-1; i++){
            for (int j =i+1; j< height.length; j++){
                start = height[i];
                end = height[j];
                diff = j - i;
                ans = Math.max(ans, diff * Math.min(start, end));
            }
        }

        return ans;
    }
 */
