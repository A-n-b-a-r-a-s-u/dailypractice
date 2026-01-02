package dailypractice.LeetCode.year25.july.week1;

public class KthCharacterinString {
    public static char kthCharacter(long k, int[] operations) {
        StringBuilder word = new StringBuilder("a");
        for (int operation : operations) {
            if (operation == 0) {
                word.append(String.valueOf(word));
            } else {
                StringBuilder str = new StringBuilder();
                for (int j =0; j< word.length();j++){
                    str.append((char) (word.charAt(j)+1));
                }
                word.append(str);
            }
        }
        return word.charAt((int)k-1);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1};
        System.out.println(kthCharacter(10,arr));
    }
}
