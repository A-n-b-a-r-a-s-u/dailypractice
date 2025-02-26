package dailypractice.geeksforgeeks.february;

import java.util.Stack;

public class HistogramMaxRectangle {
    public static int getMaxArea(int arr[]) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = arr.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : arr[i];
            while (!stack.isEmpty() && arr[stack.peek()] > currentHeight) {
                int height = arr[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }


    public static void main(String[] args) {
        int[] arr = {60, 20, 50, 40, 10, 50, 60};
        System.out.println(getMaxArea(arr));

    }

}
/* --- Below Approach is not working for all test cases it fails for large inputs

public static int getMaxArea(int arr[]) {
        int result =0, total = 0, avg = 0, actTotal =0, small =0;
        ArrayList<Integer> actual = new ArrayList<>(), temp = new ArrayList<>();

        for (int j =0; j< arr.length; j++) {
            total += arr[j];
        }
        avg = total/arr.length;
        total =0;
        if (arr.length <=1) {
            return arr[0];
        }

        for (int i =0; i< arr.length; i++) {
            if (i == arr.length-1 && arr[i] > avg){
                total += arr[i];
                temp.add(arr[i]);
                if (total > actTotal){
                    actual = new ArrayList<>(temp);
                    actTotal = total;
                }
                continue;
            }
            if (arr[i] >= avg){
                temp.add(arr[i]);
                total += arr[i];
            } else if (arr[i] < avg && total > actTotal) {
                actual = new ArrayList<>(temp);
                actTotal = total;
                temp.clear();
                total =0;
            }
            else {
                temp.clear();
                total =0;
            }
        }

        for (int k =1; k< actual.size(); k++) {
            System.out.println("arraylist : " + actual.get(k-1));
            if (actual.size() > 0) {
                small = Math.min(actual.get(k), actual.get(k-1));
            }
            else {
                small = actual.get(0);
            }
        }
        System.out.println(small + " " + actual.size() + " " + avg);
        result = small * actual.size();

        return result;
    }
 */