package dailypractice.LeetCode.year25.october.week5;

public class SetBits {
    public static int smallestNumber(int n) {
        int ans = -1;
        for (int i = n; i< 100000; i++){
            String s = Integer.toBinaryString(i);
            String cur = s.replace("1","");
            System.out.println(s);
            if (cur.isEmpty()){
                return i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber(514));
    }
}
