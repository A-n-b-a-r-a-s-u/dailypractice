package dailypractice.LeetCode.february;

import java.util.HashMap;
import java.util.Map;

public class LetterTiles {
    public int numTilePossibilities(String tiles) {
        int result =0;
        char[] tile = tiles.toCharArray();
        int leng = tile.length;
        Map<String ,Integer> count = new HashMap<>();

        for (int k =0 ; k< leng; k++) {
            char first = tile[0];
            for (int l = 0; l < leng - 1; l++) {
                tile[l] = tile[l+1];
            }
            tile[leng -1] = first;

            for (int i = 0; i < leng; i++) {
                String value ="";
                for (int j =i; j < leng; j++){
                    value = value + tile[j];
                    if (count.containsKey(value)) {
                        count.put(value, count.get(value) + 1);
                    }
                    else {
                        count.put(value, 0);
                    }
                }
            }

        }
        result = count.size();

        return result;
    }
    public static void main(String[] args) {
        String tiles = "AAB";
        LetterTiles lt = new LetterTiles();
        System.out.println(lt.numTilePossibilities(tiles));
    }
}
