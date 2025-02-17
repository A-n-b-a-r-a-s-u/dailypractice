package dailypractice.LeetCode.february;

public class ReverseCharArray {
    public static void main(String[] args) {
        ReverseCharArray st = new ReverseCharArray();
        char[] chr ={'h','e','l','l','o'};
        char[] res = st.reverseString(chr);
        for (char ch : res){
            System.out.print(ch + " ");
        }

    }

    public char[] reverseString(char[] s) {
        int left = 0, right = s.length-1;
        char temp ;
        for (int i =0; i< s.length /2; i++) {
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
        return s;

    }
}
