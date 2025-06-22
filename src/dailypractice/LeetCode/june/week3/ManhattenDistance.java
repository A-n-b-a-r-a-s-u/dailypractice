package dailypractice.LeetCode.june.week3;

import java.util.Hashtable;

public class ManhattenDistance {
    public static int maxDistance(String s, int k) {
        int x=0, y =0, max = 0;
        int[] distance = new int[s.length()];
        int index = 0;
        for (char c: s.toCharArray()){
            if (c =='N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;
            distance[index] = Math.abs(x) + Math.abs(y);
            max = Math.max(max, distance[index++]);
        }

        if (k == 0) return max;

        int prev = distance[0], ans = distance[1];
        int addedBoost =0;

        for (int i =1; i < distance.length; i++){
            if (prev > distance[i] && k > 0){
                addedBoost += 2;
                k--;
            }
            prev = distance[i];
            distance[i] += addedBoost;
            ans = Math.max(ans, distance[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "NWSE";
        System.out.println(maxDistance(s,1));;

    }
}

/*
Hashtable<Character, Integer> direction = new Hashtable<>();
        for (char c: s.toCharArray()){
            direction.put(c,direction.getOrDefault(c, 0) + 1);
        }

        char pair1 = ' ';
        char pair2 = ' ';
        if (direction.get('N') > direction.get('S')){
            pair1 = 'N';
        } else if (direction.get('N') < direction.get('S')) {
            pair1 = 'S';
        }
        if (direction.get('E') > direction.get('W')){
            pair2 = 'E';
        } else if (direction.get('E') < direction.get('W')) {
            pair2 = 'W';
        }

        if (pair1 == 'N'){
            if (direction.get('S') <= k){
                int temp = direction.get('S');
                k -= temp;
                direction.remove('S');
                direction.put('N', direction.getOrDefault('N', 0) + temp);
            }
            else {
                direction.put('N', direction.getOrDefault('N', 0) + k);
                int temp = direction.get('S');
                direction.put('S', direction.getOrDefault('N', 0) - k);
                k -= temp;
            }
        }

        if (pair2 == 'E'){
            if (direction.get('W') <= k){
                int temp = direction.get('W');
                k -= temp;
                direction.remove('W');
                direction.put('E', direction.getOrDefault('E', 0) + temp);
            }
            else {
                direction.put('E', direction.getOrDefault('E', 0) + k);
                int temp = direction.get('W');
                direction.put('W', direction.getOrDefault('E', 0) - k);
                k -= temp;
            }
        }

        if (k > 0 && pair1 == ' '){
            if (direction.get('S') <= k) {
                int temp = direction.get('S');
                direction.remove('S');
                direction.put('N', direction.getOrDefault('N', 0) + temp);
                k -= temp;
            }
            else {
                int temp = direction.get('S');
                direction.put('S', direction.getOrDefault('S', 0) - k);
                direction.put('N', direction.getOrDefault('N', 0) + temp);
                k -= temp;

            }
        }

        ans = Math.abs(direction.get('E') - direction.get('W')) - Math.abs(direction.get('N') - direction.get('S')) ;
        System.out.println(ans);
 */
