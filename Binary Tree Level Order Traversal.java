Solution 1 : use two number to track the number of previous level and current level
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int prevlevel = 1;
        int curlevel = 0;
        while(!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<Integer>();
            while (prevlevel > 0){
                TreeNode cur = queue.poll();
                level.add(cur.val);
                prevlevel--;
                if (cur.left != null) {queue.offer(cur.left); curlevel++;}
                if (cur.right != null) {queue.offer(cur.right); curlevel++;}
            }
            prevlevel = curlevel;
            curlevel = 0;
            result.add(new ArrayList<Integer>(level));
        }
        return result;
    }
}

Solution 2 : because the queue only contains the nodes in one level, so use the size of the queue to track the number of loops
public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList result = new ArrayList();

        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }

        return result;
    }
}
