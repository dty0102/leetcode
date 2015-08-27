Solution : use digit shifting to get the result
public class Solution {
    // you need to treat n as an unsigned value
public static int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1); // n & 1 = 1 means that the last digit in n is 1
            n = n>>>1;// >> is for signed number, >>>> is for unsigned number
        }
        return ones;
    }
}
