public class Solution {
    public int addDigits(int num) {
        int result = num;
        while (result >= 10){
            result = 0;
        while(num > 0){
            result += num%10;
            num = num/10;
        }
        num = result;
        }
        return result;
    }
}
