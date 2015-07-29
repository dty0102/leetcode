Solution 1: O(n)
public int findMin(int[] num) {
        int min=num[0];
        int n=num.length;
        for(int i=1;i<n;i++){
            if(num[i]<min){min=num[i];}
        }
        return min;
    }
    
Solution 2 : O(log n)
public int findMin(int[] num) {
        if(num==null) return 0;
        int start=0;
        int end=num.length-1;
        int mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            //condition that the array is not rotated
            if(num[mid]>num[start]&&num[mid]<num[end]) return num[start];
            if(num[mid]>num[start]) start=mid;
            if(num[mid]<num[start]) end=mid;
        }
        if(num[start]>num[end]) return num[end];
        else return num[start];
    }
