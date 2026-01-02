package dailypractice.LeetCode.year25.october.week2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFlood {
    public static int[] avoidFlood(int[] rains) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[rains.length];
        Arrays.fill(ans, 1);
        TreeSet<Integer> st = new TreeSet<>();
        for(int i = 0; i < rains.length; i++) {
            if(rains[i] == 0) {
                st.add(i);
            }
            else {
                ans[i] = -1;
                if(map.containsKey(rains[i])) {
                    Integer it = st.ceiling(map.get(rains[i]));
                    if(it == null) return new int[0];
                    ans[it] = rains[i];
                    st.remove(it);
                }
                map.put(rains[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] r = {1,2,0,0,2,1};
        int[] a = avoidFlood(r);
        System.out.println(Arrays.toString(a));
    }
}

/*
public static int[] avoidFlood(int[] rains) {
        int[] ans = new int[rains.length];
        HashMap<Integer, Integer> lakeCount = new HashMap<>();
        Queue<Integer> popQueue = new LinkedList<>();
        for (int rain : rains){
            if (rain != 0){
                if (lakeCount.containsKey(rain)){
                    popQueue.add(rain);
                    lakeCount.put(rain, lakeCount.getOrDefault(rain, 0)+1);
                }
                else {
                    lakeCount.put(rain,1);
                }
            }
        }
        HashSet<Integer> unique = new HashSet<>();
        for (int i = 0; i< rains.length; i++){
            if (rains[i] > 0){
                if (unique.contains(rains[i])){
                    return new int[0];
                }
                ans[i] = -1;
                unique.add(rains[i]);
            }
            else {
                int addElement = 1;
                if (!(popQueue.isEmpty())){
                    addElement = popQueue.poll();
                    unique.remove(addElement);
                }
                ans[i] = addElement;
            }
        }
        if (!popQueue.isEmpty()){
            return new int[0];
        }
        return ans;
    }
 */

//Method 2
/*
int[] ans = new int[rains.length];
        ArrayList <Integer> unique = new ArrayList<>();
        for (int i = 0; i< rains.length; i++){
            if (rains[i] == 0){
                if (unique.isEmpty()){
                    ans[i] = 1;
                }
                else if (unique.size() == 1){
                    int removeElement = unique.getFirst();
                    unique.remove(Integer.valueOf(removeElement));
                    ans[i] = removeElement;
                }
                else {
                    int index = i;
                    int removeElement = unique.getFirst();
                    while(index < rains.length){
                        if (rains[index] != 0 && unique.contains(rains[index])){
                            removeElement = rains[index];
                            break;
                        }
                        index++;
                    }
                    ans[i] = removeElement;
                    unique.remove(Integer.valueOf(removeElement));
                }
            }
            else {
                if (unique.contains(rains[i])){
                    return new int[0];
                }
                ans[i] = -1;
                unique.add(rains[i]);
            }

        }
        return ans;
 */