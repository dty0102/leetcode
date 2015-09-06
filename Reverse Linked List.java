Solution 1 :
public class Solution {
    public ListNode reverseList(ListNode head) {
        // write your code here
        if(head==null||head.next==null) return head;
        ListNode dummy=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=dummy;
            dummy=head;
            head=temp;
        }
        return dummy;
    }
}

Solution 2 : recursively 
public class Solution {
    public ListNode reverse(ListNode head, ListNode prev) {
        if(head == null) return prev;

        ListNode newHead = reverse(head.next, head);
        head.next = prev;
        return newHead;
    }
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
}
