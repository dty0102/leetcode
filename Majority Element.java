Solution 1 : straight forward solution, but time complexity is O(nlogn)
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

Solution 2 : use hashmap to remember the frequency of those integers, this will cost extra O(n) space
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){map.put(nums[i],map.get(nums[i])+1);}
            else map.put(nums[i],1);
        }
        for(Integer cur: map.keySet()){
            if(map.get(cur) > nums.length/2) {return cur;}
        }
        return -1;
    }
}

Solution 3 : use Moore's voting algorithm, this algorithm will only cost O(n) time and O(1) space
public class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0){major = nums[i];count++;}
            else {
                if(nums[i] == major){count++;}
                else count--;
            }
        }
        return major;
    }
}

Solution 4 : it can also be solved by using count bits
public int majorityElement(int[] num) {
    int ret = 0;
    for (int i = 0; i < 32; i++) {
        int ones = 0, zeros = 0;
        for (int j = 0; j < num.length; j++) {
            if ((num[j] & (1 << i)) != 0) {
                ++ones;
            }
            else
                ++zeros;
        }
        if (ones > zeros)
            ret |= (1 << i);
    }
    return ret;
}
