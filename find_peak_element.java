Solution 1: 
Check every element in the array and then compare it to its neighbors, very stright forward but the time complexity is O(n)
public int findPeakElement(int[] num) {
    if(num.length==1){return 0;}
	if(num[1]<num[0]){return 0;}
	if(num[1]>num[0]&&num.length==2){return 1;}  
	int i=0;
	for(i=1;i<num.length-1;i++){
		if(num[i]>num[i-1]&&num[i]>num[i+1]){break;}
	}
        return i;
    }

Solution 2 :
Consider to use binary search, this one can pass lintcode but can not pass leetcode, because it only considers the condition
that there is a peak element in the middle of the array, does not consider the condition that the peak element can be located
on the edge of the array
public int findPeak(int[] A) {
        // write your code here
        if(A==null||A.length<=2) return 2;
        int start=0;
        int end=A.length-1;
        int mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(A[mid-1]<A[mid]&&A[mid]>A[mid+1]) return mid;
            if(A[mid-1]>A[mid]&&A[mid]>A[mid+1]) end=mid;
            else start=mid;
        }
        if(A[start-1]<A[start]&&A[start]>A[start+1]) return start;
        if(A[end-1]<A[end]&&A[end]>A[end+1]) return end;
        return 0;
    }
    
Solution 3: 
Same algorithm but consider all condition, can pass leetcode
public int findPeakElement(int[] num) {
        // write your code here
        if(num==null||num.length<=1) return 0;
        int start=0;
        int end=num.length-1;
        int mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(num[mid-1]<num[mid]&&num[mid]>num[mid+1]) return mid;
            if(num[mid-1]>num[mid]&&num[mid]>num[mid+1]) end=mid;
            else start=mid;
        }
        if (num[start]>num[start+1]) {
            if (start - 1 == -1) return start;
            else if (num[start - 1] < num[start]) return start;}//when the peak element is on the edge , pay attention to the index
        if (num[end]>num[end - 1]) {
            if (end + 1 == num.length) return end;
            else if (num[end + 1] < num[end]) return end;}
        return 0;
    }

