package dailypractice.LeetCode.august.week2;

import java.util.HashMap;

public class FruitsInBasket {
    public static int totalFruit(int[] fruits) {
        int ans = 0;
        HashMap<Integer, Integer> fruitsList =  new HashMap<>();
        int start = 0;
        for (int i =0; i< fruits.length; i++){
            int fruitType = fruits[i];
            if (fruitsList.containsKey(fruitType) || fruitsList.size() < 2 ){
                fruitsList.put(fruitType, fruitsList.getOrDefault(fruitType, 0) + 1);
            } else {
                while (fruitsList.size() >= 2 ){
                    if (fruitsList.get(fruits[start]) <= 1){
                        fruitsList.remove(fruits[start]);
                    }
                    else {
                        fruitsList.put(fruits[start],fruitsList.getOrDefault(fruits[start], 0)- 1 );
                    }
                    start++;
                }
                fruitsList.put(fruitType, fruitsList.getOrDefault(fruitType, 0) + 1 );
            }

            int cur = 0;
            for (int n: fruitsList.values()){
                cur += n;
            }

            ans = Math.max(ans, cur);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] n = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(n));
    }
}


/*
public static int totalFruit(int[] fruits) {
        int ans = 0;
        HashMap<Integer, Integer> fruitsList =  new HashMap<>();
        for (int i =0; i< fruits.length; i++){
            int fruitType = fruits[i];
            if (fruitsList.size() < 2 || fruitsList.containsKey(fruitType)){
                fruitsList.put(fruitType, fruitsList.getOrDefault(fruitType, 0) + 1);
            } else {
                int fruitCount = fruitsList.get(fruits[i-1]);
                fruitsList.clear();
                fruitsList.put(fruits[i-1], fruitCount);
                fruitsList.put(fruitType, fruitsList.getOrDefault(fruitType, 0) + 1);
            }
            int cur = 0;
            for (int n: fruitsList.values()){
                cur += n;
            }

            ans = Math.max(ans, cur);
        }

        return ans;
    }
 */