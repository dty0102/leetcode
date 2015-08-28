public class Solution {
    boolean isBST = true;
    public boolean isBalanced(TreeNode root) {
        //int max = 0;
        int temp = helper(root);
        return isBST;
    }
    public int helper(TreeNode root){
        if (root == null) {return 0;}
        int left = helper(root.left);
        int right = helper(root.right);
        if (Math.abs(left - right) > 1) {isBST = false;}
        return Math.max(left,right) + 1;
    }
}
