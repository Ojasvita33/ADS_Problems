//#19 - Remove Nth Node From End of List
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
    }
}

public class P5RemoveNthEndHW {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return head;
        }
        int i =1;
        int find = size-n;
        ListNode prev = head;
        while(i<find){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        head = removeNthFromEnd(head, 2); // Remove the 2nd node from the end (value 4)

        System.out.println("After removing 2nd node from end:");
        printList(head);
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}