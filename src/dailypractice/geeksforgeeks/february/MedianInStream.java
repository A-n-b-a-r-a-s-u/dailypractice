package dailypractice.geeksforgeeks.february;

import java.util.ArrayList;
import java.util.Arrays;

public class MedianInStream {

    public ArrayList<Double> getMedia(int[] arr){
        ArrayList<Double> result = new ArrayList<>();
        for (int i = 0; i< arr.length; i++) {
            int[] tempArray = Arrays.copyOfRange(arr, 0, i+1);
            int leng = tempArray.length ;
            Arrays.sort(tempArray);

            for (int j = 0; j< leng; j++) {
                System.out.println(tempArray[j]);
            }
            System.out.println("iteration Over");

            if (leng % 2 != 0){
                result.add(Double.valueOf(tempArray[(leng/2)]));
            }
            else {
                Double ans = Double.valueOf(tempArray[leng/2] + tempArray[(leng/2) - 1]) ;
                result.add(ans/2);
            }
        }

        return result;
    }
    public static void main(String[] args) {

        MedianInStream mn = new MedianInStream();
        int[] arr = {5, 15, 1, 3, 2, 8};
        System.out.println(mn.getMedia(arr));

    }
}

/*
Used below code Due to time complexity:

ArrayList<Double> result = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Left half (Max-Heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Right half (Min-Heap)

        for (int num : arr) {
            // Step 1: Add number to maxHeap
            maxHeap.add(num);

            // Step 2: Balance heaps (ensure all elements in minHeap are greater)
            if (!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                minHeap.add(maxHeap.poll());
            }

            // Step 3: Maintain size balance
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            }
            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

            // Step 4: Get median
            if (maxHeap.size() > minHeap.size()) {
                result.add((double) maxHeap.peek()); // Odd count → MaxHeap root is median
            } else {
                result.add((maxHeap.peek() + minHeap.peek()) / 2.0); // Even count → Avg of two roots
            }
        }

        return result;

 */