Solution 1: 
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null) return null;
        if (root == p || root == q){return root;}
        if ((hasnode(root.left,p) && hasnode(root.right,q)) || (hasnode(root.left,q) && hasnode(root.right,p))) {return root;}
        else if (hasnode(root.left,p) && hasnode(root.left, q)) {return lowestCommonAncestor(root.left,p,q);}
        else if (hasnode(root.right,p) && hasnode(root.right, q)) {return lowestCommonAncestor(root.right,p,q);}
        return null;
    }
    public boolean hasnode(TreeNode root, TreeNode p){
        if (root == null) return false;
        else if (root == p) return true;
        else return hasnode(root.left,p) || hasnode(root.right,p);
    }
}

Solution 2:
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        if (root == null || root == A || root == B) {return root;}
        TreeNode left = lowestCommonAncestor(root.left, A, B);
        TreeNode right = lowestCommonAncestor(root.right, A, B);
        if (left != null && right != null){return root;}
        if (left == null && right != null){return right;}
        if (left != null && right == null){return left;}
        return null;
    }
}
