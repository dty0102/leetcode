public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if (root == null){return result;}
        helper(root,result,"");
        return result;
    }
    public void helper(TreeNode root, List<String> result, String s){
        if (root == null) return;
        if (s.length() == 0) {s += root.val;}
        else {s += "->" + root.val;}
        if (root.left != null){helper(root.left,result,s);}
        if (root.right != null){helper(root.right,result,s);}
        if (root.left == null && root.right == null){result.add(s);}
    }
}
