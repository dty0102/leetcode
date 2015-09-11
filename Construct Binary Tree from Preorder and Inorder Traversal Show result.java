public class Solution {
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if (preorder.length == 0 || inorder.length == 0) {return null;}
        TreeNode root = helper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        return root;
    }
    private TreeNode helper(int[] preorder, int[] inorder, int prestart, int preend, int instart, int inend){
        if (prestart > preend || instart > inend) {return null;}
        TreeNode root = new TreeNode(preorder[prestart]);
        int index = findindex(inorder, root.val);
        if (index == -1) return null;
        TreeNode left = helper(preorder, inorder, prestart + 1, prestart + index - instart, instart, index - 1);
        TreeNode right = helper(preorder, inorder, prestart + index - instart + 1, preend,index + 1, inend);
        root.left = left;
        root.right =right;
        return root;
    }
    private int findindex(int[] inorder, int val){
        for (int i = 0; i < inorder.length; i++){
            if (inorder[i] == val) return i;
        }
        return -1;
    }
}
