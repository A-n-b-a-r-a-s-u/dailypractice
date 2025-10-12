package dailypractice.LeetCode.october.week1;

public class WaterBottle {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int modulo, cur;
        while (numBottles >= numExchange){
            modulo = numBottles % numExchange;
            cur = (numBottles / numExchange);
            ans += cur;
            numBottles = cur + modulo;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(15,4));
    }
}
