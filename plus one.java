Solution: pay attention to the situation that the number of digits will be increased
public class Solution {
 public int[] plusOne(int[] digits) {
        // Write your code here
        if (digits == null || digits.length == 0) return digits;
        int carries = 1;
        int[] sum = new int[digits.length];
        for (int i = digits.length - 1; i >= 0; i--){
            sum[i]= (digits[i] + carries) % 10;
            carries = (digits[i] + carries) / 10;
        }
        if (carries == 1){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        else {
            return sum;
        }
    }
}
