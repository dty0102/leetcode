Solution 1: 
check all element , O(n)
public int searchInsert(int[] A, int target) {
        int i=0;
        while(A[i]<target){
            i++;
            if(i>=A.length){return A.length;}
        }
        if(i==0){return 0;}
        else{
            return i;
        }
    }
    
Solution 2 :
use binary search, O(log n)
public int searchInsert(int[] A, int target) {
        if(A==null||A.length==0) return 0;
        int start=0; 
        int size=A.length;
        int end=size-1;
        int mid;
        if(A[0]>target) return 0;
        if(A[size-1]<target) return size;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(A[mid]<target) start=mid;
            else end=mid;
        }
        if(A[start]>=target) return start;
        if(A[end]>=target) return end;
        return 0;
    }
