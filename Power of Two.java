Solution: 
If the number is power of 2, like 8, the first digit should be 1 and the rest of them should be 0, n = 8(1000) n - 1 = 7 (0111).So n & (n-1) = 0 and make sure that n > 0
public class Solution {
    public boolean isPowerOfTwo(int n) {
        // write your code here
        if( n <= 0) {return false;}
        return (n & n-1) == 0;
    }
}
