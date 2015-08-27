Solution: 
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area_1 = (A-C)*(B-D);
        int area_2 = (E-G)*(F-H);
        int result = area_1 + area_2;
        int left = Math.max(A,E);
        int bottom = Math.max(B,F);
        int right = Math.min(C,G);
        int top = Math.min(D,H);
        if(left < right && top > bottom) {
            int overlap = (right - left) * (top - bottom);
            result = result - overlap;
        }
        return result;
    }
}
