//可以先sort array然后用两个指针进行遍历，如果结果比target大，则挪动尾指针，如果比target小则挪动头指针，在想要得到index的题目里无法使用这种方法因为Index会被打乱
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length == 0){return result;}
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if (!map.containsKey(target - cur)) {map.put(cur,i+1);}
            else {result[0] = map.get(target - cur); result[1] = i + 1; return result;}
        }
        return result;
    }
}
