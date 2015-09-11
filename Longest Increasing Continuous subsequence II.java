public class Solution {
    /**
     * @param A an integer matrix
     * @return  an integer
     */
     //four directions
 public int[] xMove = {1, 0, 0, -1};
 public int[] yMove = {0, 1, -1, 0};
 public int longestIncreasingContinuousSubsequenceII(int[][] A) {
 // Write your code here
 if(A == null || A.length == 0) return 0;
 int[][] dp = new int[A.length][A[0].length];
 int max = 0;
 for(int i = 0; i < A.length; i++){
     for(int j = 0; j < A[0].length; j++){
       if(max < findMaxPath(A, i, j, dp)){
          max = findMaxPath(A, i, j, dp);}
      }
  }
 return max + 1;
 }

 private int findMaxPath(int[][] A, int x, int y, int[][] dp){
 if(dp[x][y] != 0){
     return dp[x][y];
 }
 //dp[] stores the max path starts from i,j
 for(int i = 0; i < 4; i++){
     if(check(A, x + xMove[i], y + yMove[i])){
         if(A[x + xMove[i]][y + yMove[i]] < A[x][y]){
             if(dp[x][y] < findMaxPath(A, x + xMove[i], y + yMove[i], dp) + 1){
                 dp[x][y] = findMaxPath(A, x + xMove[i], y + yMove[i], dp) + 1;
              }
          }
      }
 }

 return dp[x][y];
 }

 private boolean check(int[][] A, int x, int y){
 if(x >= 0 && x < A.length && y >= 0 && y < A[0].length){
 return true;
 }

 return false;
 }
}
