//#141 - Linked List Cycle

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
    val = x;
    next = null;
    }
}

public class P3LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);    
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = head; // create a cycle
            boolean result = hasCycle(head);
            System.out.println("Does the linked list have a cycle? " + result);
    }
}