Solution : use binary search
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers == null || numbers.length == 0){return result;}
        int i = 0;
        int j = numbers.length - 1;
        while(i < j ){
            int sum = numbers[i] + numbers[j];
            if(sum > target) {j--;}
            else if (sum < target){i++;}
            else {result[0] = i + 1; result[1] = j + 1; break;}
        }
        return result;
    }
}
