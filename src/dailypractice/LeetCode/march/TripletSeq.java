package dailypractice.LeetCode.march;

public class TripletSeq {
    public static boolean increasingTriplet(int[] nums) {
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        for (int num: nums){
            if (num <= n1) n1 = num;
            else if (num <= n2) n2 = num;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a ={1,5,0,4,1,3};
        System.out.println(increasingTriplet(a));
    }
}
