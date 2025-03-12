package dailypractice.geeksforgeeks.march;

public class FindTransitionPoint {
    int transitionPoint(int arr[]) {
        int n = arr.length;
        if (arr[0] > 0) return 0;
        for(int i =0; i< n; i++) {
            if (arr[i] ==1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
