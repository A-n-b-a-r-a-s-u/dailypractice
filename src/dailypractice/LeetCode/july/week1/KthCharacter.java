package dailypractice.LeetCode.july.week1;

public class KthCharacter {
    public static char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        int size = word.length();
        while (size <= k){
            StringBuilder cur = new StringBuilder();
            for (int i = 0; i< size; i++){
                cur.append((char) (word.charAt(i) + 1));
            }
            word.append(cur);
            size = word.length();
        }
        return word.charAt(k-1);
    }

    public static void main(String[] args) {
        System.out.println(kthCharacter(10));
    }
}
