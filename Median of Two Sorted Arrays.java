Solution: drop the unused half array element, like the binary search
public double findMedianSortedArrays(int[] A, int[] B) {
        // write your code here
        if(A==null||B==null) return 0;
        int Alen=A.length;
        int Blen=B.length;
        int len=Alen+Blen;
        if(len%2==0)
        return (findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0, len / 2 + 1)) / 2.0 ;
        else return findKth(A,0,B,0,(len/2)+1);
    }
    //find the Kth number in the sorted array
    private double findKth(int[] A, int Astart,int[] B, int Bstart, int k){
        int Asize=A.length;
        int Bsize=B.length;
        int A_key;
        int B_key;
        //when one of the array is empty
        if(Astart>=Asize){return B[Bstart+k-1];}
        if(Bstart>=Bsize){return A[Astart+k-1];}
        if(k==1){return Math.min(A[Astart],B[Bstart]);}
        //when the index is bigger than the length of the array
        if(Astart+k/2-1<A.length) A_key=A[Astart+k/2-1];
        else A_key=Integer.MAX_VALUE;
        if(Bstart+k/2-1<B.length) B_key=B[Bstart+k/2-1];
        else B_key=Integer.MAX_VALUE;
        //use recursion to find the kth value
        if(A_key<=B_key) return findKth(A,Astart+k/2,B,Bstart,k-k/2);
         else return findKth(A,Astart,B,Bstart+k/2,k-k/2);
        
    }
