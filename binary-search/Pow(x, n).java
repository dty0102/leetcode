Solution 1: O(n)--can not pass 
 public double myPow(double x, int n) {
        double result = 1;
        while(n > 0){
            result *= x;
            n--;
        }
        return result;
    }
    
Solution 2 : O(log n)
Use binary search and recursion, in order to compute pow(x,n), compute pow(x, n/2) first
Pay attention to the condition that n < 0
public double myPow(double x, int n) {
        if (n == 0) return 1;
        double result = 1;
        double half = myPow(x,n/2);
        if (n % 2 == 0) {result = half * half;}
        else if (n > 0) {result = half * half * x;}
        else result = half * half / x;
        return result;
    }
