package dailypractice.geeksforgeeks;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class hIndex {

    public static void main(String[] args) throws IOException {
        int[] arr = {3,1,2,4,5};

        Solution solution = new Solution();
        System.out.println(solution.hIndex(arr));;
    }
}

class Solution{
    public int hIndex(int[] arr) {
        int length = arr.length, count = 0;
        int[] output = new int[length];

        for (int i = 0; i< length; i++) {
            int compar = arr[i];
            count ++;
            for (int j = i; j< length; j++) {
                if (compar == arr[i]) {
                    count++;
                }
            }
            output[i] = count;
        }

        int largest = output[0], largestindex = 0;

        for (int k =0; k< length; k++) {
            if (output[k] > largest) {
                largest = output[k];
                largestindex = k;
                //System.out.println(largest);
            }
        }
        return  largestindex;
    }

}
