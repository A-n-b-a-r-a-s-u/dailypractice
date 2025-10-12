package dailypractice.LeetCode.august.week4;

public class ShiftLetters {
    public static String shiftingLetters(String s, int[][] shifts) {
        StringBuilder ans = new StringBuilder(s);
        for (int[]n : shifts){
            for (int i = n[0]; i<= n[1]; i++){
                if (n[2] == 1){
                    int c = ans.charAt(i);
                    char ct = (char) (((c - 'a' + 1 + 26) % 26) + 'a');

                    ans.setCharAt(i,ct);
                }
                else {
                    int c = ans.charAt(i);
                    char ct = (char) (((c - 'a' - 1 + 26) % 26) + 'a');
                    ans.setCharAt(i,ct);
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        int[][] s = {{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetters("abc", s));
    }
}
