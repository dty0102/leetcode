Solution : because we only access to the node that will be deleted, so we replace this node by the node next to it, and when node.next.next == null, let node.next = null to end the list
public class Solution {
    public void deleteNode(ListNode node) {
        // write your code here
        if (node == null) return;
        while (node.next != null){
            node.val = node.next.val;
            if (node.next.next == null){node.next = null;}//node = null 并不能让node的前一位指向null，而只是将node指针指向了空
            else {node = node.next;}
        }
        return;
    }
}
