package dailypractice.LeetCode;

public class singlyLinkedList {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode();
        int size = 0;
        while(current != null){
            size++;
        }
        ListNode result = new ListNode();
        ListNode reversel1 = new ListNode();
        ListNode reversel2 = new ListNode();

        for(int i = 0; i< size; i++){
            reversel2.val = l1.val;
        }
        return result;
    }

    public static void main(String[] args) {
        singlyLinkedList sol = new singlyLinkedList();
        ListNode l1 = new ListNode(2);
        ListNode li2 = new ListNode(4);
        ListNode li3 = new ListNode(3);
        l1.next = li2;
        li2.next = li3;
        ListNode l2 = new ListNode(5);
        ListNode li4 = new ListNode(6);
        ListNode li5 = new ListNode(4);
        li4.next = li4;
        l2.next = li5;
        sol.addTwoNumbers(l1,l2);

    }
}

class ListNode  {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }

    public ListNode() {

    }
}
