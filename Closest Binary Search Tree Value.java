Solution : use two global variable to track the diff and the closet value, when the new difference less than it, change the two global variable, for the recursion, we can devide it to four situation and then use the function itself to compute it
public class Solution {
      double diff = Double.MAX_VALUE;
      int closetVal = -1;
  public int closestValue(TreeNode root, double target) {
     double newDiff = Math.abs(target-root.val);
     if(diff > newDiff){
        diff = newDiff;
        closetVal = root.val;
    }
    if(root.left==null && root.right==null) return closetVal;
    if(root.left==null && root.right != null) return closestValue(root.right, target);
    else if(root.right==null && root.left != null) return closestValue(root.left, target);
    else{
        if(root.val<target) return closestValue(root.right, target);
        else return closestValue(root.left, target);
    }
}
}
