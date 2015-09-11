public class Solution {
    /**
     *@param inorder : A list of integers that inorder traversal of a tree
     *@param postorder : A list of integers that postorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // write your code here
        if (inorder.length == 0 || postorder.length == 0) {return null; }
        //if (inorder.length == 1 && postorder.length == 1){return new TreeNode(inorder[0]); }
        TreeNode root = helper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
        return root;
    }
    private TreeNode helper(int[] inorder, int[] postorder, int inorderstart, int inorderend, int poststart,int postend) {
        if (inorderstart > inorderend || poststart > postend) {return null;}
        // if (inorderstart == inorderend) {return new TreeNode(inorder[inorderstart]);}
        // if (poststart == postend){return new TreeNode(postorder[poststart]);}
        TreeNode root = new TreeNode(postorder[postend]);
        int index = findroot(root.val,inorder,inorderstart,inorderend);
        if (index == -1) return null;
        TreeNode left = helper(inorder, postorder, inorderstart, index - 1, poststart, poststart + index - inorderstart - 1);
        TreeNode right = helper(inorder, postorder, index + 1, inorderend, poststart + index - inorderstart, postend - 1);
        root.left = left;
        root.right = right;
        return root;
    }
    
   
    private int findroot(int val, int[] inorder,int start, int end){
        for (int i = start; i <= end; i++){
            if (inorder[i] == val) return i;
        }
        return -1;
    }
}
