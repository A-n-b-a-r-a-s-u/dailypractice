package dailypractice.LeetCode.august.week2;

public class FruitBasket2 {
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = fruits.length;

        for (int j =0; j< fruits.length; j++){
            for (int i = 0; i< baskets.length; i++){
                if (fruits[j] <= baskets[i]){
                    ans--;
                    baskets[i] = -1;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] f = {4,2,5};
        int[] b = {3,5,4};
        System.out.println(numOfUnplacedFruits(f, b));
    }
}
