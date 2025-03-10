package dailypractice.geeksforgeeks.march;

public class nthStair {
    int countWays(int n) {
        if (n <= 2) return n;
        int cur =0, pre1 =1, pre2 =2;
        for (int i =3; i<= n; i++){
            cur = pre1 +pre2;
            pre1 =pre2;
            pre2 = cur;
        }
        return cur;

    }

    public static void main(String[] args) {
        nthStair nt = new nthStair();
        System.out.println(nt.countWays(2));

    }
}
