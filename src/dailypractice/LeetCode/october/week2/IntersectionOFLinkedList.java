package dailypractice.LeetCode.october.week2;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOFLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode duplicate1 = headA;
        ListNode duplicate2 = headB;
        ArrayList<ListNode> list1 = new ArrayList<>();
        ArrayList<ListNode> list2 = new ArrayList<>();

        while (duplicate1 != null){
            list1.add(duplicate1);
            duplicate1 = duplicate1.next;
        }
        while (duplicate2 != null){
            list2.add(duplicate2);
            duplicate2 = duplicate2.next;
        }

        for (ListNode listNode : list1) {
            if (list2.contains(listNode)) {
                return listNode;
            }
        }

        return null;
    }

    public static void main(String[] args) {

    }
}
