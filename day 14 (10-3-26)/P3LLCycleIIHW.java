//#142 - Linked List Cycle II

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P3LLCycleIIHW {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null; 
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);    
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head; // create a cycle
        P3LLCycleIIHW solution = new P3LLCycleIIHW();
        ListNode result = solution.detectCycle(head);
        if (result != null) {
            System.out.println("Cycle detected at node with value: " + result.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}