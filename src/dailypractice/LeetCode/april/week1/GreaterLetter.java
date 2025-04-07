package dailypractice.LeetCode.april.week1;

public class GreaterLetter {
    public static char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        for (int i = letters.length-1; i>= 0; i--){
            if ((int)target < (int)letters[i]){
                ans = letters[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        char[] l = {'c','f','j'};
        System.out.println(nextGreatestLetter(l, 'c'));
    }
}
