package dailypractice.LeetCode.year2026.february.week3;

import java.util.*;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0);

        for (boolean bool : visited){
            if (!bool){
                return false;
            }
        }

        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] notVisited, int cur){
        if (notVisited[cur]){
            return;
        }
        notVisited[cur] = true;
        for (int i: rooms.get(cur)){
            dfs(rooms, notVisited, i);
        }
    }

    public static void main(String[] args) {

    }
}
