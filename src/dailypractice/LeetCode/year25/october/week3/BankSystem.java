package dailypractice.LeetCode.year25.october.week3;

public class BankSystem {
    static long[] bal;
    int n =0;
    public BankSystem(long[] balance) {
        bal = balance;
        n = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > n || account2 > n || account1 < 0 || account2 < 0 || bal[account1-1] < money){
            return false;
        }
        bal[account1-1] -= money;
        bal[account2-1] += money;

        return true;
    }

    public boolean deposit(int account, long money) {
        if (account > n || account < 0 ){
            return false;
        }
        bal[account-1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account > n || account < 0 || bal[account-1] < money){
            return false;
        }
        bal[account-1] -= money;
        return true;
    }

    public static void main(String[] args) {
        long[] balanc = {10, 100, 20, 50, 30};
        BankSystem b = new BankSystem(balanc);
        System.out.println(b.withdraw(3,10));
        System.out.println(b.transfer(5,1,20));
        System.out.println(b.deposit(5,20));
        System.out.println(b.transfer(3,4,15));
        System.out.println(b.withdraw(10,50));
    }
}
