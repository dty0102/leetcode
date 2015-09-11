public class Solution {
    public int findPeakElement(int[] A) {
        // write your code here
        // write your code here
        if(A==null||A.length<=1) return 0;
        int start=0;
        int end=A.length-1;
        int mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(A[mid-1]<A[mid]&&A[mid]>A[mid+1]) return mid;
            if(A[mid-1]>A[mid]&&A[mid]>A[mid+1]) end=mid;
            else start=mid;
        }
        if (A[start]>A[start+1]) {
            if (start - 1 == -1) return start;
            else if (A[start - 1] < A[start]) return start;}
        //if(num[start-1]<num[start]&&num[start]>num[start+1]) return start;
        //if(num[end-1]<num[end]&&num[end]>num[end+1]) return end;
        if (A[end]>A[end - 1]) {
            if (end + 1 == A.length) return end;
            else if (A[end + 1] < A[end]) return end;}
        return 0;
    }
}
