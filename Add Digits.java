Solution 1 : staright forward solution, just trivial
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
Solution 2 : use the function of digit root https://en.wikipedia.org/wiki/Digital_root
public class Solution {
    public int addDigits(int num) {
        return num - 9 * ((num - 1)/9);
    }
}
