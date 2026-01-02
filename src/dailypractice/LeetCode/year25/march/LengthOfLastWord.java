package dailypractice.LeetCode.year25.march;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int result =0;
        s = s.trim();
        String[] arr= s.split(" ");
        int size = arr.length-1;
         result = arr[size].length();

        return result;
    }

    public static void main(String[] args) {
        String st = " luffy is still joyboy";

        System.out.println(lengthOfLastWord(st));

    }
}
