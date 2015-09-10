Solution : binary search
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A.length==0){return 0;}
        int start=0;
        int end=A.length-1;
        int mid=0;
        if(A[start]>target){return 0;}
        if(A[end]<target){return A.length;}
        while(start+1<end){
            mid=start+(end-start)/2;
            if(A[mid]==target){return mid;}
            if(A[mid]>target){end=mid;}
            if(A[mid]<target){start=mid;}
        }
        if(A[start]>=target){return start;}
        if(A[end]>=target){return end;}
        return 0;
    }
