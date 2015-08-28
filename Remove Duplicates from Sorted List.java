public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode dummy = head;
        while(head.next != null){
            if(head.val == head.next.val){
                ListNode temp = head.next.next;
                head.next = temp;
            }
            else head = head.next;
        }
        return dummy;
    }
}
