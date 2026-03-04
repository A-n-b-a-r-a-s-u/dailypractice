package dailypractice.LeetCode.year2026.march.week1;

public class FindKthBit {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        for (int i =1; i< n; i++){
            StringBuilder invert = new StringBuilder();
            for (int j =0; j< s.length(); j++){
                invert.append(s.charAt(j) == '0' ? '1': "0");
            }
            invert.reverse();
            s.append("1");
            s.append(invert);
        }

        return s.charAt(k-1);
    }

    public static void main(String[] args) {
        FindKthBit f = new FindKthBit();
        System.out.println(f.findKthBit(3,1));

    }
}

/*
public char findKthBit(int n, int k) {
        String res = nThString(n,"0");
        return res.charAt(k-1);
    }

    public String nThString(int n, String s){
        if (n <= 0){
            return s;
        }
        StringBuilder res = new StringBuilder(s);
        StringBuilder temp = new StringBuilder(invert(s));
        res.append("1");
        res.append(temp.reverse());
        n--;
        return nThString(n, res.toString());
    }

    public String invert(String s){
        String inv ="";
        for (char c : s.toCharArray()){
            if (c == '1'){
                inv += '0';
            }
            else {
                inv += '1';
            }
        }
        return inv;
    }
 */