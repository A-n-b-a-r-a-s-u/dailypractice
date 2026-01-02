package dailypractice.LeetCode.year25.august.week3;

public class ThreeDigits {
    public static String largestGoodInteger(String num) {
        String[] possible = {"999","888","777", "666", "555", "444", "333", "222", "111", "000"};
        for (String str : possible ){
            if (num.contains(str)){
                return str;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(largestGoodInteger("42352338"));
    }
}

/*
public static String largestGoodInteger(String num) {
        String ans = "";

        for (int i =0; i< num.length()-2; i++){
            StringBuilder sb = new StringBuilder();
            if ((num.charAt(i) == num.charAt(i+1)) && (num.charAt(i+1) == num.charAt(i+2))){
                if(!ans.isEmpty() && ans.charAt(0) < num.charAt(i) ){
                    ans = "";
                    ans += num.charAt(i);
                    ans += num.charAt(i+1);
                    ans += num.charAt(i+2);
                    i +=2;
                }
                else if (ans.isEmpty()){
                    ans += num.charAt(i);
                    ans += num.charAt(i+1);
                    ans += num.charAt(i+2);
                    i +=2;
                }
            }

        }
        return ans;
    }
 */