package dailypractice.LeetCode.year25.october.week5;

import java.util.ArrayList;

public class ZigZag {
    public static String convert(String s, int numRows) {
        String ans = "";
        ArrayList<String> listCount = new ArrayList<>();
        for (int i =0; i< numRows; i++){
            String st = "";
            listCount.add(st);
        }
        int length = s.length();
        int index = 0;
        while (length > 0){
            for (int i = 0; i< numRows; i++){
                if (length <= 0){
                    break;
                }
                String temp = listCount.get(i);
                listCount.remove(i);
                temp += s.charAt(index++);
                listCount.add(i, temp);
                length--;
            }
            for (int j = numRows-2; j > 0; j--){
                if (length <= 0){
                    break;
                }
                String temp = listCount.get(j);
                listCount.remove(j);
                temp += s.charAt(index++);
                listCount.add(j, temp);
                length--;
            }
        }
        for (int k =0; k< numRows; k++){
            System.out.println(listCount.get(k));
            ans += listCount.get(k);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
