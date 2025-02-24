package dailypractice.geeksforgeeks.february;

public class Parentheses {

    public boolean parenthesis(String s ) {
        int len = s.length();
        for (int i =0; i< len/2; i++){
            if (s.contains("{}")){
                s = s.replace("{}", "");
            }
            else if (s.contains("()")){
                s = s.replace("()", "");
            }
            else if (s.contains("[]")){
                s = s.replace("[]", "");
            }
            else {
                return s.isEmpty();
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        Parentheses p = new Parentheses();
        System.out.println(p.parenthesis(s));


    }
}
