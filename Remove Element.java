public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if(len == 0) return 0;
        int i = 0;
        int j = len - 1;
        int result = len;
        //while(j >= 0 && nums[j] == val){j--;result--;}
        while(i <= j){
            while(j >= 0 && nums[j] == val){j--;result--;}
            if(nums[i] == val && i <= j){swap(nums,i,j);result--;j--;}
            i++;
        }
        return result;
    }
    public void swap(int[] nums,int i, int j){
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
        return;
    }
}
