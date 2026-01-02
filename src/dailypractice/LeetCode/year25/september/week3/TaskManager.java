package dailypractice.LeetCode.year25.september.week3;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<List<Integer>> userTasks;
    public TaskManager(List<List<Integer>> tasks) {
        userTasks = tasks;
    }

    public void add(int userId, int taskId, int priority) {
        List<Integer> cur = new ArrayList<>();
        cur.add(userId);
        cur.add(taskId);
        cur.add(priority);
        userTasks.add(cur);
    }

    public void edit(int taskId, int newPriority) {

    }

    public void rmv(int taskId) {

    }

    public int execTop() {


        return 0;

    }
    public static void main(String[] args) {

    }
}
