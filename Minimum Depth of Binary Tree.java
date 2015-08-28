Solution : need to ensure that the path is from root to leaf, so we need to set return value as MAX_VALUE when the root == null, but it is different when deal with the root, so we need to build another function and then we also need to consider the situation that root.left == null and root.right == null, we should return 1;
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {return 0;}
        return helper(root);
    }
    public int helper(TreeNode root){
        if (root == null) {return Integer.MAX_VALUE;}
        if (root.left == null && root.right == null) {return 1;}
        int left = helper(root.left);
        int right = helper(root.right);
        return Math.min(left,right) + 1;
    }
}
