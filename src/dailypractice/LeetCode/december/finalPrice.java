package dailypractice.LeetCode.december;

public class finalPrice {
    static int valueOfJ(int[] arr, int i, int j){
        for (int k = i; k < arr.length; k++)
        {

            if(j >= arr.length ) {
                j = 0;
                return j;
            }
            if(arr[j] < arr[i]) {
                return j;
            }
            if ( arr[j] > arr[i]) {
                j+=1;
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {8,4,6,2,3}, answer = new int[arr.length];
        int j  ;
        for (int i = 0; i< arr.length; i++) {
            j = valueOfJ(arr, i, i+1);
            if(j == 0){
                answer[i] = arr[i];
                continue;
            }
            answer[i] = arr[i] - arr[j];
        }

        for (int l =0; l< answer.length; l++) {
            System.out.print(answer[l] + " ");
        }
    }
}
