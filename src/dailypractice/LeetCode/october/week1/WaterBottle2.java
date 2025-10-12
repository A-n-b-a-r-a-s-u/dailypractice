package dailypractice.LeetCode.october.week1;

public class WaterBottle2 {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk, empty;
        drunk = numBottles;
        empty = numBottles;
        while ( empty >= numExchange){
            empty -= numExchange++;
            drunk++;
            empty++;
        }

        return drunk;
    }

    public static void main(String[] args) {
        System.out.println(maxBottlesDrunk(13,6));
    }
}
