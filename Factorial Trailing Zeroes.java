Solution 1: compute factorial for n , but the result will be overflow and exceeds time limit
Solution 2: according to this idea http://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
In order to compute the number of zeros, we need to compute the number of five and two, and the number of five is less than the number of two, so the number of 5 decides the number of zeros
public class Solution {
    public int trailingZeroes(int n) {
        long temp = 5;// if we use int,it will cause wrong answer
        int result = 0;
        while(n/temp >= 1){
            result =result + (int)(n/temp);//need to cast long to int
            temp = temp * 5;
        }
        return result;
    }
}
