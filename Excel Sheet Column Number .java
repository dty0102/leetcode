Solution : 
public class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) return 0;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            int cur = s.charAt(i) - 'A' + 1;
            int index = s.length() - 1 - i;
            int pos = 1;
            while(index > 0){
                pos *= 26;
                index --;
            }
            result += pos * cur;
        }
        return result;
    }
}
