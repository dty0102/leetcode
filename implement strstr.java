Solution : Brute force time ： O(n2)
public class Solution {
 public int strStr(String source, String target) {
        //write your code here
        if(source==null||target==null) return -1;
        int i=0;
        int j=0;
        for(i=0;i<source.length()-target.length()+1;i++){
            for(j=0;j<target.length();j++){
                if(source.charAt(i+j)!=target.charAt(j)) {break;}
                
            }
            if(target.length()==j) return i;
        }
        return -1;
    }
}
Solution 2 : KMP 
Solution 3 : boyer- moore algorithm 
