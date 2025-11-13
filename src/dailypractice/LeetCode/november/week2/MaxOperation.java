package dailypractice.LeetCode.november.week2;

public class MaxOperation {
    public static int maxOperations(String s) {
        int ans =0;
        boolean zeroFound = false;
        int oneCount = 0;
        for (int i =0; i< s.length(); i++){
            if (s.charAt(i) == '1'){
                if (zeroFound){
                    ans += oneCount;
                    zeroFound = false;
                }
                oneCount++;
            }
            else {
                zeroFound = true;
            }
        }
        if (s.charAt(s.length()-1) == '0')
            ans += oneCount;

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxOperations("1001101"));
    }
}
