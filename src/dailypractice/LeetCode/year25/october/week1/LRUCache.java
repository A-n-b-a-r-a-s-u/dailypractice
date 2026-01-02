package dailypractice.LeetCode.year25.october.week1;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {
    int capacity ;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>(capacity, 0.75f, true);
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
        if (cache.size() > capacity) {
            Iterator<Integer> it = cache.keySet().iterator();
            if (it.hasNext()){
                Integer first = it.next();
                cache.remove(first);
            }
        }
    }

    public static void main(String[] args) {

    }
}
