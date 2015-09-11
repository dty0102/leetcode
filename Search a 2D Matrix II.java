Solution: start from the left bottom, because the rules, if the item in the left bottom is smaller than the target, move to the next col, if it less than the target, move to the upper row
public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix.length==0){return 0;}
        
        int row=matrix.length-1;
        int col=matrix[0].length-1;
        int i=row;
        int j=0;
        int result=0;
        while(i>=0&&j<=col){
            if(matrix[i][j]==target){return true;}
            else if (matrix[i][j]<target){j++;}
            else if (matrix[i][j]>target){i--;}
        }
        return false;

    }
