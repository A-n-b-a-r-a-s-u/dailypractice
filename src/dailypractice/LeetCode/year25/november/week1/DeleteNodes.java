package dailypractice.LeetCode.year25.november.week1;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteNodes {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> arrayValues = new HashSet<>();
        for (int num: nums){
            arrayValues.add(num);
        }
        ListNode previous = null;
        ListNode traverse = head;
        while (traverse != null){
            if (arrayValues.contains(traverse.val) && traverse == head){
                head = traverse.next;
            }
            else if (arrayValues.contains(traverse.val) && previous != null){
                previous.next = traverse.next;
            }
            previous = traverse;
            traverse = traverse.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
