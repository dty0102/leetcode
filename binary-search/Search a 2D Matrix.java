Solution 1 : O(n + m)
first of all, find out which row the target is located and then search in that row
public boolean searchMatrix(int[][] matrix, int target) {
	        int size=matrix.length;
	        int n=matrix[0].length-1;
	        for(int i=0;i<size;i++){
	            if(matrix[i][0]<=target&&target<=matrix[i][n]){
	                for(int j=0;j<=n;j++){
	                    if(matrix[i][j]==target){return true;}
	                }
	             
	            }
	        }
	        return false;
	    }

Solution 2 : O(log n + log m)
The same idea as solution 1, instead of searching every row, use binary search to find the last element in A[i][0] that 
smaller or equal to target, and then use binary search in that row to find target 
public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length==0){return false;}
        int start=0;
        int end=matrix.length-1;
        int mid;
        int rownumber=0;
         while(start + 1 < end){
            mid= start+(end-start)/2;
            if(matrix[mid][0] == target) return true;
            if(matrix[mid][0] < target) start = mid;
            if(matrix[mid][0] > target) end = mid;
        }
        if(matrix[end][0]<=target){rownumber=end;}
        else if(matrix[start][0]<=target){rownumber=start;}
        start=0;
        end=matrix[0].length-1;
        mid=0;
        while(start + 1 < end){
            mid= start+(end-start)/2;
            if(matrix[rownumber][mid] == target) return true;
            if(matrix[rownumber][mid] < target) start = mid;
            if(matrix[rownumber][mid] > target) end = mid;
        }
        if(matrix[rownumber][start]==target){return true;}
        else if(matrix[rownumber][end]==target){return true;}
        else return false;
    }
