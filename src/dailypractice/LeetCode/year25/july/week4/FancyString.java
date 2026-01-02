package dailypractice.LeetCode.year25.july.week4;

public class FancyString {

    public static String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i =0; i< s.length()-1; i++){
            if (s.charAt( i+1) != s.charAt(i)){
                ans.append(s.charAt(i));
                count = 1;
            } else if (count <2) {
                ans.append(s.charAt(i));
                count++;
            }
        }
        ans.append(s.charAt(s.length()-1));
        return ans.toString();
    }
    public static void main(String[] args) {

        System.out.println(makeFancyString("leeetcode"));
    }
}
