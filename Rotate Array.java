Solution : 3 steps reverse, this algorithm is in place 
public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // when k > nums.length
        if(k <= 0 ) {return;}
        reverse(nums,0,nums.length - k - 1); // the boundry is decided by the length-k-1;
        reverse(nums,nums.length - k,nums.length - 1);
        reverse(nums,0,nums.length - 1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
