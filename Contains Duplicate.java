public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) {return false;}
        HashSet<Integer> table = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(table.contains(nums[i])){return true;}
            else table.add(nums[i]);
        }
        return false;
    }
}
