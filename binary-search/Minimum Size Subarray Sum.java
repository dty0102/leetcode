Solution1 : O(n) 
use two pointers to point the start and the end of the subarray, when the sum is bigger than target, drop the start value
public int minimumSize(int[] nums, int s) {
        // write your code here
        if (nums == null || nums.length == 0 || s == 0) return -1; // leetcode return 0, lint code return -1
        int first = 0;
        int second = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        while (first < nums.length && second <= first){
            sum += nums[first];
            while(sum >= s){
                result = Math.min(result,first - second + 1);//result is the length of the subarray
                sum -= nums[second];//drop the nums[start]
                second++;
            }
            first++;
        }
        if (result == Integer.MAX_VALUE) return -1;//when there is no such subarray
        else return result;
    }
    
Solution 2 : O(nlogn)
