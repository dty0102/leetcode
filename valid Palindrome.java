Solution: pay attention to the situation that the string contains " ", and the lower and upper case. Use replaceAll to remove all non alphanumeric characters
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        if(s == null || s.length() <= 1) {return true;}
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if (s.charAt(i) != s.charAt(j)) {return false;}
            i++;
            j--;
        }
        return true;
    }
}
