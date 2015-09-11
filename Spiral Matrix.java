Soution : start to change the element on the outside, and then change the number of loop for the inner side
public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<Integer>();
    if (matrix.length == 0 || matrix[0].length == 0) {return res;}
    int left = 0, right = matrix[0].length - 1;
    int top = 0, bottom = matrix.length - 1;
    int tag = 0, row = top, col = left;
    // int m = 0;
    for (int m = 0; m < matrix.length * matrix[0].length; m++) {
        if (tag == 0) {
            res.add(matrix[row][col]);
            if (col == right) {
                tag = 1;
                top++;
                row = top;
            } else {col++;}
        } else if (tag == 1) {
            res.add(matrix[row][col]);
            if (row == bottom) {
                tag = 2;
                right--;
                col = right;
            } else {row++;}
        } else if (tag == 2) {
            res.add(matrix[row][col]);
            if (col == left) {
                tag = 3;
                bottom--;
                row = bottom;
            } else {col--;}
        } else {
            res.add(matrix[row][col]);
            if (row == top) {
                tag = 0;
                left++;
                col = left;
            } else {row--;}
        }
    }
    return res;
}
