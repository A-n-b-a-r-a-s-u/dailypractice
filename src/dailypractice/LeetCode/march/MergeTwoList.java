package dailypractice.LeetCode.march;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
class LinkedList{
    ListNode head ;
    public void insert(int data){
        ListNode node = new ListNode();
        node.val = data;
        node.next = null;
        if (head == null) {
            head = node;
        }
        else {
            ListNode n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public ListNode getHead() {
        return head;
    }
}

public class MergeTwoList {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode traverse = result;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val) {
                traverse.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else {
                traverse.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            traverse = traverse.next;
        }
        if (list1 != null){
            traverse.next = list1;
        }
        if (list2 != null){
            traverse.next = list2;
        }
        return result.next;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(4);
        LinkedList l2 = new LinkedList();
        l2.insert(1);
        l2.insert(3);
        l2.insert(4);

        ListNode r = mergeTwoLists(l1.getHead(), l2.getHead());
        while (r != null){
            System.out.println(r.val);
            r = r.next;
        }
    }
}
