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
