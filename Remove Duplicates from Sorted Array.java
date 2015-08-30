public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 1){return nums.length;}
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[size]){size++;nums[size] = nums[i];}
        }
        return size+1; // can not use size++, because it will return size, not size+1
    }
}
