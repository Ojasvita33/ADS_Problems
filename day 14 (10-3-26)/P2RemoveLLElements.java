//#203 - Remove Linked List Elements

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P2RemoveLLElements {
    public ListNode removeElement(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);    
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        int valToRemove = 6;
        P2RemoveLLElements solution = new P2RemoveLLElements();
        ListNode result = solution.removeElement(head, valToRemove);
        System.out.print("Linked list after removing elements: ");
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
