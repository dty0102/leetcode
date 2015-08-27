Solution 1 :
we can reverse the linked list and compare it with the original ont, but this will cost extra space O(n) because we need to copy the whole linked list
Solution 2 : we do not need to build a new linked list, we just change the way how it connects with the nodes, it will not cost extra space
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){return true;}
        ListNode mid = findmid(head);
        ListNode midnext = mid.next;
        ListNode rev = reverse(midnext);
        while(rev!= null && head!=null){
            if(rev.val != head.val){return false;}
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) {return head;}
        ListNode dummy = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = dummy;
            dummy = head;
            head = temp;
        }
        return dummy;
    }
    public ListNode findmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next; // be careful of the original position of those two pointers
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null){fast = fast.next;}
        }
        return slow;
    }
}
