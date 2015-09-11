public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        if(obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0||obstacleGrid[0][0]==1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];
        for (int i = 0; i < m; i++){
            if (obstacleGrid[i][0] == 1) {break;}
            else paths[i][0] = 1;
        }
         for (int i = 0; i < n; i++){
            if (obstacleGrid[0][i] == 1) {break;}
            else paths[0][i] = 1;
        }
        for (int i = 1;i < m; i++) {
            for (int j = 1;j < n;j++){
                if (obstacleGrid[i][j] != 1) {paths[i][j] = paths[i - 1][j] + paths[i][j - 1];}
                else paths[i][j] = 0;
            }
        }
        return paths[m - 1][n - 1];
    }
