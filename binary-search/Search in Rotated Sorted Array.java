Solution 1 : O(n)
public int search(int[] A, int target) {
        int result=-1;
        int n=A.length;
        for(int i=0;i<n;i++){
            if(A[i]==target){result=i;}
        }
        return result;
        
    }
    
Solution 2 :O(log n)
public int search(int[] A, int target) {
        // write your code here
        if(A==null||A.length==0) return -1;
        int start=0;
        int end=A.length-1;
        int mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(A[mid]==target) return mid;
            if(A[mid]>A[start]){
                if(A[mid]>target&&target>=A[start]) {end=mid;}
                else {start=mid;}
            }
            else{
                if(A[mid]<A[start]){
                    if(A[mid]<target&&target<=A[end]) {start=mid;}
                    else {end=mid;}
                }
            }
        }
        if(A[start]==target) return start;
        if(A[end]==target) return end;
        return -1;
    }
