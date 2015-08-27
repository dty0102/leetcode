Solution 1 : not work because the time limit exceeded
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //if(nums.length - k < 0) {return false;}
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j <= i+k && j < nums.length; j++){
                if(nums[i] == nums[j]){return true;}
            }
        }
        return false;
    }
}
Solution 2 :
Use HashSet and window slide for this problem, the hashset only contains k numbers and if there is no duplicate in that window, drop the number which in the front of the window and add the number in the next position
public class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<Integer>();

    for(int i=0;i<nums.length && i<=k;i++){
        if(!set.add(nums[i])){
            return true;
        }
    }

    for(int i=k+1;i<nums.length;i++){
        set.remove(nums[i-k-1]);//drop from the start
        if(!set.add(nums[i])){
            return true;//add a new number
        }
    }
    return false;
}
}
