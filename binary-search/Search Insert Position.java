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
