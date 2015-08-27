Solution : pay attention to the situation [1,3], there is no range for that array
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if (nums == null || nums.length == 0) return result;
        if (nums.length == 1) {String s = "" + nums[0]; result.add(s);return result;}
        int i = 0;
        int j = 0;
        while(i < nums.length && j < nums.length){
            while(j < nums.length - 1 && nums[j] == nums[j + 1] - 1) {j++;}
            String cur = "";
            if(i == j){cur = cur + nums[i];result.add(cur);i++;j = i;}// there is no range
            else {cur = nums[i] + "->" + nums[j];result.add(cur);i = j + 1;j = i;}
        }
        return result;
    }
}
