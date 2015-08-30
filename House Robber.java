Solution : use dp to solve this problem, pay attention to the relationship between index
public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0 || nums == null){return 0;} 
        if(nums.length == 1){return nums[0];}
        int[] profit = new int[nums.length + 1];
        profit[0] = 0;
        profit[1] = nums[0];
        for(int i = 2; i < profit.length; i++){
            profit[i] = Math.max(nums[i - 1] + profit[i -2], profit[i - 1]);
        }
        return profit[nums.length];
    }
}
