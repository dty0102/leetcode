Binary Tree Level Order Traversal II 
Solution: the same as Binary Tree Level Order Traversal I, the difference is adding each level to the front of the result
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {return result;}
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int prevlevel = 1;
        int curlevel = 0;
        while (!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<Integer>();
            while(prevlevel > 0){
                TreeNode cur = queue.poll();
                level.add(cur.val);
                prevlevel--;
                if(cur.left != null){queue.offer(cur.left); curlevel++;}
                if(cur.right != null){queue.offer(cur.right); curlevel++;}
            }
            prevlevel = curlevel;
            curlevel = 0;
            result.add(0,level);
        }
        return result;
    }
}
