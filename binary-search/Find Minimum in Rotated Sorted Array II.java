Solution 1 : O(n)
For case where AL == AM == AR, the minimum could be on AM’s left or right side (eg, [1, 1, 1, 0, 1] or [1, 0, 1, 1, 1]). 
In this case, we could not discard either subarrays and therefore such worst case degenerates to the order of O(n).
public int findMin(int[] num) {
        int min=num[0];
        int n=num.length;
        for(int i=1;i<n;i++){
            if(num[i]<=min){min=num[i];}
        }
        return min;
    }
