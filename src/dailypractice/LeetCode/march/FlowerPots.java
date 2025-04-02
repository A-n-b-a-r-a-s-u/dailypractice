package leetcode;

public class FlowerPots {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int posibility =0;
        for (int i=0; i< flowerbed.length; i++){
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)){
                posibility++;
                flowerbed[i] =1;
            }
        }

        System.out.println(posibility);
        return posibility >= n;
    }

    public static void main(String[] args) {
        int[] f ={1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(f,2));
    }
}
