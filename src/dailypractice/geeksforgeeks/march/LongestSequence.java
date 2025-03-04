package dailypractice.geeksforgeeks.march;

import java.util.ArrayList;

public class LongestSequence {

    static int lis(int arr[]) {
        int  highest = 0, cmp = arr[0];
        ArrayList<Integer> shortlisted = new ArrayList<>();
        shortlisted.add(arr[0]);
        for (int i =1; i< arr.length; i++){
            if (cmp < arr[i]){
                shortlisted.add(arr[i]);
            }
        }

        for (int j = shortlisted.size()-1; j>0; j--){
            if (shortlisted.get(j) < shortlisted.get(j-1)){
                shortlisted.remove(j-1);
            }
        }
        String a = "Anbu";

        highest = shortlisted.size();
        for (int k =0; k< highest; k++){
            System.out.println(shortlisted.get(k));
        }


        return highest;
    }

    public static void main(String[] args) {

        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};

        lis(arr);

    }
}
