public class Solution {
        private char [][] temp = null;
    public int numIslands(char [][] grid) {
        // Write your code here
        if (grid == null || grid.length == 0) return 0;
        int result = 0;
        temp = grid;
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[0].length;j++){
                if(temp[i][j] == '1') {remove(temp,i,j);result++;}
            }
        }
        return result;
    }
    private void remove(char[][] grid, int i, int j){
        grid[i][j] = '0';
        if (i - 1 >= 0){
            if (grid[i - 1][j] == '1') {remove(grid,i-1,j);}
            //grid[i - 1][j] = false;
        }
        if (j - 1 >= 0){
            if (grid[i][j - 1] == '1') {remove(grid,i,j - 1);}
            //grid[i][j - 1] = false;
        }
        if (i + 1 < grid.length){
            if (grid[i + 1][j] == '1') {remove(grid,i+1,j);}
            //grid[i + 1][j] = false;
        }
        if (j + 1 < grid[0].length){
            if (grid[i][j + 1] == '1') {remove(grid,i,j + 1);}
            //grid[i][j + 1] = false;
        }
        return;
    }
}
