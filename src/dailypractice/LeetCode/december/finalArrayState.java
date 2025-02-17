package dailypractice.LeetCode.december;

import java.util.Arrays;
import java.util.Collections;

public class finalArrayState {
    static int[] finalstate(int[] arr, int k, int multi ) {
        Integer[] result = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        for(int i = 0; i< k; i++){
            int min = Collections.min(Arrays.asList(result));
            int index = Arrays.asList(result).indexOf(min);
            result[index] *= multi;
        }
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {


    }
}
