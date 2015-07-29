Solution 1 : O(log n )
Use binary search, consider the number n as an array from 0 to n, then use binary search to find the sqrt(x)
pay attention to the data type, the start and end should use long type because using int can cause overflow
return type should be casted to int 
public int mySqrt(int x) {
        long start = 1;
        long end = x; 
        while (start + 1 < end){
            long mid = start + (end - start)/2;
            if (mid * mid == x) return (int)mid;
            else if (mid * mid < x) {start = mid;}
            else end = mid;
        }
        if (end * end <= x) return (int)end;
        if (start * start <= x) return (int)start;
        return 0;
    }
