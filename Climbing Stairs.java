Solution: use dp to solve it, build an array to store the number of ways to step i
public class Solution {
    public int climbStairs(int n) {
        if(n <= 1) {return 1;}
        int[] step = new int[n + 1];
        step[0] = 1;
        step[1] = 1;
        for(int i = 2; i < step.length; i++){
            step[i] = step[i - 1] + step[i - 2];
        }
        return step[n];
    }
}
