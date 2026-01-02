package dailypractice.LeetCode.year25.march;

public class BuyStock {
    public static int maxProfit(int[] prices) {
        int start = prices[0] ;
        int res =0, dif;
        int currElement;
        for (int i =1; i< prices.length; i++){
            currElement = prices[i];
            if (start > currElement){
                start = currElement;
                continue;
            }
            dif = currElement - start;
            if (res < dif){
                res =dif;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] p ={7,6,4,3,1};
        System.out.println(maxProfit(p));

    }
}
