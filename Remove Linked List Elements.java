public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {return null;}
        if (head.next == null && head.val != val){return head;}
        if (head.next == null && head.val == val){return null;}
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(head.next != null){
            if(head.next.val == val){head.next = head.next.next; continue;}
            else {head = head.next;}
        }
        return dummy.next;
    }
}
