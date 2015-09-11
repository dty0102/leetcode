Solution: use dynamic programming to solve this problem, build up an array of boolean, presents that the ith position can be jumped into or not
 public boolean canJump(int[] A) {
        // wirte your code here
        if(A==null||A.length==0) return false;
        int len=A.length;
        boolean[] paths=new boolean[len];
        paths[0]=true;
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
               if(paths[j]&&A[j]+j>=i) {paths[i]=true; break;  }
            }
        }
        return paths[len-1];
    }
