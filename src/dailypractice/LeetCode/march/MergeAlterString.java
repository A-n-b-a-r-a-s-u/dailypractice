package dailypractice.LeetCode.march;

public class MergeAlterString {
    public static String mergeAlternately(String word1, String word2) {
        int lar = Math.max(word1.length(), word2.length());
        int w1 = word1.length(),w2 = word2.length();
        StringBuilder result = new StringBuilder();
        for (int i =0; i< lar; i++){
            if (w1 <=0){
                result.append(word2.substring(i));
                return result.toString();
            }
            if (w2 <=0){
                result.append(word1.substring(i));
                return result.toString();
            }
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            w1--;
            w2--;
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String w1 = "abcd", w2 = "pq";
        System.out.println(mergeAlternately(w1,w2));
    }
}
