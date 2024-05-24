package Medium;

// 2. Add Two Numbers

// Runtime: 1ms, 100%
// Memory: 44.20 MB, 75.57%

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode((l1.val + l2.val) % 10);
        ListNode currentNode = result;
        int add = l1.val + l2.val >= 10 ? 1 : 0;

        while (l1.next != null || l2.next != null || add == 1) {
            int a = 0;
            int b = 0;

            if (l1.next != null) {
                a = l1.next.val;
                l1 = l1.next;
            }
            
            if (l2.next != null) {
                b = l2.next.val;
                l2 = l2.next;
            }

            ListNode nextNode = new ListNode((a + b + add) % 10);
            currentNode.next = nextNode;
            currentNode = currentNode.next;

            if (a + b + add >= 10) {
                add = 1;
            }
            else {
                add = 0;
            }
        }

        return result;
        
    }

}
