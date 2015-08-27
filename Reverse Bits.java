Solution : use digit shifting to solve this problem
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res= n & 1;
        for(int i=1;i<=31;i++)
        {
            n=n>>1; //right shift
            res=res<<1; //left shift
            res=res | (n & 1);// add the last digit of n
        }
        return res;

    }
}
