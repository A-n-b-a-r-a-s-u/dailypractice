package dailypractice.LeetCode.december;

import java.util.Arrays;

public class maxChunk2 {
    public static int maxChunkoutput(int[] arr) {
        int chunk =0;
        int arrayValues =0, arrayIndex = 0;
        for (int i =0 ; i< arr.length; i++) {
            arrayIndex += i;
            arrayValues += arr[i];

            if (arrayIndex == arrayValues) {
                chunk++;
            }
        }

        return chunk;
    }

    public static void main(String[] args) {
        int[] arr = {0};
        System.out.println(maxChunkoutput(arr));
    }
}

/*

        int n = arr.length;
        int[] prefixMax = arr.clone();
        int[] suffixMin = arr.clone();

        int chunk =0;
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], prefixMax[i]);
            System.out.println(prefixMax[i]);
        }
        System.out.println("End of prefix");

        // Fill the suffixMin array in reverse order
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], suffixMin[i]);
            System.out.println(suffixMin[i]);
        }
        System.out.println("End of suffix");

        int chunks = 0;
        for (int i = 0; i < n; i++) {
            // A new chunk can be created
            if (i == 0 || suffixMin[i] > prefixMax[i - 1]) {
                chunks++;
            }
        }

        return chunks;
 */