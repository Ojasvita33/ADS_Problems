// #83 - Remove Duplicates from Sorted List
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class P1RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while(node != null && node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);    
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        P1RemoveDuplicate solution = new P1RemoveDuplicate();
        ListNode result = solution.deleteDuplicates(head);
        System.out.print("Linked list after removing duplicates: ");
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
