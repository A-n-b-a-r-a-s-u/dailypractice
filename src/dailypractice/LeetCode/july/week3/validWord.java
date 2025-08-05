package dailypractice.LeetCode.july.week3;

public class validWord {
    public static boolean isValid(String word) {
        if (word.length() < 3){
            return false;
        }
        boolean vowel = false, consonenet = false;
        for (char c : word.toCharArray()){
            if (c >= 65 && c <= 90 || c >= 97 && c <= 122 || c >= 48 && c <= 57 ){
                if ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'  ){
                    vowel =true;
                }
                else {
                    consonenet = true;
                }
                if ( c >= 48 && c <= 57){

                }
                else {
                    return false;
                }

            }
            else {
                return false;
            }

        }

        return vowel && consonenet;
    }

    public static void main(String[] args) {
        System.out.println(isValid("aya"));
    }
}
