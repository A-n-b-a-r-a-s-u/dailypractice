package dailypractice.geeksforgeeks.february;

import java.util.ArrayList;

public class StockSpan {
    public ArrayList<Integer> calculateSpan(int [] arr){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i =0; i< arr.length; i++) {
            if (i == 0){
                result.add(1);
                continue;
            }
            if (arr[i] >= arr[i-1]){
                int j = i-1, count =1;
                while (arr[i] >= arr[j] && j >= 0){
                    if (j == 0  ) {
                        result.add(result.get(j) + count);
                        count = 0;
                        break;
                    } else {
                        count+=1;
                    }
                    j--;
                }
                if (count > 0){
                    result.add(count);
                }

            }
            else {
                result.add(1);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        StockSpan s = new StockSpan();

        int[] arr = {10, 4, 5, 90, 120, 80};

        ArrayList<Integer> print = s.calculateSpan(arr);
        for (Integer p : print){
            System.out.print(p + " ");

        }


    }
}


/*

public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            // Pop elements while stack is not empty and top element is smaller than current price
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, span is entire range (i + 1)
            if (stack.isEmpty()) {
                span.add(i + 1);
            } else {
                span.add(i - stack.peek());
            }

            // Push this element's index onto stack
            stack.push(i);
        }

        return span;
    }
 */