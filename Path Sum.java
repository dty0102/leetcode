Solution : divide and conquer, pay attention to the situation that the root.val == sum should return false, because it needs to be the path from root to leaf, so we should not use if (root.val == sum) return true;
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {return false;}
        boolean result = false;
        if (root.left != null && root.right != null) {result = hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);}
        else if (root.left != null && root.right == null){result = hasPathSum(root.left,sum - root.val);}
        else if (root.left == null && root.right != null){result = hasPathSum(root.right,sum - root.val);}
        else result = (root.val == sum);
        return result;
    }
}
