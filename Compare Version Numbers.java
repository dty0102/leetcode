public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\."); // use \\. to present the number of . >= 0, not use'.' but use "."
        int len = Math.max(v1.length,v2.length);
        int ver1 = 0;
        int ver2 = 0;
        for(int i = 0; i < len; i++){
            if(v1.length > i) {ver1 = Integer.parseInt(v1[i]);}// if version1 does not have this digit, then it means zero
            else ver1 = 0;
            if(v2.length > i) {ver2 = Integer.parseInt(v2[i]);}
            else ver2 = 0; 
            if(ver1 > ver2) {return 1;}
            else if (ver1 < ver2) {return -1;}
        }
        return 0;
}
}
