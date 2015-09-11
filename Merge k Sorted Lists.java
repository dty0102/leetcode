 public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        if(lists == null||lists.size() == 0) return null;
        Queue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), ListNodeComparator);
        for(int i=0;i<lists.size();i++){
            if(lists.get(i)!=null) {queue.add(lists.get(i));}
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!queue.isEmpty()){
            ListNode head = queue.poll();
            tail.next=head;
            tail = tail.next;
            if(head.next!=null) {queue.add(head.next);}
        }
        return dummy.next;
    }
    private Comparator<ListNode> ListNodeComparator = new Comparator<ListNode>(){
        public int compare(ListNode left, ListNode right) {
            if (left == null) {
                return 1;
            } else if (right == null) {
                return -1;
            }
            return left.val - right.val;
        }
    };
