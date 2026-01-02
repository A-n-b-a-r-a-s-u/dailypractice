package dailypractice.LeetCode.year25.march;

public class VowelSubStringWithConstants {
    public static long countOfSubstrings(String word, int k) {
        long ans = 0;
        int windowsSize = 5 + k;
        String temp ;
        if (windowsSize > word.length()) return 0;
        for (int i =0; i<= word.length()- windowsSize; i++) {
            temp = word.substring(i, windowsSize+i);
            if (temp.contains("a") && temp.contains("e") &&temp.contains("i") && temp.contains("o") && temp.contains("u") ){
                temp = temp.replace("a", "");
                temp = temp.replace("e", "");
                temp = temp.replace("i", "");
                temp = temp.replace("o", "");
                temp = temp.replace("u", "");
            }
            else {
                continue;
            }
            if (!(temp.contains("a") ||temp.contains("e") ||temp.contains("i") ||
                    temp.contains("o") || temp.contains("u")) ){
                ans++;
            }
        }

        if (word.contains("a") && word.contains("e") &&word.contains("i") && word.contains("o") && word.contains("u")  ){
            temp = word;
            int ct=0;
            for (int i =0; i< temp.length(); i++){
                if (temp.charAt(i) == 'q'){
                    ct++;
                }
            }
            if (ct == k){
                ans++;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countOfSubstrings("aeueio",0));

    }
}
