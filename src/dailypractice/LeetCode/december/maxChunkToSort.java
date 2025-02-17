package dailypractice.LeetCode.december;

import java.util.Arrays;

public class maxChunkToSort {
    public static int maxChunksToSorted(int[] arr) {
        int[] sortArray = arr.clone();
        int count = 1 ;
        Arrays.sort(sortArray);
        for (int i =0; i < arr.length; i++) {
            if( i == arr.length -1) {
                count+=1;
                continue;
            }
            if (arr[i - 1] != sortArray[ i - 1] && arr[i + 1] != sortArray[ i + 1]) {
                continue;
            }
            count += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4};

        System.out.println(maxChunksToSorted(arr));;

    }
}