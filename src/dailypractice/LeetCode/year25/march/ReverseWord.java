package dailypractice.LeetCode.year25.march;

public class ReverseWord {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        s = s.trim();
        String[] str = s.split("\\s+");
        for (int i= str.length-1;i>=0;i--){
            res.append(str[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));

    }
}
