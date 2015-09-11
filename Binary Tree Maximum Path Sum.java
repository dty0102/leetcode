public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    private class resultType{
        int singlepath;
        int maxpath;
        resultType(int singlepath,int maxpath){
            this.singlepath=singlepath;
            this.maxpath=maxpath;
        }
    }
    private resultType helper(TreeNode root){
        if(root==null) return new resultType(0,Integer.MIN_VALUE);
        //Divide
        resultType left=helper(root.left);
        resultType right=helper(root.right);
        //conquer
        int singlepath=Math.max(left.singlepath,right.singlepath)+root.val;
        singlepath=Math.max(singlepath,0);
        int maxpath=Math.max(left.maxpath,right.maxpath);
        maxpath=Math.max(left.singlepath+right.singlepath+root.val,maxpath);
        return new resultType(singlepath,maxpath);
        
    }
    public int maxPathSum(TreeNode root) {
        // write your code here
        resultType result=helper(root);
        return result.maxpath;
    }
}
