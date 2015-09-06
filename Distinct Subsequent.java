public class Solution {
    public int numDistinct(String S, String T) {
        // write your code here
        int n=S.length();
        int m=T.length();
        int f[][]=new int[n+1][m+1];
        for(int i=0;i<=m;i++){
            f[0][i]=0;
        }
          for(int i=0;i<=n;i++){
            f[i][0]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(S.charAt(i)==T.charAt(j)){f[i+1][j+1]=f[i][j]+f[i][j+1];}
                else f[i+1][j+1]=f[i][j+1];
            }
        }
        return f[n][m];
    }
}
