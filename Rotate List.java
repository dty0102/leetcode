Solution 1 :
public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null || k == 0) return head;
        ListNode dummy = head;
        if (head.next == null) return head;
        ListNode index = findk(head,k);
       // ListNode result = null;
        if (index == null) return dummy;
        ListNode result = reverse(index,dummy);
        return result;
    }
    private ListNode reverse(ListNode index,ListNode dummy){
        ListNode head = index.next;
        ListNode result =head;
        while (head != null && head.next != null){
            head = head.next;
        }
        head.next = dummy;
        index.next = null;
        return result;
    }
    private ListNode findk(ListNode head,int k){
        ListNode dummy = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        while (dummy != null) {
            len ++;
            dummy = dummy.next;
        }
        while(k >= len) {k = k % 10;}
        for (int i = 0;i < k ; i++){
            if (fast.next !=null) fast = fast.next;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
