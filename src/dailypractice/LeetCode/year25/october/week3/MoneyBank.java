package dailypractice.LeetCode.year25.october.week3;

public class MoneyBank {
    public static int totalMoney(int n) {
        int ans = 0;
        int start = 1;
        int gstart = 1;
        for (int i =0; i<n; i++){
            if (i != 0  && i % 7  == 0){
                gstart++;
                start = gstart;
            }
            ans += start++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(10));
    }
}


/*
public static int totalMoney(int n) {
        int ans = 0;
        int division = n/7;
        int reminder = n%7;
        int start = 1;
        for (int i = 0; i< division; i++){
            ans += ((7-start+1) * (7+ start++))/2;
        }
        System.out.println(ans);
        System.out.println(reminder);
        reminder = start+reminder-1;
        ans += ((reminder - start +1) * (reminder + start))/2;

        return ans;
    }
 */