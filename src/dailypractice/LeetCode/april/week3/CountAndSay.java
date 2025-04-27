package dailypractice.LeetCode.april.week3;

public class CountAndSay {
    public static String countAndSay(int n) {
        String ans = "1";
        if (n ==1) return "1";
        n--;
        for (int i =0; i< n; i++){
            StringBuilder current = new StringBuilder();
            int count =0;
            char cmp = ans.charAt(0);
            for (int j =0; j< ans.length(); j++){
                if (cmp != ans.charAt(j)){
                    current.append(count);
                    current.append(cmp);
                    cmp = ans.charAt(j);
                    count =1;
                }
                else {
                    count++;
                }
            }
            current.append(count);
            current.append(cmp);
            ans = current.toString();
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countAndSay(7));

    }
}
