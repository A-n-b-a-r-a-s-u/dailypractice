package dailypractice.LeetCode.june.week2;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode trav1 = l1;
        ListNode trav2 = l2;
        ListNode traverse = ans;
        int carry =0;

        while (trav1 != null || trav2 != null || carry != 0){
            int val1 = (trav1 != null)? trav1.val : 0;
            int val2 = (trav2 != null)? trav2.val : 0;

            int cur = val1 + val2 + carry;
            traverse.val = cur % 10;
            cur /= 10;
            carry = cur;

            trav1 = (trav1 != null) ? trav1.next : null;
            trav2 = (trav2 != null) ? trav2.next : null;

            if (trav1 != null || trav2 != null || carry != 0) {
                traverse.next = new ListNode();
                traverse = traverse.next;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ListNode l1 =  new ListNode(1);
        ListNode c1 =l1;
        ListNode t1 = new ListNode(2);
        c1.next = t1;
        c1 = c1.next;
        ListNode t2 = new ListNode(3);
        c1.next = t2;


        ListNode l2 =  new ListNode(3);
        ListNode c2 = l2;
        ListNode t3 = new ListNode(4);
        c2.next = t3;
        c2 = c2.next;
        ListNode t4 = new ListNode(5);
        c2.next = t4;

        ListNode a = addTwoNumbers(l1, l2);
        while (a != null){
            System.out.println(a.val);
            a = a.next;
        }

    }
}

/*

List<Integer> ans = new LinkedList<>();
        l1 = l1.reversed();
        l2 = l2.reversed();
        int i1 = 0, i2 =0, res;
        for (int i =0; i< l1.size(); i++){
            i1 = i1 * 10 + (int) l1.get(i);
        }
        for (int i =0; i< l2.size(); i++){
            i2 = i2 * 10 + (int) l2.get(i);
        }
        res = i1 + i2;
        while (res != 0){
            ans.add(res % 10);
            res /= 10;
        }
        return ans;
 */