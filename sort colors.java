Solution : notred and notblue as two pointers
ublic class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 1){return;}
        int notred = 0;
        int notblue = nums.length - 1;
        int temp = 0;
        int i = 0;
        while(i < nums.length){
            if (nums[i] == 0 && i > notred) {temp = nums[i]; nums[i] = nums[notred];nums[notred] = temp;notred++;}
            else if (nums[i] == 2 && i < notblue){temp = nums[i]; nums[i] = nums[notblue];nums[notblue] = temp;notblue--;}
            else i++;
        }
    }
}
