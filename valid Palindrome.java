Solution 1 : pay attention to the situation that the string contains " ", and the lower and upper case. Use replaceAll to remove all non alphanumeric characters
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
Solution 2 : do not use the toLowercase function
    public boolean isPalindrome(String s) {
        // Write your code here
        if (s == null || s.length() <= 1) {return true;}
        s = s.replaceAll("[^a-zA-Z0-9]",""); ///!!!!!可以用replaceAll来将不符合的char消去
        int start = 0;
        int end = s.length() - 1;
        while(start < end) {
            if (s.charAt(start) == s.charAt(end) || s.charAt(start) == s.charAt(end) + 32 || s.charAt(start) == s.charAt(end) - 32) {start++; end--;}
            else return false;
        }
        return true;
    }
