Solution : sliding windows 
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {return 0;}
        int start = 0;
        int end = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= s){
                result = Math.min(result, (end - start + 1));
                sum -= nums[start];
                start++;
            }
            end++;
        }
        if (result == Integer.MAX_VALUE) {return 0;}
        else return result;
    }
}
