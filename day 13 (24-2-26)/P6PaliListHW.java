//#234 - Palindrome Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P6PaliListHW {
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){
            return true;
        }
        ListNode midNode = findMid(head);

        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;
        while(right != null){
            if(left.val != right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public ListNode findMid(ListNode head){
        ListNode slow =  head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);    
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        P6PaliListHW solution = new P6PaliListHW();
        boolean result = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}