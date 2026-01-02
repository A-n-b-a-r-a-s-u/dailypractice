package dailypractice.LeetCode.year25.february;

public class ShortDistanceToChar {
    public static void main(String[] args) {
        ShortDistanceToChar st = new ShortDistanceToChar();
        String str = "loveleetcode";
        char chr = 'e';
        int[] temp = st.shortestToChar(str, chr);
        for (int i = 0; i< temp.length; i++) {
            System.out.print(temp[i] + " ");

        }
    }

    public int[] shortestToChar(String s, char c) {
            int n = s.length(), pos = -n, res[] = new int[n];
            for (int i = 0; i < n; ++i) {
                if (s.charAt(i) == c) pos = i;
                res[i] = i - pos;
            }
            for (int i = pos - 1; i >= 0; --i) {
                if (s.charAt(i) == c)  pos = i;
                res[i] = Math.min(res[i], pos - i);
            }
            return res;
    }
}

/*
public int[] shortestToChar(String s, char c) {
        int length = s.length() - 1;
        char[] chrArray = s.toCharArray();
        int [] resultArray = new int[length ];
        int temp = 0, initial =1, tempCopy ;
        boolean found = false;
        for (int i = 0; i < length ; i++) {
            if (chrArray[i] == c) {
                temp = i;
                resultArray[i] = 0;
                found = true;
            }
            else if (found) {
                resultArray[i] = initial;
                initial++;
            }
        }
        tempCopy = temp ;
        for (int j =0; j < temp; j++) {
            resultArray[j] = tempCopy;
            tempCopy--;
        }

        return resultArray;
    }
 */
