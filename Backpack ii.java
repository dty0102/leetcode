public int backPackII(int m, int[] A, int V[]) {
        // write your code here
        if(A==null||A.length==0||V.length==0||m==0) return 0;
        int f[][]=new int[A.length+1][m+1];
        //function:A的前i个数中取若干个刚好凑成j的体积时的VALUE
        //intialize
        for(int i=0;i<=A.length;i++){
            f[i][0]=0;
        }
        for(int j=0;j<=m;j++){
            f[0][j]=0;
        }
        f[0][0]=0;
        for(int i=1;i<=A.length;i++){
            for(int j=1;j<=m;j++){
               // if(i==0||j==0) f[i][j]=0;
                if(j-A[i-1]<0) {f[i][j]=f[i-1][j];}
                if(j-A[i-1]>=0){f[i][j]=Math.max(f[i-1][j],f[i-1][j-A[i-1]]+V[i-1]);}
            }
        }
        int result=0;
        for(int i=0;i<=m;i++){
            if(f[A.length][i]>=result) {result=f[A.length][i];}
        }
        return result;
    }
