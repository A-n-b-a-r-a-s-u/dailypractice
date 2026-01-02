package dailypractice.LeetCode.year25.october.week3;

public class DigitEqual {
    public static boolean hasSameDigits(String s) {
        while (s.length() > 2){
            StringBuilder curString = new StringBuilder("");
            for (int i =1; i<s.length(); i++){
                int first = s.charAt(i-1);
                int second = s.charAt(i);
                int num = (first + second) % 10;
                curString.append(num);
            }
            s = curString.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }

    public static void main(String[] args) {
        System.out.println(hasSameDigits("34789"));
    }
}
