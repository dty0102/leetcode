public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {return "";}
        if (strs.length == 1) {return strs[0];}
        String pre = strs[0];
        for(int i = 1; i < strs.length; i++){
            pre = compare(pre,strs[i]);
        }
        return pre;
    }
    public String compare(String pre, String s){
        int len1 = pre.length();
        int len2 = s.length();
        int len = Math.min(len1,len2);
        int i = 0;
        for(i = 0; i < len; i++){
            if (pre.charAt(i) != s.charAt(i)) {break;}
        }
        return pre.substring(0,i);
    }
}
