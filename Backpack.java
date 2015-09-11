    public int backPack(int m, int[] A) {
        // write your code here
        if(A==null||A.length==0) return 0;
        int len=A.length;
        boolean f[][]=new boolean[len+1][m+1];
        //Intialize
        for(int i=0;i<=len;i++){
            f[i][0]=true;
        }
        for(int j=0;j<=m;j++){
            f[0][j]=false;
        }
        f[0][0] = true;
        //function
        for(int i=1;i<=len;i++){
            for(int j=1;j<=m;j++){
                //if(j>=A[i]) f[i+1][j]=f[i][j-A[i]];
                if(j>=A[i - 1]&&f[i - 1][j-A[i - 1]]) f[i][j]=true;
                else f[i][j]=f[i - 1][j];
                //f[i][j] = f[i - 1][j - 1] || f[i - 1][j - A[i-1]];
            }
        }
        for(int j=m;j>=0;j--){
            if(f[len][j]) return j;
        }
        return 0;
